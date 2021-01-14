package com.spamalot.boardgame.ataxx;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AtaxxPosition game = new AtaxxPosition();
        game.printPosition();
        MinMax searcher = new MinMax();
        searcher.moveList(game, 1);
    }
}
