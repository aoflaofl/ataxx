package com.spamalot.boardgame.pieces;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AtaxxPieceTest {
  @Test
  public void f() {
    AtaxxPiece piece = new AtaxxPiece(Color.BLACK);
    Assert.assertEquals(piece.getColor(), Color.BLACK);
    Assert.assertEquals(piece.toString(), Color.BLACK.toString());

    piece = new AtaxxPiece(Color.WHITE);
    Assert.assertEquals(piece.getColor(), Color.WHITE);
    Assert.assertEquals(piece.toString(), Color.WHITE.toString());
  }
}
