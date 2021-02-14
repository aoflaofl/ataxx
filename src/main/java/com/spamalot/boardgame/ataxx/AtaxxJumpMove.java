package com.spamalot.boardgame.ataxx;

class AtaxxJumpMove extends AtaxxMove {

  AtaxxJumpMove(final AtaxxCell fromCell, final AtaxxCell toCell) {
    this.setFromCell(fromCell);
    this.setToCell(toCell);
  }
}
