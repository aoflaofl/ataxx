package com.spamalot.boardgame.ataxx;

import java.util.List;
import java.util.Set;

public interface Position {

  List<Move> getLegalMoves();

  void makeMove(Move m);

  void undoLastMove();

  int evaluate();

  void printMoves();

}
