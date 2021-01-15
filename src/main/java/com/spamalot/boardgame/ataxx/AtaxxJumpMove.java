package com.spamalot.boardgame.ataxx;

class AtaxxJumpMove extends AbstractAtaxxMove implements Move {
  private final int fromFile;
  private final int fromRank;
  private final int toFile;
  private final int toRank;

  private final String fromSquareName;
  private final String toSquareName;

  public AtaxxJumpMove(int rank, int file, int rankDelta, int fileDelta) {
    fromRank = rank;
    fromFile = file;
    toRank = rank + rankDelta;
    toFile = file + fileDelta;

    int printRank;
    char f;
    fromSquareName = makePrintSquare(rank, file);

    int printFile = file + fileDelta;
    printRank = 6 - (rank + rankDelta) + 1;

    f = (char) ('a' + printFile);
    toSquareName = f + "" + printRank;
  }

  @Override
  public String toString() {
    return "AtaxxMove [fromFile=" + fromFile + ", fromRank=" + fromRank + ", toFile=" + toFile + ", toRank=" + toRank
        + ", from=" + fromSquareName + ", to=" + toSquareName + "]";
  }
}
