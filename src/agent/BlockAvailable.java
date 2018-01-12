

package agent;

/**
 *
 * @author Nathaniel
 */

import java.util.*;
import java.util.Random;
import logic.FSM;

public class BlockAvailable extends Belief{
    
  private List< Action > blanks = new ArrayList< Action >( );
  private int index = 0, blankCount = 0, crossCount = 0;
 
  public BlockAvailable( FSM fsm )
  {
    super(fsm);
    
  }
  
  @Override
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
            blankCount ++;
            location[0] = index;
            location[1] = j;
          }
          crossCount = (grid[index][j] == FSM.State.cross) ? crossCount + 1 : crossCount;
          
          if(crossCount == FSM.NOCOLS - 1 && blankCount == 1){
            blanks.add(new Action(location[0], location[1]));
            return;
          }
        }
        index++;
        crossCount = 0;
        blankCount = 0;
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
            blankCount ++;
            location[0] = j;
            location[1] = index;
          }
          crossCount = (grid[j][index] == FSM.State.cross) ? crossCount + 1 : crossCount;
          
          if(crossCount == FSM.NOCOLS - 1 && blankCount == 1){
            blanks.add(new Action(location[0], location[1]));
            return;
          }
        }
        index++;
        crossCount = 0;
        blankCount = 0;
      }
      index = 0;
    }
    
    
    private void Diagonal(){
      int [] location = new int[2];
      int rows = FSM.NOROWS - 1;
      for( int j = 0; j < FSM.NOCOLS; j++ )
      {
        if(grid[j][j] == FSM.State.blank){
          blankCount ++;
          location[0] = j;
          location[1] = j;
        }
        crossCount = (grid[j][j] == FSM.State.cross) ? crossCount + 1 : crossCount;

        if(crossCount == FSM.NOCOLS - 1 && blankCount == 1){
          blanks.add(new Action(location[0], location[1]));
          return;
        }
      }
      
      crossCount = 0;
      blankCount = 0;
      
      for( int j = 0; j < FSM.NOCOLS; j++ )
      {
        if(grid[rows - j][j] == FSM.State.blank){
          blankCount ++;
          location[0] = rows - j;
          location[1] = j;
        }
        crossCount = (grid[rows - j][j] == FSM.State.cross) ? crossCount + 1 : crossCount;
        
        if(crossCount == FSM.NOCOLS - 1 && blankCount == 1){
          blanks.add(new Action(location[0], location[1]));
        }
      }
    }
    
    
}
