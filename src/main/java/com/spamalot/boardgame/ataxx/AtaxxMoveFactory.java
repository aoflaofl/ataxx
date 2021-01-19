package com.spamalot.boardgame.ataxx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class AtaxxMoveFactory {
  /**
   * Logger for this class
   */
  private static final Logger logger = LoggerFactory.getLogger(AtaxxMoveFactory.class);

  static Move create(int rank, int file, int rankDelta, int fileDelta) {
    if (rankDelta == 2 || rankDelta == -2 || fileDelta == 2 || fileDelta == -2) {
      logger.debug("Jump");
      return new AtaxxJumpMove(rank, file, rankDelta, fileDelta);
    }
    logger.debug("Grow");
    return new AtaxxGrowMove(rank + rankDelta, file + fileDelta);
  }
}
