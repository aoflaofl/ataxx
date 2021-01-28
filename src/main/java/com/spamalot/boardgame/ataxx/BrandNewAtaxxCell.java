package com.spamalot.boardgame.ataxx;

import java.util.*;
import com.spamalot.boardgame.board.Cell;

public class BrandNewAtaxxCell implements Cell<BrandNewAtaxxPiece> {

  BrandNewAtaxxPiece piece;

  private List<BrandNewAtaxxCell> growToCells = new ArrayList<>();
  private List<BrandNewAtaxxCell> jumpToCells = new ArrayList<>();

  public List<BrandNewAtaxxCell> getGrowToCells() {
    return this.growToCells;
  }

  public List<BrandNewAtaxxCell> getJumpToCells() {
    return this.jumpToCells;
  }

  public String getCellName() {
    return this.cellName;
  }

  private String cellName;

  public BrandNewAtaxxCell(String cellName) {
    this.cellName = cellName;
  }

  @Override
  public void setPiece(BrandNewAtaxxPiece p) {
    this.piece = p;
  }

  @Override
  public BrandNewAtaxxPiece getPiece() {
    return this.piece;
  }

  @Override
  public boolean isEmpty() {
    return this.piece == null;
  }

  @Override
  public void removePiece() {
    this.piece = null;
  }

  void addGrowToCell(BrandNewAtaxxCell cell) {
    this.growToCells.add(cell);
  }

  void addJumpToCell(BrandNewAtaxxCell cell) {
    this.jumpToCells.add(cell);
  }

}
