package Models;

import Factories.BotPlayingStrategyFactory;
import Strategies.BotPlayingStrategy;

public class BotPlayer extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public BotPlayer(String name, Character symbol, Integer id, PlayerType playerType,BotDifficultyLevel botDifficultyLevel) {
        super(name, symbol, id, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(this.botDifficultyLevel);
    }

    @Override
    public Cell makeMove(Board board) {
        return null;
    }
}
