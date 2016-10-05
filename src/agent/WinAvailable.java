
package agent;

import java.util.ArrayList;
import java.util.List;
import logic.FSM;

/**
*
* @author Simon
*/
public class WinAvailable extends Belief {
  private List< Action > blanks = new ArrayList< Action >( );
  private int index = 0, noblanks = 0, nonought = 0;
   public WinAvailable(FSM fsm)
  {
    super(fsm);
   
  }
  
   public void update( )
  {
   predicate = false;

    Horizontal();
    if(!blanks.isEmpty())
    {
      action = blanks.get(0);
      predicate = true;
      return;
    }
    
    Vertical();
    if(!blanks.isEmpty())
    {
      action = blanks.get(0);
      predicate = true;
      return;
    }
    
    Diagonal();
    if(!blanks.isEmpty())
    {
      action = blanks.get(0);
      predicate = true;
    }
   }
  
  
    private void Horizontal(){
      int [] location = new int[2];
      while(index < FSM.NOROWS)
      {
        for( int j = 0; j < FSM.NOCOLS; j++ )
        {
          if(grid[index][j] == FSM.State.blank){
            noblanks ++;
            location[0] = index;
            location[1] = j;
          }
          nonought = (grid[index][j] == FSM.State.nought) ? nonought + 1 : nonought;
          
          if(nonought == FSM.NOCOLS - 1 && noblanks == 1){
            blanks.add(new Action(location[0], location[1]));
            return;
          }
        }
        index++;
        nonought = 0;
        noblanks = 0;
      }
      index = 0;
    }
      
      
    
    
    private void Vertical(){
      int [] location = new int[2];
      while(index < FSM.NOCOLS)
      {
        for( int j = 0; j < FSM.NOROWS; j++ )
        {
          if(grid[j][index] == FSM.State.blank){
            noblanks ++;
            location[0] = j;
            location[1] = index;
          }
          nonought = (grid[j][index] == FSM.State.nought) ? nonought + 1 : nonought;
          
          if(nonought == FSM.NOCOLS - 1 && noblanks == 1){
            blanks.add(new Action(location[0], location[1]));
            return;
          }
        }
        index++;
        nonought = 0;
        noblanks = 0;
      }
      index = 0;
    }
    
    
    private void Diagonal(){
      int [] location = new int[2];
      int rows = FSM.NOROWS - 1;
      for( int j = 0; j < FSM.NOCOLS; j++ )
      {
        if(grid[j][j] == FSM.State.blank){
          noblanks ++;
          location[0] = j;
          location[1] = j;
        }
        nonought = (grid[j][j] == FSM.State.nought) ? nonought + 1 : nonought;

        if(nonought == FSM.NOCOLS - 1 && noblanks == 1){
          blanks.add(new Action(location[0], location[1]));
          return;
        }
      }
      
      nonought = 0;
      noblanks = 0;
      
      for( int j = 0; j < FSM.NOCOLS; j++ )
      {
        if(grid[rows - j][j] == FSM.State.blank){
          noblanks ++;
          location[0] = rows - j;
          location[1] = j;
        }
        nonought = (grid[rows - j][j] == FSM.State.nought) ? nonought + 1 : nonought;
        
        if(nonought == FSM.NOCOLS - 1 && noblanks == 1){
          blanks.add(new Action(location[0], location[1]));
        }
      }
    }
}
