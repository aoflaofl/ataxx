package com.spamalot.boardgame.ataxx;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class MinMax {
  /** Logger for this class. */
  private static final Logger logger = LoggerFactory.getLogger(MinMax.class);

  public void moveList(final Position p, final int depth) {
    logger.debug("Making move tree.");
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

  public int minMax(final Position p, final int depth) {

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
