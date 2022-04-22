
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList; 


//Ashvin Ganesan
//Artificial Intelligence
//Monday November 15th 2021
//TicTacToe Project #1

public class ReinforcementLearning<Action> {
    HashMap<Integer, Boolean> first = new HashMap<>();
    HashMap<Integer, Boolean> second = new HashMap<>();
   

    public Action bestMove(TicTacToeWithReinforcement.State state,TicTacToeWithReinforcement.State prevstate ) {
        Iterable<TicTacToeWithReinforcement.Action> moves = state.moves();
        Iterator iter = moves.iterator();
        TicTacToeWithReinforcement.Action action = null;
        ArrayList<TicTacToeWithReinforcement.Action> possibleMoves = new ArrayList<>();
//        Action best = (Action)action;
        HashMap<Integer, Boolean> map = first;
        if(state.player == TicTacToeWithReinforcement.Player.YOU) {
            map = second;
        }
        while(iter.hasNext()) {
            action = (TicTacToeWithReinforcement.Action) iter.next();
            if(map.getOrDefault(state.next(action).hashCode(), true)) {
//                System.out.println("adding move");
                possibleMoves.add(action);
            }
        }
        if(possibleMoves.size() == 0) {
//            System.out.println("THIS IS HAPPENING");
//            System.out.println("it is" +state.player.mark()+ "turn");
//            System.out.println(state);
            
            map.put(prevstate.hashCode(), Boolean.FALSE);
            iter = moves.iterator();
            return (Action)iter.next();
        }
        
        int index = (int)(Math.random() * possibleMoves.size());    
//        System.out.println("index is " + index);
//        System.out.println("possmoves size is " + possibleMoves.size());
//        System.out.println(state.board);
        return (Action)possibleMoves.get(index);
        
    }
    public void train() {
        for(int i = 0; i < 100000; i++) {
            PlayTrainingGame();
//            System.out.println("---------------------");
//            System.out.println(first.size());
//            System.out.println(second.size());
        }
    }
    
    public void PlayTrainingGame() {
        TicTacToeWithReinforcement.State state = new TicTacToeWithReinforcement.State(TicTacToeWithReinforcement.Player.ME);
        TicTacToeWithReinforcement.State prevState = new TicTacToeWithReinforcement.State(TicTacToeWithReinforcement.Player.YOU);
        int count = 0;
        while (state.emptySquares() > 0) {
            
            state.player = TicTacToeWithReinforcement.Player.ME;

            if (state.wins(TicTacToeWithReinforcement.Player.YOU)) {
//                System.out.println("You won !!!");
                first.put(prevState.hashCode(), Boolean.FALSE);
                break;
            } else if (state.emptySquares() == 0) {
//                System.out.println("Tie");
                break;
            }
            Action action = bestMove(state,prevState);
            prevState = state;
            state = state.next((TicTacToeWithReinforcement.Action)action);
            state.player = TicTacToeWithReinforcement.Player.YOU;
            if (state.wins(TicTacToeWithReinforcement.Player.ME)) {
                second.put(prevState.hashCode(), Boolean.FALSE);
//                System.out.println(prevState.hashCode());
//                System.out.println("I won !!!");
                break;
            } else if (state.emptySquares() == 0) {
//                System.out.println("Tie");

                break;
            }
            action = bestMove(state, prevState);
            prevState = state;
            state = state.next((TicTacToeWithReinforcement.Action)action);
        }
    }

}
