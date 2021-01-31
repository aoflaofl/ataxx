package com.spamalot.boardgame.ataxx;

import com.spamalot.boardgame.pieces.Color;
import com.spamalot.boardgame.pieces.Piece;

class AtaxxPiece implements Piece {
  private Color color;

  public AtaxxPiece(Color c) {
    this.color = c;
  }

  @Override
  public void setColor(Color c) {
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
