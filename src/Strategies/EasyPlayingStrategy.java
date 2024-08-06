package Strategies;

import Models.Board;
import Models.Cell;
import Strategies.BotPlayingStrategy;

public class EasyPlayingStrategy implements BotPlayingStrategy {
    @Override
    public Cell makeMove(Board board) {
        System.out.println("This is bot easy playing strategy");
        return null;
    }
}
