package com.spamalot.boardgame.ataxx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.spamalot.boardgame.board.Move;

abstract class AbstractAtaxxMove implements Move {
  /** Logger for this class. */
  private static final Logger logger = LoggerFactory.getLogger(AbstractAtaxxMove.class);

  protected static final String makePrintSquare(final int rank, final int file) {
    logger.debug("Making a square name.");
    StringBuilder sb = new StringBuilder();
    sb.append((char) ('a' + file));
    sb.append(7 - rank);
    return sb.toString();
  }

}