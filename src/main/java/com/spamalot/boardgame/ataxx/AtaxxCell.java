package com.spamalot.boardgame.ataxx;

import com.spamalot.boardgame.board.Cell;
import java.util.ArrayList;
import java.util.List;

class AtaxxCell implements Cell<AtaxxPiece> {

  private AtaxxPiece piece;

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

  public AtaxxCell(String cellName) {
    this.cellName = cellName;
  }

  @Override
  public void setPiece(AtaxxPiece p) {
    this.piece = p;
  }

  @Override
  public AtaxxPiece getPiece() {
    return this.piece;
  }

  @Override
  public boolean isEmpty() {
    return this.piece == null;
  }

  @Override
  public AtaxxPiece removePiece() {
    AtaxxPiece ret = this.piece;
    this.piece = null;
    return ret;
  }

  void addGrowToCell(AtaxxCell cell) {
    this.growToCells.add(cell);
  }

  void addJumpToCell(AtaxxCell cell) {
    this.jumpToCells.add(cell);
  }

}
