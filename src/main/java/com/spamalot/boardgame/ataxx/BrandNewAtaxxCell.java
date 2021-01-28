package com.spamalot.boardgame.ataxx;

import java.util.*;
import com.spamalot.boardgame.board.Cell;

public class BrandNewAtaxxCell implements Cell<BrandNewAtaxxPiece> {

  BrandNewAtaxxPiece piece;

  private List<BrandNewAtaxxCell> growToCells = new ArrayList<>();
  private List<BrandNewAtaxxCell> jumpToCells = new ArrayList<>();

  private int rank;

  public List<BrandNewAtaxxCell> getGrowToCells() {
    return growToCells;
  }

  public List<BrandNewAtaxxCell> getJumpToCells() {
    return jumpToCells;
  }

  public int getRank() {
    return rank;
  }

  public int getFile() {
    return file;
  }

  public String getCellName() {
    return cellName;
  }

  private int file;
  private String cellName;

  public BrandNewAtaxxCell(int rank, int file) {
    this.rank = rank;
    this.file = file;

    StringBuilder sb = new StringBuilder();
    sb.append((char) ('a' + file));
    sb.append(7 - rank);
    this.cellName = sb.toString();

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
