package com.spamalot.boardgame.ataxx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {
  /**
   * Logger for this class
   */
  private static final Logger logger = LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {
    logger.info("Ataxx");
    AtaxxPosition game = new AtaxxPosition();
    game.printPosition();
    MinMax searcher = new MinMax();
    searcher.moveList(game, 1);
  }
}
