package com.spamalot.boardgame.ataxx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class AtaxxGrowMove extends AbstractAtaxxMove implements Move {
  private final int toFile;
  private final int toRank;
  private final String toSquareName;

  @Override
  public String toString() {
    return "AtaxxGrowMove [toFile=" + this.toFile + ", toRank=" + this.toRank + ", toSquareName=" + this.toSquareName + "]";
  }

  /**
   * Logger for this class
   */
  private static final Logger logger = LoggerFactory.getLogger(AtaxxGrowMove.class);

  public AtaxxGrowMove(int rank, int file) {
    this.toRank = rank;
    this.toFile = file;

    this.toSquareName = makePrintSquare(this.toRank, this.toFile);
  }

}
