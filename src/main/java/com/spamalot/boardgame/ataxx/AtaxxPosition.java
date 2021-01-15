package com.spamalot.boardgame.ataxx;

import java.util.List;

class AtaxxPosition implements Position {
  private final Color board[][] = new Color[7][7];
  private final Color colorToMove = Color.WHITE;

  @Override
  public List<Move> getLegalMoves() {
    for (int rank = 0; rank < 7; rank++) {
      for (int file = 0; file < 7; file++) {
        if (board[rank][file] == colorToMove) {
          System.out.println(rank + ", " + file);
          generateMovesForPiece(rank, file);
        }
      }
    }
    return null;
  }

  /**
   * Generate list of moves for a piece. Assume square at rank and file contains a
   * piece.
   * 
   * @param rank rank of square with piece
   * @param file file with square with piece
   */
  private void generateMovesForPiece(int rank, int file) {
    int targetRank;
    int targetFile;
    for (int rankDelta = -2; rankDelta <= 2; rankDelta++) {
      targetRank = rank + rankDelta;
      if (targetRank >= 0 && targetRank < 7) {
        for (int fileDelta = -2; fileDelta <= 2; fileDelta++) {
          if (rankDelta == 0 && fileDelta == 0) {
            continue;
          }
          targetFile = file + fileDelta;
          if (targetFile >= 0 && targetFile < 7 && board[targetRank][targetFile] != null) {
            generateMove(rank, file, rankDelta, fileDelta);
          }
        }
      }
    }
  }

  private void generateMove(int rank, int file, int rankDelta, int fileDelta) {
    AbstractAtaxxMove move = new AtaxxJumpMove(rank, file, rankDelta, fileDelta);
    System.out.println(move);
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
    int rank = 7;
    for (int h = 0; h < 7; h++) {
      System.out.print(rank + " ");
      rank--;
      for (int w = 0; w < 7; w++) {
        System.out.print(board[h][w] == null ? " . " : board[h][w] == Color.BLACK ? " x " : " o ");
      }
      System.out.println();
    }
    // System.out.println();
    System.out.print("  ");
    for (char i = 'a'; i < 'h'; i++) {
      System.out.print(" " + i + " ");
    }
    System.out.println();
  }

  @Override
  public void printMoves() {
    // TODO Auto-generated method stub

  }

}
