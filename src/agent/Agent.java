package agent;

/**
 *
 * @author Nathan
 */
import logic.FSM;
public class Agent {
  private WinAvailable win;
  private MoveAvailable move;
  private BlockAvailable block;

  
  public Agent(FSM fsm){
    win = new WinAvailable(fsm);
    move = new MoveAvailable(fsm);
    block = new BlockAvailable(fsm);
  }
  

  public Action getNextMove(FSM fsm){
    win = new WinAvailable(fsm);
    move = new MoveAvailable(fsm);
    block = new BlockAvailable(fsm); 
    
    
    Action result = null;
    
    win.update();
    if(win.isTrue()){ 
      return win.getAction();
    }
    
    block.update();
    if(block.isTrue()){
      return block.getAction();
    }
   
    
    move.update();
    if(move.isTrue()){
      result = move.getAction();
    }
    
    return result;
  }
  
}