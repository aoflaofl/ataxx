package com.spamalot.boardgame.ataxx;

import java.util.List;

interface Position {

  List<Move> getLegalMoves();

  void makeMove(Move m);

  void undoLastMove();

  int evaluate();

  void printMoves();
}
