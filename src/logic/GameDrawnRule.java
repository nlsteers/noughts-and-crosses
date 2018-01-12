
package logic;

/**
 *
 * @author Nathaniel
 */
public class GameDrawnRule extends Rule {
  

  
  public GameDrawnRule( FSM fsm )
  {
     super(fsm);
        
  }

  public boolean fire( )
  {
    boolean found = false;
    for( int i = 0;
    i < FSM.NOCOLS;
    i++ )
    {
      for( int j = 0;
      j < FSM.NOROWS;
      j++ )
      {
        if( grid[ i ][ j ] == FSM.State.blank )
        {
          found = true;
        }
      }
    }
    return ! found;
  }
  
  
}
