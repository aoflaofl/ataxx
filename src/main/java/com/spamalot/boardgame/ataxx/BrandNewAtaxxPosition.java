package com.spamalot.boardgame.ataxx;

import java.util.List;
import com.spamalot.boardgame.board.Move;
import com.spamalot.boardgame.board.Position;
import com.spamalot.boardgame.pieces.Color;

public class BrandNewAtaxxPosition implements Position {
  BrandNewAtaxxCell[][] board = new BrandNewAtaxxCell[7][7];
  private Color colorToMove;

  @Override
  public List<Move> getLegalMoves() {
    // TODO Auto-generated method stub
    return null;
  }

  public BrandNewAtaxxPosition() {
    for (int rank = 0; rank < 7; rank++) {
      for (int file = 0; file < 7; file++) {
        this.board[rank][file] = new BrandNewAtaxxCell(rank, file);
      }
    }

    for (int rank = 0; rank < 7; rank++) {
      for (int file = 0; file < 7; file++) {
        initCellLinks(rank, file);
      }
    }

    this.colorToMove = Color.WHITE;

    this.board[0][0].setPiece(new BrandNewAtaxxPiece(Color.BLACK));
    this.board[6][6].setPiece(new BrandNewAtaxxPiece(Color.BLACK));
    this.board[6][0].setPiece(new BrandNewAtaxxPiece(Color.WHITE));
    this.board[0][6].setPiece(new BrandNewAtaxxPiece(Color.WHITE));
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
      board[rank][file].addJumpToCell(board[rank + rankDelta][file + fileDelta]);
    } else {
      board[rank][file].addGrowToCell(board[rank + rankDelta][file + fileDelta]);
    }
  }

  @Override
  public void makeMove(Move m) {
    // TODO Auto-generated method stub

  }

  @Override
  public void undoLastMove() {
    // TODO Auto-generated method stub

  }

  @Override
  public int evaluate() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public void printMoves() {
    // TODO Auto-generated method stub

  }

}
