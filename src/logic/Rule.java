
package logic;

/**
 *
 * @author Nathan Steers
 */
public abstract class Rule {

  protected FSM.State[ ][ ] grid;

  public Rule( FSM fsm )
  {
    grid = fsm.getGrid();
  }

  public abstract boolean fire( );
  
  
}
