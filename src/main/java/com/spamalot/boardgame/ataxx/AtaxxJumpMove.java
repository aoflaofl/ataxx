package com.spamalot.boardgame.ataxx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class AtaxxJumpMove extends AbstractAtaxxMove {
  /** Logger for this class. */
  private static final Logger logger = LoggerFactory.getLogger(AtaxxJumpMove.class);

  private final int fromFile;
  private final int fromRank;
  private final int toFile;
  private final int toRank;

  private final String fromSquareName;
  private final String toSquareName;

  AtaxxJumpMove(final int rank, final int file, final int rankDelta, final int fileDelta) {
    logger.debug("Making a jump move.");

    this.fromRank = rank;
    this.fromFile = file;
    this.toRank = rank + rankDelta;
    this.toFile = file + fileDelta;

    this.fromSquareName = makePrintSquare(rank, file);
    this.toSquareName = makePrintSquare(this.toRank, this.toFile);
  }

  @Override
  public String toString() {
    return "AtaxxJumpMove [fromFile=" + this.fromFile + ", fromRank=" + this.fromRank + ", toFile=" + this.toFile
        + ", toRank=" + this.toRank + ", fromSquareName=" + this.fromSquareName + ", toSquareName=" + this.toSquareName
        + "]";
  }

  @Override
  public int getToRank() {
    return toRank;
  }

  @Override
  public int getToFile() {
    return toFile;
  }

  @Override
  public int getFromRank() {
    return fromRank;
  }

  @Override
  public int getFromFile() {
    return fromFile;
  }
}
