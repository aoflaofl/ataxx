package com.spamalot.boardgame.moves;

import com.spamalot.boardgame.board.Cell;
import com.spamalot.boardgame.pieces.Color;
import com.spamalot.boardgame.pieces.Piece;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoveStackTest {
  @Test
  public void f() {

    MoveStack<TestMove> s = new MoveStack<>();

    TestMove m = new TestMove();

    s.push(m);
    System.out.println(s);

    Assert.assertTrue(s.toString().contains("...."));

    TestMove m3 = new TestMove();
    s.push(m3);
    Assert.assertFalse(s.toString().contains("...."));

    s.pop();
    TestMove m2 = s.pop();

    Assert.assertEquals(m, m2);

  }

  private class TestMove implements Move<TestCell> {

    @Override
    public TestCell getFromCell() {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public TestCell getToCell() {
      // TODO Auto-generated method stub
      return null;
    }

  }

  private class TestCell implements Cell<TestPiece> {

    @Override
    public void putDownPiece(TestPiece p) {
      // TODO Auto-generated method stub

    }

    @Override
    public TestPiece getPiece() {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public TestPiece pickUpPiece() {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public boolean isEmpty() {
      // TODO Auto-generated method stub
      return false;
    }

  }

  private class TestPiece implements Piece {

    @Override
    public Color getColor() {
      // TODO Auto-generated method stub
      return null;
    }

  }
}
