package com.spamalot.boardgame.pieces;

class PieceImpl implements Piece {

  protected Color color;

  public PieceImpl(final Color c) {
    this.color = c;
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