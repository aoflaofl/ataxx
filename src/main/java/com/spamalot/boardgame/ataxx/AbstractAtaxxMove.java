package com.spamalot.boardgame.ataxx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

abstract class AbstractAtaxxMove {
  /**
   * Logger for this class
   */
  private static final Logger logger = LoggerFactory.getLogger(AbstractAtaxxMove.class);

  protected final String makePrintSquare(int rank, int file) {
    int printRank = 7 - rank;
    char f = (char) ('a' + file);
    return f + "" + printRank;
  }

}
