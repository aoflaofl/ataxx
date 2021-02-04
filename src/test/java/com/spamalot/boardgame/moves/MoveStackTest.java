package com.spamalot.boardgame.moves;

import com.spamalot.boardgame.board.Cell;

import org.testng.annotations.Test;

public class MoveStackTest {
  @Test
  public void f() {
    
    MoveStack<Move> s = new MoveStack<>();
  }
  
  class TestMove implements Move {

    @Override
    public Cell getFromCell() {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public Cell getToCell() {
      // TODO Auto-generated method stub
      return null;
    }
    
  }
}
