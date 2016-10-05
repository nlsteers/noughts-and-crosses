package logic;

/**
 *
 * @author Nathaniel Steers
 */
public class FSM {
    
    enum CellContent { blank, nought, cross };
    public enum State { blank, nought, cross };
    
    public static final int NOROWS = 3;
    public static final int NOCOLS = 3;
    
    
    private State[][] grid;
    
    public FSM(){
        grid = new State[ NOROWS ] [ NOCOLS ];
        
        for (int i = 0; i < NOROWS; i++){
            for (int j = 0; j < NOCOLS; j++){
                grid[i][j] = State.blank;
            }
        }
    }
    
    public void newGame(){
    grid = new State[ NOROWS ] [ NOCOLS ];
        
        for (int i = 0; i < NOROWS; i++){
            for (int j = 0; j < NOCOLS; j++){
                grid[i][j] = State.blank;
            }
        }
    }
    
      public void updateCell( int row, int column, State state )
  {
    grid[row][column] = state;
  }
    public State getCellState(int row, int column){
        return grid[row][column];
    }
    public State[][] getGrid(){
        return grid;
    }
    
}
