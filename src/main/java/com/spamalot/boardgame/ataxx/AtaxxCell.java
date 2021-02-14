package com.spamalot.boardgame.ataxx;

import com.spamalot.boardgame.board.Cell;
import com.spamalot.boardgame.pieces.FlippablePiece;
import java.util.ArrayList;
import java.util.List;

class AtaxxCell implements Cell<FlippablePiece> {

  private FlippablePiece piece;

  private final List<AtaxxCell> growToCells = new ArrayList<>();
  private final List<AtaxxCell> jumpToCells = new ArrayList<>();

  public List<AtaxxCell> getGrowToCells() {
    return this.growToCells;
  }

  public List<AtaxxCell> getJumpToCells() {
    return this.jumpToCells;
  }

  public String getCellName() {
    return this.cellName;
  }

  private final String cellName;

  AtaxxCell(final String name) {
    this.cellName = name;
  }

  @Override
  public void putDownPiece(final FlippablePiece p) {
    this.piece = p;
  }

  @Override
  public FlippablePiece getPiece() {
    return this.piece;
  }

  @Override
  public boolean isEmpty() {
    return this.piece == null;
  }

  @Override
  public FlippablePiece pickUpPiece() {
    FlippablePiece ret = this.piece;
    this.piece = null;
    return ret;
  }

  void addGrowToCell(final AtaxxCell cell) {
    this.growToCells.add(cell);
  }

  void addJumpToCell(final AtaxxCell cell) {
    this.jumpToCells.add(cell);
  }

  @Override
  public String toString() {
    if (this.piece != null) {
      return this.piece.toString();
    }
    return ".";
  }
}
