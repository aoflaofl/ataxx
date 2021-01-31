package com.spamalot.boardgame.board;

import com.spamalot.boardgame.pieces.Piece;

public interface Cell<T extends Piece> {
  void putDownPiece(T p);

  T getPiece();

  T pickUpPiece();

  boolean isEmpty();
}
