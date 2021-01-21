package com.spamalot.boardgame.ataxx;

interface Move {

  int getToRank();

  int getToFile();

  int getFromRank();

  int getFromFile();

}
