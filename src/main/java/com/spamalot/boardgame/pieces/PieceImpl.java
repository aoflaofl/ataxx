package com.spamalot.boardgame.pieces;

class PieceImpl implements Piece {

  /**
   * The color.
   */
  private Color color;

  PieceImpl(final Color c) {
    this.setColor(c);
  }

  @Override
  public Color getColor() {
    return this.color;
  }

  @Override
  public String toString() {
    return this.color.toString();
  }

  public final void setColor(final Color c) {
    this.color = c;
  }
}
