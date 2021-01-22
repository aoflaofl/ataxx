package com.spamalot.boardgame.board;

import java.util.List;

public interface Position {

  List<Move> getLegalMoves();

  void makeMove(Move m);

  void undoLastMove();

  int evaluate();

  void printMoves();
}
