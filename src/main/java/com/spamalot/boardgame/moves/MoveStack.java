package com.spamalot.boardgame.moves;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.StringJoiner;

public class MoveStack<T extends Move<?>> {

  private final Deque<T> stack = new ArrayDeque<>();

  public T pop() {
    return this.stack.pop();
  }

  public void push(T move) {
    this.stack.push(move);
  }

  @Override
  public String toString() {
    int moveNumber = 1;
    // TODO: Assumes starting from beginning of game. Find way to start from a
    // position later in game.
    StringJoiner sj = new StringJoiner(" ");

    Iterator<T> halfMove = this.stack.descendingIterator();
    while (halfMove.hasNext()) {
      sj.add(moveNumber + ".");
      sj.add(halfMove.next().toString());
      if (halfMove.hasNext()) {
        sj.add(halfMove.next().toString());
      } else {
        sj.add("....");
      }
      moveNumber++;
    }

    return "[ " + sj.toString() + " ]";
  }
}