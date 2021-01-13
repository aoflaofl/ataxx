package com.spamalot.boardgame.ataxx;

import java.util.List;

public class AtaxxPosition implements Position {
  private Color board[][] = new Color[7][7];

  @Override
  public List<Move> getLegalMoves() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void makeMove(Move m) {
    // TODO Auto-generated method stub

  }

  @Override
  public void undoLastMove() {
    // TODO Auto-generated method stub

  }

  public AtaxxPosition() {
    board[0][0] = Color.BLACK;
    board[6][6] = Color.BLACK;
    board[6][0] = Color.WHITE;
    board[0][6] = Color.WHITE;
  }

  @Override
  public int evaluate() {
    // TODO Auto-generated method stub
    return 0;
  }

  public void printPosition() {
    for (int h = 0; h < 7; h++) {
      for (int w = 0; w < 7; w++) {
        System.out.print(board[h][w] == null ? " . " : board[h][w] == Color.BLACK ? " @ " : " O ");
      }
      System.out.println();
    }
  }

}
