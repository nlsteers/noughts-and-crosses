/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

/**
 *
 * @author Nathaniel
 */
public class GameWonRule extends Rule {
  private String[] winT = new String[3];
  
  public GameWonRule( FSM fsm )
  {
     super(fsm);
  }
  
  public String[] getWinT(){
    return winT;
  }
  
  @Override
  public boolean fire( )
  {
    if(hZ()){
      return true;
    }
    if(vC()){
      return true;
    }
    if(dG()){
      return true;
    }
    
    return false;
  }
  
  private boolean hZ(){
      int noCross = 0, noNought = 0, index = 0;
      while(index < FSM.NOROWS)
      {
        for( int j = 0; j < FSM.NOCOLS; j++ )
        {
          winT[j] = Integer.toString(index + 1) + Integer.toString(j + 1);
          noCross = (grid[index][j] == FSM.State.cross) ? noCross + 1 : noCross;
          noNought = (grid[index][j] == FSM.State.nought) ? noNought + 1 : noNought;
          if(noCross == FSM.NOCOLS || noNought == FSM.NOCOLS){
            
            return true;
          }
        }
        index++;
        noCross = 0;
        noNought = 0;
        winT = new String[3];
      }
      winT = new String[3];
      return false;
  }
  
  
  
  private boolean dG(){
      int noCross = 0, noNought = 0;
      int rows = FSM.NOROWS - 1;
      for( int j = 0; j < FSM.NOCOLS; j++ )
      {
        winT[j] = Integer.toString(j + 1) + Integer.toString(j + 1);
        noCross = (grid[j][j] == FSM.State.cross) ? noCross + 1 : noCross;
        noNought = (grid[j][j] == FSM.State.nought) ? noNought + 1 : noNought;
        if(noCross == FSM.NOCOLS || noNought == FSM.NOCOLS){
          return true;
        }
      }
      winT = new String[3];
      noCross = 0;
      noNought = 0;
      
      for( int j = 0; j < FSM.NOCOLS; j++ )
      {
        winT[j] = Integer.toString(rows - j + 1) + Integer.toString(j + 1);
        noCross = (grid[rows - j][j] == FSM.State.cross) ? noCross + 1 : noCross;
        noNought = (grid[rows - j][j] == FSM.State.nought) ? noNought + 1 : noNought;
        if(noCross == FSM.NOCOLS || noNought == FSM.NOCOLS){
          return true;
        }
      }
      winT = new String[3];
      return false;
    }
  
       
      private boolean vC(){
      int noCross = 0, noNought = 0, index = 0;
      while(index < FSM.NOCOLS)
      {
        for( int j = 0; j < FSM.NOROWS; j++ )
        {
          winT[j] = Integer.toString(j + 1) + Integer.toString(index + 1);
          noCross = (grid[j][index] == FSM.State.cross) ? noCross + 1 : noCross;
          noNought = (grid[j][index] == FSM.State.nought) ? noNought + 1 : noNought;
          if(noCross == FSM.NOCOLS || noNought == FSM.NOCOLS){
            return true;
          }
        }
        index++;
        noCross = 0;
        noNought = 0;
        winT = new String[3];
      }
      winT = new String[3];
      return false;
    }

}
