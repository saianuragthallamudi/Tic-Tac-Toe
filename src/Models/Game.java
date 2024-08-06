package Models;

import Strategies.WinningStrategy;
import Validations.GameValidations;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    // For implementing undo feature
    private List<Move> moves;
    private GameState gameState;
    private Player winner;
    private Integer nextPlayerIndex;
    private List<WinningStrategy> winningStrategyList;

    private Game(Integer size,List<Player> players,List<WinningStrategy> winningStrategyList)
    {
        this.players = players;
        this.winningStrategyList = winningStrategyList;
        this.gameState = GameState.INPROGRESS;
        this.board = new Board(size);
        nextPlayerIndex = 0;
        this.moves = new ArrayList<>();
    }

    public static Builder getBuilder()
    {
        return new Builder();
    }

    public void printBoard() {
        System.out.println("Game Of Tic Tac Toe begins :");
        this.board.display();
    }

    public static class Builder
    {
        Integer size;
        List<Player> players;
        List<WinningStrategy> winningStrategyList;

        public Builder setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }
        public Builder setWinningStrategyList(List<WinningStrategy> winningStrategyList) {
            this.winningStrategyList = winningStrategyList;
            return this;
        }
        public Game build() throws Exception {
            // validations
            //Validate board dimension and player count
            GameValidations.validatePlayerCountAndBoardDimension(this.players,this.size);
            //Validate number of bots(1)
            GameValidations.validateNumberOfBots(this.players,1);
            //Validate unique symbols for players
            GameValidations.validateUniqueSymbols(this.players);
            return new Game(this.size,this.players,this.winningStrategyList);
        }
    }
}
