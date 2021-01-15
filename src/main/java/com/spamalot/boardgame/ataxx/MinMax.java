package com.spamalot.boardgame.ataxx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

class MinMax {
  /**
   * Logger for this class
   */
  private static final Logger logger = LoggerFactory.getLogger(MinMax.class);

  public void moveList(Position p, int depth) {
    if (depth == 0) {
      return;
    }

    List<Move> moves = p.getLegalMoves();

    if (moves.isEmpty()) {
      return;
    }
    for (Move m : moves) {
      p.makeMove(m);
      p.printMoves();
      p.undoLastMove();
    }
  }

  public int minMax(Position p, int depth) {

    if (depth == 0) {
      return p.evaluate();
    }

    List<Move> moves = p.getLegalMoves();

    if (moves.isEmpty()) {
      return p.evaluate();
    }

    int eval = Integer.MIN_VALUE;
    for (Move m : moves) {
      p.makeMove(m);
      eval = Math.max(eval, -minMax(p, depth - 1));
      p.undoLastMove();
    }
    return eval;
  }
}
