package com.spamalot.boardgame.moves;

import com.spamalot.boardgame.board.Cell;

public interface Move<T extends Cell<?>> {
  T getFromCell();

  T getToCell();
}
