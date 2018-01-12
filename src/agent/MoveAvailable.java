package agent;

/**
 *
 * @author Nathaniel
 */
import java.util.*;
import java.util.Random;
import logic.FSM;


public class MoveAvailable extends Belief {

    public MoveAvailable(FSM fsm) {
            super(fsm);
    }

    public void update() {
        predicate = false;

        List<Action> blanks = new ArrayList<Action>();

        for (int i = 0; i < FSM.NOROWS; i++) {
            for (int j = 0; j < FSM.NOCOLS; j++) {
                if (grid[ i][ j] == BLANKSTATE) {
                    blanks.add(new Action(i, j));
                }
            }
        }
        assert blanks.size() > 1 : "no blanks available";

        final int randomNumber = getRandomInRange(1, blanks.size());

        action = blanks.get(randomNumber - 1);
        predicate = true;
    }
    
    private int getRandomInRange(int lower, int higher){
        return (int)(Math.floor(Math.random() * (higher - lower - 1)) + lower);
    }
    

}


