package com.spamalot.boardgame.ataxx;

import com.spamalot.boardgame.board.Position;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractAtaxxBoard implements Position<AtaxxMove> {
  /** Logger for this class. */
  static final Logger logger = LoggerFactory.getLogger(AbstractAtaxxBoard.class);

  protected static List<AtaxxMove> moveList(AtaxxCell cell) {
    List<AtaxxMove> moveList = new ArrayList<>();
    for (AtaxxCell c : cell.getGrowToCells()) {
      logger.info("First order: {}", c.getCellName());
      moveList.add(new AtaxxGrowMove(c));
    }
    for (AtaxxCell c : cell.getJumpToCells()) {
      logger.info("Second order: {}", c.getCellName());
      moveList.add(new AtaxxJumpMove(cell, c));
    }

    return moveList;
  }

  @Override
  public List<AtaxxMove> getLegalMoves() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void makeMove(AtaxxMove m) {
    // TODO Auto-generated method stub

  }

  @Override
  public void undoLastMove() {
    // TODO Auto-generated method stub

  }

  @Override
  public int evaluate() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public void printMoves() {
    // TODO Auto-generated method stub

  }

}
