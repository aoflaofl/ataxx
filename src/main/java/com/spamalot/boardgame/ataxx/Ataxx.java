package com.spamalot.boardgame.ataxx;

import com.spamalot.boardgame.ai.MinMax;

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
    AtaxxPosition game = new AtaxxPosition();
    logger.info("Position:\n{}", game);
    game.getLegalMoves();
    //MinMax<AtaxxPosition, AtaxxMove> searcher = new MinMax<>();
    // searcher.moveList(game, 1);
  }
}
