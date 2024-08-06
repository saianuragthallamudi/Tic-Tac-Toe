package GameController;

import Models.Game;
import Models.Player;
import Strategies.WinningStrategy;

import java.util.List;

public class GameController {

    public Game createGame(Integer size, List<Player> players, List<WinningStrategy> winningStrategyList) throws Exception {
        return Game.getBuilder()
                .setSize(size)
                .setPlayers(players)
                .setWinningStrategyList(winningStrategyList)
                .build();
    }

    public void makeMove()
    {

    }

    public void undo()
    {

    }

    public void printBoard(Game game)
    {
        game.printBoard();
    }
}
