package com.spamalot.boardgame.ataxx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class AtaxxGrowMove extends AbstractAtaxxMove {
  /** Logger for this class. */
  private static final Logger logger = LoggerFactory.getLogger(AtaxxGrowMove.class);

  private final int toFile;
  private final int toRank;

  @Override
  public int getToRank() {
    return toRank;
  }

  @Override
  public int getToFile() {
    return toFile;
  }

  private final String toSquareName;

  AtaxxGrowMove(final int rank, final int file) {
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

  @Override
  public int getFromRank() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int getFromFile() {
    // TODO Auto-generated method stub
    return 0;
  }

}
