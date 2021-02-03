package com.spamalot.boardgame.moves;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.StringJoiner;

public class MoveStack<T extends Move<?>> {

  private final Deque<T> moveStack = new ArrayDeque<>();

  public T pop() {
    return this.moveStack.pop();
  }

  public void push(T move) {
    this.moveStack.push(move);
  }

  @Override
  public String toString() {
    StringJoiner sj = new StringJoiner(" ");

    Iterator<T> p = this.moveStack.descendingIterator();
    while (p.hasNext()) {
      sj.add(p.next().toString());
    }

    return "[ " + sj.toString() + " ]";
  }
}