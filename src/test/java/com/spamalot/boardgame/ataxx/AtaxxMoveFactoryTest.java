package com.spamalot.boardgame.ataxx;

import org.testng.annotations.Test;
import org.testng.Assert;
import com.spamalot.boardgame.board.Move;

public class AtaxxMoveFactoryTest {

  @Test
  public void createTest() {
    Move m = AtaxxMoveFactory.create(1, 2, 3, 4);
    Assert.assertNotNull(m);
  }
}
