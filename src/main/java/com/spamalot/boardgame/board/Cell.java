package com.spamalot.boardgame.board;

import com.spamalot.boardgame.pieces.Piece;

public interface Cell<T extends Piece> {
  void setPiece(T p);

  T getPiece();

  T removePiece();

  boolean isEmpty();
}
