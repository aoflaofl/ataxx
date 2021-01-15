package com.spamalot.boardgame.ataxx;

class AtaxxMoveFactory {
  Move create(int rank, int file, int rankDelta, int fileDelta) {
    if (rankDelta == 2 || rankDelta == -2 || fileDelta == 2 || fileDelta == -2) {
      System.out.println("Making Jump Move");

      return new AtaxxJumpMove(rank, file, rankDelta, fileDelta);
    }
    System.out.println("Making Grow Move");

    return new AtaxxGrowMove(rank + rankDelta, file + fileDelta);
  }
}
