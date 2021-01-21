package com.spamalot.boardgame.ataxx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class AtaxxPosition implements Position {
  /** Logger for this class. */
  private static final Logger logger = LoggerFactory.getLogger(AtaxxPosition.class);

  private final Color[][] board = new Color[7][7];
  private Color colorToMove;
  private Stack<Move> movesMade = new Stack<>();

  @Override
  public List<Move> getLegalMoves() {
    Set<Move> moves = new HashSet<>();
    for (int rank = 0; rank < 7; rank++) {
      for (int file = 0; file < 7; file++) {
        if (this.board[rank][file] == this.colorToMove) {
          moves.addAll(generateMovesForPiece(rank, file));
        }
      }
    }
    return new ArrayList<>(moves);
  }

  /**
   * Generate list of moves for a piece. Assume square at rank and file contains a
   * piece.
   * 
   * @param rank rank of square with piece
   * @param file file with square with piece
   * @return
   */
  private Set<Move> generateMovesForPiece(final int rank, final int file) {
    Set<Move> moves = new HashSet<>();
    int targetRank;
    int targetFile;
    for (int rankDelta = -2; rankDelta <= 2; rankDelta++) {
      targetRank = rank + rankDelta;
      if (targetRank >= 0 && targetRank < 7) {
        for (int fileDelta = -2; fileDelta <= 2; fileDelta++) {
          if (rankDelta == 0 && fileDelta == 0) {
            continue;
          }
          targetFile = file + fileDelta;
          if (targetFile >= 0 && targetFile < 7 && this.board[targetRank][targetFile] == null) {
            moves.add(AtaxxMoveFactory.create(rank, file, rankDelta, fileDelta));
          }
        }
      }
    }
    return moves;
  }

  @Override
  public void makeMove(final Move m) {
    if (m instanceof AtaxxJumpMove) {
      pickPiece(m.getFromRank(), m.getFromFile());
    }
    putPiece(m.getToRank(), m.getToFile());
    movesMade.push(m);
    logger.info("MoveList: {}", movesMade);
  }

  private void pickPiece(int fromRank, int fromFile) {
    // TODO Do validation here.
    board[fromRank][fromFile] = null;
  }

  private void putPiece(int toRank, int toFile) {
    board[toRank][toFile] = colorToMove;
  }

  @Override
  public void undoLastMove() {
    // TODO Auto-generated method stub

  }

  AtaxxPosition() {
    colorToMove = Color.WHITE;
    this.board[0][0] = Color.BLACK;
    this.board[6][6] = Color.BLACK;
    this.board[6][0] = Color.WHITE;
    this.board[0][6] = Color.WHITE;
  }

  @Override
  public int evaluate() {
    // TODO Auto-generated method stub
    return 0;
  }

  public void printPosition() {
    StringBuilder sb = new StringBuilder();
    int rank = 7;
    for (int h = 0; h < 7; h++) {
      sb.append(rank + " ");
      rank--;
      for (int w = 0; w < 7; w++) {
        sb.append(this.board[h][w] == null ? " . " : this.board[h][w] == Color.BLACK ? " x " : " o ");
      }
      sb.append('\n');
    }
    sb.append("  ");
    for (char i = 'a'; i < 'h'; i++) {
      sb.append(" " + i + " ");
    }
    sb.append("\nMove: ").append(this.colorToMove);
    logger.info("\n{}", sb);
  }

  @Override
  public void printMoves() {
    // TODO Auto-generated method stub

  }

}
