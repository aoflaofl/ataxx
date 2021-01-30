package com.spamalot.boardgame.board;

import com.spamalot.boardgame.pieces.Piece;
import java.util.List;

public interface Position<T extends Move<? extends Cell<? extends Piece>>> {

  List<T> getLegalMoves();

  void makeMove(T m);

  void undoLastMove();

  int evaluate();

  void printMoves();
}
