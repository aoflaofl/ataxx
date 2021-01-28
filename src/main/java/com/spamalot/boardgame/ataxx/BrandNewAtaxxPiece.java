package com.spamalot.boardgame.ataxx;

import com.spamalot.boardgame.pieces.Color;
import com.spamalot.boardgame.pieces.Piece;

public class BrandNewAtaxxPiece implements Piece {
  Color color;

  public BrandNewAtaxxPiece(Color c) {
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

}