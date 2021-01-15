package com.spamalot.boardgame.ataxx;

public class AtaxxMoveFactory {
  public Move create(int rank, int file, int rankDelta, int fileDelta) {
    if (rankDelta == 2 || rankDelta == -2 || fileDelta == 2 || fileDelta == -2) {
      return new AtaxxJumpMove(rank, file, rankDelta, fileDelta);
    }
    return new AtaxxGrowMove(rank + rankDelta, file + fileDelta);
  }
}
