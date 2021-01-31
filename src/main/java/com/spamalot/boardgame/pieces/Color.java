package com.spamalot.boardgame.pieces;

public enum Color {
  WHITE("o"),
  BLACK("x");

  final String display;

  Color(String c) {
    this.display = c;
  }

  @Override
  public String toString() {
    return this.display;
  }
}
