package com.spamalot.boardgame.ataxx;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.spamalot.boardgame.board.Move;
import com.spamalot.boardgame.board.Position;

class AtaxxPosition implements Position {
  /** Logger for this class. */
  private static final Logger logger = LoggerFactory.getLogger(AtaxxPosition.class);

  private final Color[][] board = new Color[7][7];
  private final Color colorToMove;
  private final Deque<Move> movesMade = new ArrayDeque<>();

  AtaxxPosition() {
    this.colorToMove = Color.WHITE;
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

  @Override
  public void makeMove(final Move m) {
    if (m instanceof AtaxxJumpMove) {
      pickUpPiece(m.getFromRank(), m.getFromFile());
    }
    putDownPiece(m.getToRank(), m.getToFile());
    this.movesMade.push(m);
    logger.info("MoveList: {}", this.movesMade);
  }

  private void pickUpPiece(final int fromRank, final int fromFile) {
    // TODO Do validation here.
    this.board[fromRank][fromFile] = null;
  }

  @Override
  public void printMoves() {
    // TODO Auto-generated method stub

  }

  public void printPosition() {

    logger.info("\n{}", this);
  }

  private void putDownPiece(final int toRank, final int toFile) {
    this.board[toRank][toFile] = this.colorToMove;
  }

  @Override
  public String toString() {
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
    return sb.toString();
  }

  @Override
  public void undoLastMove() {
    Move m = this.movesMade.pop();
    pickUpPiece(m.getToRank(), m.getToFile());
    if (m instanceof AtaxxJumpMove) {
      putDownPiece(m.getFromRank(), m.getFromFile());
    }
  }

}
