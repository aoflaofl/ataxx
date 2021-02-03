package com.spamalot.boardgame.board;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringJoiner;

public class MoveStack<T extends Move<?>> {

  public void push(T move) {
    this.moveStack.push(move);
  }

  private final Deque<T> moveStack = new ArrayDeque<>();

  public T pop() {
    return this.moveStack.pop();
  }

  @Override
  public String toString() {
    StringJoiner sj = new StringJoiner(" ");
    // TODO: This prints moves backwards.
    for (T move : this.moveStack) {
      sj.add(move.toString());
    }
    return "[ " + sj.toString() + " ]";
  }
}