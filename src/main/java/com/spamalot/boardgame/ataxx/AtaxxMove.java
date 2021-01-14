package com.spamalot.boardgame.ataxx;

public class AtaxxMove implements Move {
  private Type moveType;
  private int fromFile;
  private int fromRank;
  private int toFile;
  private int toRank;

  private String fromSquareName;
  private String toSquareName;

  public AtaxxMove(int rank, int file, int rankDelta, int fileDelta) {
    fromRank = rank;
    fromFile = file;
    toRank = rank + rankDelta;
    toFile = file + fileDelta;

    moveType = AtaxxMove.Type.GROW;
    if (rankDelta == 2 || rankDelta == -2 || fileDelta == 2 || fileDelta == -2) {
      moveType = AtaxxMove.Type.JUMP;
    }

    int printRank = 7 - rank;
    char f = (char) ('a' + file);
    fromSquareName = f + "" + printRank;

    int printFile = file + fileDelta;
    printRank = 6 - (rank + rankDelta) + 1;

    f = (char) ('a' + printFile);
    toSquareName = f + "" + printRank;
  }

  @Override
  public String toString() {
    return "AtaxxMove [moveType=" + moveType + ", fromFile=" + fromFile + ", fromRank=" + fromRank + ", toFile="
        + toFile + ", toRank=" + toRank + ", from=" + fromSquareName + ", to=" + toSquareName + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + fromFile;
    result = prime * result + fromRank;
    result = prime * result + ((moveType == null) ? 0 : moveType.hashCode());
    result = prime * result + toFile;
    result = prime * result + toRank;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    AtaxxMove other = (AtaxxMove) obj;
    if (fromFile != other.fromFile) {
      return false;
    }
    if (fromRank != other.fromRank) {
      return false;
    }
    if (moveType != other.moveType) {
      return false;
    }
    if (toFile != other.toFile) {
      return false;
    }
    if (toRank != other.toRank) {
      return false;
    }
    return true;
  }

  public enum Type {
    JUMP, GROW
  }
}
