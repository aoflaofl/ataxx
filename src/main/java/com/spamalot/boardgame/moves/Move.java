package com.spamalot.boardgame.moves;

import com.spamalot.boardgame.board.Cell;

public interface Move<T extends Cell<?>> {
  /**
   * Get the from cell.
   * 
   * @return the Cell.
   */
  T getFromCell();

  /**
   * Get the to cell.
   * 
   * @return the Cell.
   */
  T getToCell();

  void setToCell(T c);

  void setFromCell(T c);
}
