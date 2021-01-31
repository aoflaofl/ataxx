package com.spamalot.boardgame.ai;

import com.spamalot.boardgame.board.Move;
import com.spamalot.boardgame.board.Position;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinMax<P extends Position<M>, M extends Move<?>> {
  /** Logger for this class. */
  private static final Logger logger = LoggerFactory.getLogger(MinMax.class);

  public void moveList(final P p, final int depth) {
    if (depth == 0) {
      logger.info("Position:\n{}", p);
      return;
    }

    List<M> moves = p.getLegalMoves();

    if (moves.isEmpty()) {
      logger.info("Position:\n{}", p);
      return;
    }
    for (M m : moves) {
      p.makeMove(m);
      p.printMoves();
      moveList(p, depth - 1);
      p.undoLastMove();
    }
  }

  public int minMax(final P p, final int depth) {

    if (depth == 0) {
      return p.evaluate();
    }

    List<M> moves = p.getLegalMoves();

    if (moves.isEmpty()) {
      return p.evaluate();
    }

    int eval = Integer.MIN_VALUE;
    for (M m : moves) {
      p.makeMove(m);
      eval = Math.max(eval, -minMax(p, depth - 1));
      p.undoLastMove();
    }
    return eval;
  }
}
