package com.spamalot.boardgame.ataxx;

import com.spamalot.boardgame.moves.Move;
import java.util.ArrayList;
import java.util.List;

abstract class AtaxxMove implements Move<AtaxxCell> {
  /** Move from cell. */
  private AtaxxCell fromCell;
  /** Move to cell. */
  private AtaxxCell toCell;

  @Override
  public AtaxxCell getFromCell() {
    return this.fromCell;
  }

  @Override
  public AtaxxCell getToCell() {
    return this.toCell;
  }

  @Override
  public void setFromCell(final AtaxxCell c) {
    this.fromCell = c;
  }

  @Override
  public void setToCell(final AtaxxCell c) {
    this.toCell = c;
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

  /** Cells with pieces that have been flipped due to the move. */
  private final List<AtaxxCell> flippedCells = new ArrayList<>();

  public final void addFlipCell(final AtaxxCell cell) {
    this.flippedCells.add(cell);
  }

  public final List<AtaxxCell> getFlippedCells() {
    return this.flippedCells;
  }
}
