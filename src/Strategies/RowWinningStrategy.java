package Strategies;

import Models.Board;
import Models.Move;

public class RowWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWin(Board board, Move move) {
        return false;
    }
}
