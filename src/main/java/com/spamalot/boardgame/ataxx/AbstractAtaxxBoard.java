package com.spamalot.boardgame.ataxx;

import com.spamalot.boardgame.board.Position;
import com.spamalot.boardgame.pieces.Color;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

abstract class AbstractAtaxxBoard implements Position<AtaxxMove> {
  /** Logger for this class. */
  private final Logger logger = LoggerFactory.getLogger(AbstractAtaxxBoard.class);

  protected Color colorToMove = Color.WHITE;

  private final Deque<AtaxxMove> moveStack = new ArrayDeque<>();

  protected final List<AtaxxMove> moveList(AtaxxCell cell) {
    List<AtaxxMove> moveList = new ArrayList<>();
    for (AtaxxCell c : cell.getGrowToCells()) {
      this.logger.info("First order: {}", c.getCellName());
      moveList.add(new AtaxxGrowMove(c));
    }
    for (AtaxxCell c : cell.getJumpToCells()) {
      this.logger.info("Second order: {}", c.getCellName());
      moveList.add(new AtaxxJumpMove(cell, c));
    }

    return moveList;
  }

  @Override
  public void makeMove(AtaxxMove move) {
    AtaxxPiece piece;
    if (move instanceof AtaxxJumpMove) {
      piece = move.getFromCell().pickUpPiece();
    } else {
      piece = new AtaxxPiece(this.colorToMove);
    }

    move.getToCell().putDownPiece(piece);
    this.moveStack.push(move);
  }

  @Override
  public void undoLastMove() {
    AtaxxMove move = this.moveStack.pop();
    AtaxxPiece piece = move.getToCell().pickUpPiece();
    if (move instanceof AtaxxJumpMove) {
      move.getFromCell().putDownPiece(piece);
    }
  }

  @Override
  public int evaluate() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public void printMoves() {
    for (AtaxxMove move : this.moveStack) {
      this.logger.info("Move: {}", move);
    }
  }

}
