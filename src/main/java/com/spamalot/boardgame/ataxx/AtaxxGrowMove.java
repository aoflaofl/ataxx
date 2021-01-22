package com.spamalot.boardgame.ataxx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class AtaxxGrowMove extends AbstractAtaxxMove {
  /** Logger for this class. */
  private static final Logger logger = LoggerFactory.getLogger(AtaxxGrowMove.class);

  private final int toFile;
  private final int toRank;

  private final String toSquareName;

  AtaxxGrowMove(final int rank, final int file) {
    if (rank < 0 || rank > 6 || file < 0 || file > 6) {
      throw new IllegalArgumentException(String.format("One or more argument is out of range: [rank=%d, file=%d]", rank, file));
    }
    logger.debug("Making a grow move.");
    this.toRank = rank;
    this.toFile = file;

    this.toSquareName = makePrintSquare(this.toRank, this.toFile);
  }

  @Override
  public int getFromFile() {
    throw new UnsupportedOperationException();
  }

  @Override
  public int getFromRank() {
    throw new UnsupportedOperationException();
  }

  @Override
  public int getToFile() {
    return this.toFile;
  }

  @Override
  public int getToRank() {
    return this.toRank;
  }

  @Override
  public String toString() {
    return "AtaxxGrowMove [toFile=" + this.toFile + ", toRank=" + this.toRank + ", toSquareName=" + this.toSquareName
        + "]";
  }

}
