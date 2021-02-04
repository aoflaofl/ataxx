package com.spamalot.boardgame.ataxx;

import com.spamalot.boardgame.ai.MinMax;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Play a game of Ataxx.
 *
 */
public final class Ataxx {
  private Ataxx() {
    throw new UnsupportedOperationException();
  }

  /** Logger for this class. */
  private static final Logger LOG = LoggerFactory.getLogger(Ataxx.class);

  /**
   * Start here.
   * 
   * @param args The arguments
   */
  public static void main(final String[] args) {
    LOG.info("Ataxx");
    AtaxxSquareBoard game = new AtaxxSquareBoard();
    LOG.info("Position:\n{}", game);
    MinMax<AtaxxSquareBoard, AtaxxMove> searcher = new MinMax<>();
    searcher.moveList(game, 3);
  }
}
