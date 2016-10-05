
package agent;

import logic.FSM;

/**
 *
 * @author Nathan
 */
public abstract class Belief {
    
    protected static final FSM.State
            BLANKSTATE = FSM.State.blank;
    protected static final FSM.State
            NOUGHTSTATE = FSM.State.nought;
    protected static final FSM.State
            CROSSSTATE = FSM.State.cross;
    
  protected boolean predicate;
  protected FSM.State[ ][ ] grid;

  protected Action action;

  public Belief( FSM fsm )
  {
    grid = fsm.getGrid();

  }

  public boolean isTrue( )
  {
    return predicate;
  }

  public void updateFSM(FSM fsm)
  {
    grid = fsm.getGrid();
  }
  
  public abstract void update( );
  public Action getAction( )
  {
    return action;
  }
  
}