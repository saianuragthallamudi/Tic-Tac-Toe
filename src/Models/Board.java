package Models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private Integer size;
    private List<List<Cell>> board;

    public Board(Integer size)
    {
        this.size = size;
        this.board = new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            board.add(new ArrayList<>());
            for(int j=0;j<size;j++)
            {
                board.get(i).add(new Cell(i,j));
            }
        }
    }

    public void display() {
        for(int i=0;i<this.size;i++)
        {
            for(int j=0;j<this.size;j++)
            {
                board.get(i).get(j).display();
            }
            System.out.println();
        }
    }
}
