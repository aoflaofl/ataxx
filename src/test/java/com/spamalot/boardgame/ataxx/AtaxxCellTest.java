package com.spamalot.boardgame.ataxx;

import com.spamalot.boardgame.pieces.Color;
import com.spamalot.boardgame.pieces.Flippable;
import com.spamalot.boardgame.pieces.FlippablePiece;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AtaxxCellTest {

  @Test
  public void AtaxxCellPickupPutDownTest() {
    AtaxxCell cell = new AtaxxCell("a1");
    FlippablePiece piece = new FlippablePiece(Color.WHITE);
    Assert.assertTrue(cell.isEmpty());
    cell.putDownPiece(piece);
    Assert.assertFalse(cell.isEmpty());
    Flippable p1 = cell.getPiece();
    Assert.assertEquals(piece, p1);

    Assert.assertFalse(cell.isEmpty());

    Flippable p2 = cell.pickUpPiece();

    Assert.assertEquals(piece, p2);
    Assert.assertTrue(cell.isEmpty());
  }

  @Test
  public void cellNameTest() {
    AtaxxCell cell = new AtaxxCell("a1");
    Assert.assertEquals(cell.getCellName(), "a1");
  }

  @Test
  public void toStringTest() {
    AtaxxCell cell = new AtaxxCell("a1");
    Assert.assertEquals(cell.toString(), ".");

    FlippablePiece piece = new FlippablePiece(Color.WHITE);
    cell.putDownPiece(piece);
    Assert.assertEquals(cell.toString(), "o");

  }
}