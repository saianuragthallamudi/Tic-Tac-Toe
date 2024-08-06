package Validations;

import Exceptions.DuplicateSymbolException;
import Exceptions.InvalidBotPlayersException;
import Exceptions.PlayerCountException;
import Models.Player;
import Models.PlayerType;

import java.util.HashSet;
import java.util.List;

public class GameValidations {

    public static boolean validatePlayerCountAndBoardDimension(List<Player> players,Integer size) throws Exception {
        if(players.size() >= size)
        {
            throw new PlayerCountException();
        }
        return true;
    }

    public static boolean validateUniqueSymbols(List<Player> players) throws DuplicateSymbolException {
        HashSet<Character> symbolSet = new HashSet<>();
        for(Player player : players)
        {
            if(symbolSet.contains(player.getSymbol()))
            {
                throw new DuplicateSymbolException();
            }
            symbolSet.add(player.getSymbol());
        }
        return true;
    }

    public static boolean validateNumberOfBots(List<Player> players,int count) throws InvalidBotPlayersException {
        int bots = 0;
        for(Player player : players)
        {
            if(player.getPlayerType() == PlayerType.BOT)
            {
                bots++;
            }
            if(bots > count)
            {
                throw new InvalidBotPlayersException();
            }
        }
        return true;
    }
}
