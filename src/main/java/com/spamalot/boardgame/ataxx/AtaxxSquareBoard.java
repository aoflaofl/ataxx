package com.spamalot.boardgame.ataxx;

import com.spamalot.boardgame.pieces.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class AtaxxSquareBoard extends AbstractAtaxxBoard {
  /** Logger for this class. */
  static final Logger logger = LoggerFactory.getLogger(AtaxxSquareBoard.class);

  private final AtaxxCell[][] board = new AtaxxCell[7][7];
  private final Color colorToMove;

  @Override
  public List<AtaxxMove> getLegalMoves() {
    Set<AtaxxMove> moveList = new HashSet<>();

    for (int rank = 0; rank < 7; rank++) {
      for (int file = 0; file < 7; file++) {
        AtaxxCell cell = this.board[rank][file];
        if (!cell.isEmpty() && cell.getPiece().getColor() == this.colorToMove) {
          logger.info(cell.getCellName());
          moveList.addAll(moveList(cell));
        }
      }
    }
    return new ArrayList<>(moveList);
  }

  public AtaxxSquareBoard() {
    buildBoard();

    this.colorToMove = Color.WHITE;

    this.board[0][0].setPiece(new AtaxxPiece(Color.WHITE));
    this.board[6][6].setPiece(new AtaxxPiece(Color.WHITE));
    this.board[6][0].setPiece(new AtaxxPiece(Color.BLACK));
    this.board[0][6].setPiece(new AtaxxPiece(Color.BLACK));
  }

  private void buildBoard() {
    for (int rank = 0; rank < 7; rank++) {
      for (int file = 0; file < 7; file++) {
        this.board[rank][file] = new AtaxxCell(getCellName(rank, file));
      }
    }

    for (int rank = 0; rank < 7; rank++) {
      for (int file = 0; file < 7; file++) {
        initCellLinks(rank, file);
      }
    }
  }

  private static String getCellName(int rank, int file) {
    StringBuilder sb = new StringBuilder();
    sb.append((char) ('a' + file));
    sb.append(rank + 1);
    return sb.toString();
  }

  private void initCellLinks(int rank, int file) {
    int targetRank;
    int targetFile;

    for (int rankDelta = -2; rankDelta <= 2; rankDelta++) {
      targetRank = rank + rankDelta;
      if (targetRank >= 0 && targetRank < 7) {
        for (int fileDelta = -2; fileDelta <= 2; fileDelta++) {
          if (rankDelta != 0 || fileDelta != 0) {

            targetFile = file + fileDelta;
            if (targetFile >= 0 && targetFile < 7) {
              addCellLink(rank, file, rankDelta, fileDelta);

            }
          }
        }
      }
    }
  }

  private void addCellLink(int rank, int file, int rankDelta, int fileDelta) {
    if (rankDelta == 2 || rankDelta == -2 || fileDelta == 2 || fileDelta == -2) {
      this.board[rank][file].addJumpToCell(this.board[rank + rankDelta][file + fileDelta]);
    } else {
      this.board[rank][file].addGrowToCell(this.board[rank + rankDelta][file + fileDelta]);
    }
  }

  @Override
  public int evaluate() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    for (int rank = 6; rank >= 0; rank--) {
      sb.append(rank + 1).append(" ");
      for (int file = 0; file < 7; file++) {
        sb.append(this.board[rank][file]);
      }
      sb.append('\n');
    }
    sb.append("  ");
    for (int i = 0; i < 7; i++) {
      sb.append((char) ('a' + i));
    }
    return sb.toString();
  }
}
