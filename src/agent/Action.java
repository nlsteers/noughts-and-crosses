package agent;

/**
 *
 * @author Nathan Steers
 */
public class Action {
  private int row, column;
  Action(int i, int j) {
    row = i;
    column = j;
  }
  
  public int getRow(){
    return row;
  }
  
  
  public int getColumn(){
    return column;
  }
  
  
  @Override
  public String toString(){
    return Integer.toString(row) + Integer.toString(column);
  }
  
}
