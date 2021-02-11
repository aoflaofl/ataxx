package com.spamalot.boardgame.pieces;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ColorTest {
  @Test
  public void f() {
    Color white = Color.WHITE;
    Color black = Color.BLACK;

    Assert.assertEquals(white.toString(), "o");
    Assert.assertEquals(black.toString(), "x");
    Assert.assertEquals(black.getOpposite(), white);
  }
}
