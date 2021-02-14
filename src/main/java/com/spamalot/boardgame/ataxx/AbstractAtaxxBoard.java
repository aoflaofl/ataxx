package com.spamalot.boardgame.ataxx;

import com.spamalot.boardgame.board.Board;
import com.spamalot.boardgame.board.Position;
import com.spamalot.boardgame.moves.MoveStack;
import com.spamalot.boardgame.pieces.FlippablePiece;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

abstract class AbstractAtaxxBoard extends Board implements Position<AtaxxMove> {
  /** Logger for this class. */
  private static final Logger LOG = LoggerFactory.getLogger(AbstractAtaxxBoard.class);

  private final MoveStack<AtaxxMove> moveStack = new MoveStack<>();

  protected final List<AtaxxMove> moveList(final AtaxxCell cell) {
    List<AtaxxMove> moveList = new ArrayList<>();
    for (AtaxxCell c : cell.getGrowToCells()) {
      LOG.debug("First order: {}", c.getCellName());
      if (c.isEmpty()) {
        moveList.add(new AtaxxGrowMove(c));
      }
    }
    for (AtaxxCell c : cell.getJumpToCells()) {
      LOG.debug("Second order: {}", c.getCellName());
      if (c.isEmpty()) {
        moveList.add(new AtaxxJumpMove(cell, c));
      }
    }

    return moveList;
  }

  @Override
  public void makeMove(final AtaxxMove move) {
    FlippablePiece piece;
    if (move instanceof AtaxxJumpMove) {
      piece = move.getFromCell().pickUpPiece();
    } else {
      piece = new FlippablePiece(this.getColorToMove());
    }

    move.getToCell().putDownPiece(piece);

    for (AtaxxCell cell : move.getToCell().getGrowToCells()) {
      if (!cell.isEmpty() && cell.getPiece().getColor() != this.colorToMove) {
        cell.getPiece().flip();
        move.addFlipCell(cell);
      }
    }

    switchColor();

    this.moveStack.push(move);
  }

  @Override
  public void undoLastMove() {
    AtaxxMove move = this.moveStack.pop();
    FlippablePiece piece = move.getToCell().pickUpPiece();
    if (move instanceof AtaxxJumpMove) {
      move.getFromCell().putDownPiece(piece);
    }

    for (AtaxxCell cell : move.getFlippedCells()) {
      cell.getPiece().flip();
    }
    switchColor();
  }

  @Override
  public int evaluate() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public void printMoves() {
    LOG.info("Moves: {}", this.moveStack);
  }

}
