package com.spamalot.boardgame.ataxx;

class AtaxxGrowMove implements AtaxxMove {

  private final AtaxxCell toCell;

  public AtaxxGrowMove(AtaxxCell toCell) {
    this.toCell = toCell;
  }

  @Override
  public AtaxxCell getFromCell() {
    return null;
  }

  @Override
  public AtaxxCell getToCell() {
    return this.toCell;
  }

}
