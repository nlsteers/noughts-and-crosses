package logic;

import agent.Action;
import agent.Agent;
import logic.FSM.State;

/**
 *
 * @author Nathan Steers
 */
public class Façade {

    public class MoreRules {

        private boolean turn = true;

        public boolean makeMove() {
            boolean move = turn;
            turn = !turn;
            return move;
        }
    }

    private MoreRules game = new MoreRules();
    private FSM fsm = new FSM();
    private FSM.State gameState;
    private RuleEngine re = new RuleEngine();
    private Agent a1 = new Agent(fsm);
    private boolean move = true;

    public boolean go(String location) {
        location = location.replace("grid", "");
        fsm.updateCell(Integer.parseInt(String.valueOf(location.charAt(0))) - 1,
                Integer.parseInt(String.valueOf(location.charAt(1))) - 1, State.cross);
        move = !move;
        return true;
    }

    public int[] cpu() {
        int[] location = new int[2];
        Action a1move = a1.getNextMove(fsm);
        location[0] = a1move.getRow();
        location[1] = a1move.getColumn();
        fsm.updateCell(location[0], location[1], State.nought);
        move = !move;
        return location;
    }

    public boolean which() {
        return move;
    }

    public boolean gameOver() {
        boolean over = (re.Victory(fsm) == true || re.Draw(fsm) == true) ? true : false;
        return over;
    }

    public boolean win() {
        return re.Victory(fsm);
    }

    public String[] winingMove() {
        return re.wMove(); 
    }

    public void newGame() { 
        fsm = new FSM();
        a1 = new Agent(fsm);

    }

}
