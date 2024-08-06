package Models;

public class Cell {
    private Integer row;
    private Integer col;
    private CellState cellState;
    private Player player;

    public Cell(int row,int col)
    {
        this.row = row;
        this.col = col;
        this.cellState = CellState.EMPTY;
        this.player = null;
    }

    public void display() {
        if(this.cellState == CellState.EMPTY)
        {
            System.out.print("|_|");
        }
        else{
            System.out.print("|"+this.player.getSymbol()+"|");
        }
    }
}
