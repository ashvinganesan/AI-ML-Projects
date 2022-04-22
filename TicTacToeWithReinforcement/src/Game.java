/*
Ashvin Ganesan
Artificial Intelligence
Monday December 13th 2021
TicTacToe Project Final Checkpoint
 */
public class Game {

    public static interface State<Action> {
        public int evaluate();
        public boolean isTerminal();
        public State next(Action action);
        public Iterable<Action> moves();
    }
}
