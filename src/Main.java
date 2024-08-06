import GameController.GameController;
import Models.*;
import Strategies.RowWinningStrategy;
import Strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        GameController gameController = new GameController();

        Player playerA = new HumanPlayer("Anurag",'O',1, PlayerType.HUMAN);
        Player playerB = new BotPlayer("Bot",'X',2,PlayerType.BOT, BotDifficultyLevel.EASY);
        List<Player> players = new ArrayList<>();
        players.add(playerA);
        players.add(playerB);

        List<WinningStrategy> winningStrategyList = new ArrayList<>();
        winningStrategyList.add(new RowWinningStrategy());

        Game game = gameController.createGame(3,players,winningStrategyList);

        game.printBoard();
    }
}