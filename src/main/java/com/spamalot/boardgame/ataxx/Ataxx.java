package com.spamalot.boardgame.ataxx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Play a game of Ataxx.
 *
 */
public final class Ataxx {
  /** Logger for this class. */
  private static final Logger logger = LoggerFactory.getLogger(Ataxx.class);

  /**
   * Start here.
   * 
   * @param args The arguments
   */
  public static void main(final String[] args) {
    logger.info("Ataxx");
    // AtaxxPosition game = new AtaxxPosition();
    // game.printPosition();
    // MinMax searcher = new MinMax();
    // searcher.moveList(game, 1);
    AtaxxPosition pos = new AtaxxPosition();
    pos.getLegalMoves();
  }
}
