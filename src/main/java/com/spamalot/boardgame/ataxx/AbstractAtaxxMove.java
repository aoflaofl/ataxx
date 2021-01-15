package com.spamalot.boardgame.ataxx;

abstract class AbstractAtaxxMove {

  protected String makePrintSquare(int rank, int file) {
    int printRank = 7 - rank;
    char f = (char) ('a' + file);
    return f + "" + printRank;
  }

}
