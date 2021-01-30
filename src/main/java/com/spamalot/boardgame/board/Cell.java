package com.spamalot.boardgame.board;

import com.spamalot.boardgame.ataxx.BrandNewAtaxxPiece;
import com.spamalot.boardgame.pieces.Piece;

public interface Cell<T extends Piece> {
  void setPiece(T p);

  T getPiece();

  BrandNewAtaxxPiece removePiece();

  boolean isEmpty();
}
