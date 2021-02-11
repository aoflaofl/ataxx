package com.spamalot.boardgame.pieces;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AtaxxPieceTest {
  @Test
  public void f() {
    PieceImpl piece = new PieceImpl(Color.BLACK);
    Assert.assertEquals(piece.getColor(), Color.BLACK);
    Assert.assertEquals(piece.toString(), Color.BLACK.toString());

    piece = new PieceImpl(Color.WHITE);
    Assert.assertEquals(piece.getColor(), Color.WHITE);
    Assert.assertEquals(piece.toString(), Color.WHITE.toString());
  }

  @Test
  public void somethignTest() {
    FlippablePiece flipPiece = new FlippablePiece(Color.BLACK);
    flipPiece.flip();
    Assert.assertEquals(flipPiece.getColor(), Color.WHITE);
  }
}
