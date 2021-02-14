package com.spamalot.boardgame.ai;

import com.spamalot.boardgame.board.Position;
import com.spamalot.boardgame.moves.Move;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinMax<P extends Position<M>, M extends Move<?>> {
  /** Logger for this class. */
  private static final Logger LOG = LoggerFactory.getLogger(MinMax.class);

  /**
   * List All the moves to a depth.
   * 
   * @param p     Position
   * @param depth How deep to search
   */
  public void moveList(final P p, final int depth) {
    if (depth != 0) {
      List<M> moves = p.getLegalMoves();

      if (!moves.isEmpty()) {
        for (M m : moves) {
          p.makeMove(m);
          moveList(p, depth - 1);
          p.undoLastMove();
        }
        return;
      }
    }
    p.printMoves();
    LOG.info("Position:\n{}", p);
  }

  /**
   * MinMax the position.
   * 
   * @param p     Position
   * @param depth How many levels to search
   * @return The evaluation of the position. TODO: This needs to be an object.
   */
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
