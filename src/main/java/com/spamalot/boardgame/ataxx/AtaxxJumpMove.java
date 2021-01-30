package com.spamalot.boardgame.ataxx;

class AtaxxJumpMove implements AtaxxMove {

  private final AtaxxCell fromCell;
  private final AtaxxCell toCell;

  public AtaxxJumpMove(AtaxxCell fromCell, AtaxxCell toCell) {
    this.fromCell = fromCell;
    this.toCell = toCell;
  }

  @Override
  public AtaxxCell getFromCell() {
    return this.fromCell;
  }

  @Override
  public AtaxxCell getToCell() {
    return this.toCell;
  }

}
