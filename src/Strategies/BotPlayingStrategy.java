package Strategies;

import Models.Board;
import Models.Cell;

public interface BotPlayingStrategy {

    public Cell makeMove(Board board);
}
