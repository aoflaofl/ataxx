package com.spamalot.boardgame.pieces;

public class FlippablePiece extends PieceImpl implements Flippable {
  public FlippablePiece(final Color c) {
    this.color = c;
  }

  @Override
  public void flip() {
    this.color = this.color.opposite;
  }
}
