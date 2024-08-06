package Models;

public abstract class Player {
    private String Name;
    private Character symbol;
    private Integer id;
    private PlayerType playerType;

    public abstract Cell makeMove(Board board);

    public Player(String name, Character symbol, Integer id, PlayerType playerType) {
        Name = name;
        this.symbol = symbol;
        this.id = id;
        this.playerType = playerType;
    }

    public String getName() {
        return Name;
    }

    public Character getSymbol() {
        return symbol;
    }

    public Integer getId() {
        return id;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }
}
