package com.spamalot.boardgame.ataxx;

import java.util.List;

public class MinMax {
  public int minMax(Position p, int depth) {

    if (depth == 0) {
      return p.evaluate();
    }

    List<Move> moves = p.getLegalMoves();

    if (moves.isEmpty()) {
      return p.evaluate();
    }

    int eval = Integer.MIN_VALUE;
    for (Move m : moves) {
      p.makeMove(m);
      eval = Math.max(eval, -minMax(p, depth - 1));
      p.undoLastMove();
    }
    return eval;
  }
}
