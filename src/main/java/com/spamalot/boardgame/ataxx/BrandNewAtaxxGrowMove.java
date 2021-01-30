package com.spamalot.boardgame.ataxx;

class BrandNewAtaxxGrowMove implements BrandNewAtaxxMove {

  private final AtaxxCell toCell;

  public BrandNewAtaxxGrowMove(AtaxxCell toCell) {
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
