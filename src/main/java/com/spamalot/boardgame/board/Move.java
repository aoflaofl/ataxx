package com.spamalot.boardgame.board;

import com.spamalot.boardgame.pieces.Piece;

public interface Move<T extends Cell<? extends Piece>> {
  T getFromCell();

  T getToCell();
}
