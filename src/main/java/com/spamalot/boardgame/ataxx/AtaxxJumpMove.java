package com.spamalot.boardgame.ataxx;

class AtaxxJumpMove extends AbstractAtaxxMove {

  AtaxxJumpMove(final AtaxxCell fromCell, final AtaxxCell toCell) {
    this.fromCell = fromCell;
    this.toCell = toCell;
  }
}
