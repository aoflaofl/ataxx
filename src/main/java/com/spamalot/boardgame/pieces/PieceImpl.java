package com.spamalot.boardgame.pieces;

public class PieceImpl implements Piece {

  protected Color color;

  public PieceImpl() {
    super();
  }

  @Override
  public Color getColor() {
    return this.color;
  }

  @Override
  public String toString() {
    return this.color.toString();
  }

}