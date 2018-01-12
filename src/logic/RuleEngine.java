
package logic;

/**
 *
 * @author Nathaniel
 */
public class RuleEngine {
  GameWonRule won;
  
  public boolean Victory(FSM fsm){
    won = new GameWonRule(fsm);
    return won.fire();
  }
   
  public boolean Draw(FSM fsm){
   GameDrawnRule draw = new GameDrawnRule(fsm);
   return draw.fire();
  }
  
  public String[] wMove(){
    return won.getWinT();
  }
}
