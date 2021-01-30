package com.spamalot.boardgame.board;

import java.util.List;

public interface Position<T extends Move<?>> {

  List<T> getLegalMoves();

  void makeMove(T m);

  void undoLastMove();

  int evaluate();

  void printMoves();
}
