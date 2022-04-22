
import java.util.Iterator;


//Ashvin Ganesan
//Artificial Intelligence
//Monday November 15th 2021
//TicTacToe Project #1

public class Minimax<Action> {

    public Action bestMove(Game.State<Action> state) {
        TicTacToe.State tstate = (TicTacToe.State) state;
        Iterable<Action> moves = state.moves();
        Iterator iter = moves.iterator();
        TicTacToe.Action action = null;
//        Action best = (Action)action;
        int val = -100;        
        while(iter.hasNext()) {
            TicTacToe.Action a = (TicTacToe.Action)iter.next();
            int v = minValue((Game.State<Action>)tstate.next(a));
            if(v > val ) {
                val = v;
                action = a;
            }
        }
        return (Action)action;
        
    }

     public int maxValue(Game.State<Action> state) {
        TicTacToe.State tstate = (TicTacToe.State) state;
        Iterable<Action> moves = state.moves();
        Iterator iter = moves.iterator();
        if(tstate.isTerminal()) {
             return tstate.evaluate();
         }
        
        int maxValue = -1;
        while(iter.hasNext()) {
            TicTacToe.Action action = (TicTacToe.Action)iter.next();
//            Action a = (Action)action;
            maxValue = Math.max(maxValue, minValue((Game.State<Action>)tstate.next(action)));
        }
        return maxValue;
    }

     public int minValue(Game.State<Action> state) {
        TicTacToe.State tstate = (TicTacToe.State) state;
        Iterable<Action> moves = state.moves();
        Iterator iter = moves.iterator();
        if(tstate.isTerminal()) {
             return tstate.evaluate();
         }
        
        int minValue = 1;
        while(iter.hasNext()) {
            TicTacToe.Action action = (TicTacToe.Action)iter.next();
//            Action a = (Action)action;
            minValue = Math.min(minValue, maxValue((Game.State<Action>)tstate.next(action)));
        }
        return minValue;
    }
}
