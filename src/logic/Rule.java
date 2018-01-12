
package logic;

/**
 *
 * @author Nathaniel
 */
public abstract class Rule {

  protected FSM.State[ ][ ] grid;

  public Rule( FSM fsm )
  {
    grid = fsm.getGrid();
  }

  public abstract boolean fire( );
  
  
}
