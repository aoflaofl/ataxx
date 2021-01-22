package com.spamalot.boardgame.ataxx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AtaxxGrowMoveTest {
  private static final Logger logger = LoggerFactory.getLogger(AtaxxGrowMoveTest.class);

  @Test
  public void testAtaxxGrowMove() {
    Move m = new AtaxxGrowMove(0, 0);
    Assert.assertEquals(m.getToRank(), 0);
    Assert.assertEquals(m.getToFile(), 0);

    m = new AtaxxGrowMove(6, 6);
    Assert.assertEquals(m.getToRank(), 6);
    Assert.assertEquals(m.getToFile(), 6);

    m = new AtaxxGrowMove(0, 6);
    Assert.assertEquals(m.getToRank(), 0);
    Assert.assertEquals(m.getToFile(), 6);

    m = new AtaxxGrowMove(6, 0);
    Assert.assertEquals(m.getToRank(), 6);
    Assert.assertEquals(m.getToFile(), 0);

  }

  @Test
  public void testAtaxxGrowMoveExceptions() {
    Move m;
    try {
      m = new AtaxxGrowMove(-2, 0);
      Assert.fail("Should not get here.");
    } catch (java.lang.IllegalArgumentException e) {
      logger.info("something.", e);
    }

    try {
      m = new AtaxxGrowMove(4, -3);
      Assert.fail("Should not get here.");
    } catch (java.lang.IllegalArgumentException e) {
    }

    try {
      m = new AtaxxGrowMove(14, 2);
      Assert.fail("Should not get here.");
    } catch (java.lang.IllegalArgumentException e) {
    }

    try {
      m = new AtaxxGrowMove(5, 21);
      Assert.fail("Should not get here.");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void getFromFileTest() {
  }

  @Test
  public void getFromRankTest() {
  }

  @Test
  public void getToFileTest() {
  }

  @Test
  public void getToRankTest() {
  }

  @Test
  public void toStringTest() {
  }
}
