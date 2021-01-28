package com.spamalot.boardgame.ataxx;

import com.spamalot.boardgame.pieces.Color;
import com.spamalot.boardgame.pieces.Piece;

public class AtaxxPiece implements Piece {
  private Color color;

  @Override
  public void setColor(Color c) {
    this.color = c;
  }

  @Override
  public Color getColor() {
    return color;
  }

}
