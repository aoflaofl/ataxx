package com.spamalot.boardgame.board;

public interface Move<T extends Cell<?>> {
  T getFromCell();

  T getToCell();
}
