package com.spamalot.boardgame.ataxx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

final class AtaxxMoveFactory {
  private AtaxxMoveFactory() {
  }

  /** Logger for this class. */
  private static final Logger logger = LoggerFactory.getLogger(AtaxxMoveFactory.class);

  static Move create(final int rank, final int file, final int rankDelta, final int fileDelta) {
    if (rankDelta == 2 || rankDelta == -2 || fileDelta == 2 || fileDelta == -2) {
      logger.debug("Jump");
      return new AtaxxJumpMove(rank, file, rankDelta, fileDelta);
    }
    logger.debug("Grow");
    return new AtaxxGrowMove(rank + rankDelta, file + fileDelta);
  }
}
