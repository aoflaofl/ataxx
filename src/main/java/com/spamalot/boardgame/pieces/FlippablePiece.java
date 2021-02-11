package com.spamalot.boardgame.pieces;

public class FlippablePiece extends PieceImpl implements Flippable {

  public FlippablePiece(Color c) {
    super(c);
  }

  @Override
  public void flip() {
    this.color = this.color.opposite;
  }
}
