package com.spamalot.boardgame.board;

import com.spamalot.boardgame.pieces.Color;

public class Board {

  protected Color colorToMove = Color.WHITE;

  protected final void switchColor() {
    if (this.colorToMove == Color.WHITE) {
      this.colorToMove = Color.BLACK;
    } else {
      this.colorToMove = Color.WHITE;
    }
  }

  public final Color getColorToMove() {
    return this.colorToMove;
  }

  public final void setColorToMove(final Color c) {
    this.colorToMove = c;
  }
}
