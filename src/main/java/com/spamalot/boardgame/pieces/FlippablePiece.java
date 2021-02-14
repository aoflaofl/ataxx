package com.spamalot.boardgame.pieces;

public final class FlippablePiece extends PieceImpl implements Flippable {

  /**
   * A piece that can flip between two colors. Think Reversi.
   * 
   * @param c initial color
   */
  public FlippablePiece(final Color c) {
    super(c);
  }

  @Override
  public void flip() {
    this.setColor(this.getColor().getOpposite());
  }
}
