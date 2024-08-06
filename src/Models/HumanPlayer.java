package Models;

public class HumanPlayer extends Player {

    public HumanPlayer(String name, Character symbol, Integer id, PlayerType playerType) {
        super(name, symbol, id, playerType);
    }

    @Override
    public Cell makeMove(Board board) {
        return null;
    }
}
