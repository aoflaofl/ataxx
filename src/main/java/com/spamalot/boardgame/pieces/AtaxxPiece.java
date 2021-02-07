package com.spamalot.boardgame.pieces;

public class AtaxxPiece implements Piece {
  private final Color color;

  public AtaxxPiece(final Color c) {
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
