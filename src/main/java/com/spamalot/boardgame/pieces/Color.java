package com.spamalot.boardgame.pieces;

public enum Color {
  WHITE("o"),
  BLACK("x");

  static {
    WHITE.opposite = BLACK;
    BLACK.opposite = WHITE;
  }

  private Color opposite;
  private final String display;

  Color(final String c) {
    this.display = c;
  }

  Color getOpposite() {
    return this.opposite;
  }

  @Override
  public String toString() {
    return this.display;
  }
}
