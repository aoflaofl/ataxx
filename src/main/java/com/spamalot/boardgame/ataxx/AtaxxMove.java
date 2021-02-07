package com.spamalot.boardgame.ataxx;

import com.spamalot.boardgame.moves.Move;

abstract class AtaxxMove implements Move<AtaxxCell> {
  AtaxxCell fromCell;
  AtaxxCell toCell;

  @Override
  public AtaxxCell getFromCell() {
    return this.fromCell;
  }

  @Override
  public AtaxxCell getToCell() {
    return this.toCell;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    if (this.fromCell != null) {
      sb.append(this.fromCell.getCellName());
    }
    sb.append(this.toCell.getCellName());
    return sb.toString();
  }
}
