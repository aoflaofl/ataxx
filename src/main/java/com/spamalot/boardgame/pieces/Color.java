package com.spamalot.boardgame.pieces;

public enum Color {
  /** Black. */
  BLACK('x'),
  /** White. */
  WHITE('o');

  static {
    WHITE.opposite = BLACK;
    BLACK.opposite = WHITE;
  }

  /** How to display this color. */
  private final char display;
  /** The opposite color. */
  private Color opposite;

  Color(final char c) {
    this.display = c;
  }

  Color getOpposite() {
    return this.opposite;
  }

  @Override
  public String toString() {
    return "" + this.display;
  }
}
