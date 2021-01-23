package com.spamalot.boardgame.board;

public class SquareCell implements Cell {

  int file;

  int rank;

  public int getFile() {
    return this.file;
  }

  public int getRank() {
    return this.rank;
  }

  public void setFile(int file) {
    this.file = file;
  }

  public void setRank(int rank) {
    this.rank = rank;
  }

}
