package com.spamalot.boardgame.ataxx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class AtaxxGrowMove extends AbstractAtaxxMove implements Move {
  /** Logger for this class. */
  private static final Logger logger = LoggerFactory.getLogger(AtaxxGrowMove.class);

  private final int toFile;
  private final int toRank;

  private final String toSquareName;

  public AtaxxGrowMove(int rank, int file) {
    logger.debug("Making a grow move.");
    this.toRank = rank;
    this.toFile = file;

    this.toSquareName = makePrintSquare(this.toRank, this.toFile);
  }

  @Override
  public String toString() {
    return "AtaxxGrowMove [toFile=" + this.toFile + ", toRank=" + this.toRank + ", toSquareName=" + this.toSquareName
        + "]";
  }
}
