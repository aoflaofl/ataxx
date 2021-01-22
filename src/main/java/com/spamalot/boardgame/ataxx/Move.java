package com.spamalot.boardgame.ataxx;

/**
 * Define the interface to implement a simple move on a square board.
 * 
 * <p>A simple move would be a move with a single source and end square on a square
 * board.
 * 
 * @author gej
 *
 */
interface Move {

  int getToRank();

  int getToFile();

  int getFromRank();

  int getFromFile();
}
