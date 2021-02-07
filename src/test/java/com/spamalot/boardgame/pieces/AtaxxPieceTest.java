package com.spamalot.boardgame.pieces;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AtaxxPieceTest {
  @Test
  public void f() {
    PieceImpl piece = new FlippablePiece(Color.BLACK);
    Assert.assertEquals(piece.getColor(), Color.BLACK);
    Assert.assertEquals(piece.toString(), Color.BLACK.toString());

    piece = new FlippablePiece(Color.WHITE);
    Assert.assertEquals(piece.getColor(), Color.WHITE);
    Assert.assertEquals(piece.toString(), Color.WHITE.toString());
  }
}
