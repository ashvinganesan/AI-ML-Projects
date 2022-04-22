//Ashvin Ganesan
//Machine Learning
//Thursday January 28th 2021
//TicTacToe with Reinforcement

import java.util.Iterator;
import java.io.Console;

public class TicTacToeWithReinforcement {

    public static enum Player {
        ME('X') {
            @Override
            public Player other() {
                return Player.YOU;
            }
        },

        YOU('O') {
            @Override
            public Player other() {
                return Player.ME;
            }
        };

        private final char mark;

        private Player(char mark) {
            this.mark = mark;
        }
        
        public char mark() {
            return this.mark;
        }

        public abstract Player other();
    }


    public static class Action {
        int row;
        int col;
        Player player;
        public Action(int row, int col, Player player) {
            this.row = row;
            this.col = col;
            this.player = player;
        }
    }


    public static class State implements Game.State<Action> {

        public static final int N = 3;
        public char[] board = new char[9];
        public Player player = Player.ME;

        public State(Player player) {
            this.player = player;
            for(int i = 0; i < board.length; i++) {
                board[i] = ' ';
                
            }
        }

        public State(State state, Action move) {
            this.player = move.player.other();
            board = state.board.clone();
            board[move.row*3+move.col] = move.player.mark();
        }

        public int emptySquares() {
            int count = 0;
            for(int i = 0; i < board.length; i++) {
                if(board[i] == ' ') {
                    count++;
                }
            }
            return count;
        }

        public char get(int row, int col) {
            return board[(row)*3+col];
        }
        
        
        public boolean isEmpty(int row, int col) {
           return board[row*3+col] == ' ';
        }

        public boolean wins(Player player) {
            char c = player.mark();
            String win = ""+c+c+c;
            String row1 = "" + board[0]+board[1]+board[2];
            String row2 = "" + board[3]+board[4]+board[5];
            String row3 = "" + board[6]+board[7]+board[8];
            String col1 = "" + board[0]+board[3]+board[6];
            String col2 = "" + board[1]+board[4]+board[7];
            String col3 = "" + board[2]+board[5]+board[8];
            String diag1 = "" + board[0]+board[4]+board[8];
            String diag2 = "" + board[2]+board[4]+board[6];
            if(win.equals(row1) || win.equals(row2) || win.equals(row3) || win.equals(col1) || win.equals(col2) || win.equals(col3) || win.equals(diag1) || win.equals(diag2)) {
                return true;
            }        
            return false;
        }

        @Override
        public boolean isTerminal() {
            if(this.emptySquares() == 0) {
                return true;
            }
            if(wins(player)) {
                return true;
            }
            if(wins(player.other())) {
                return true;
            }
            return false;
        }

        @Override
        public int evaluate() {
            if (wins(Player.ME))
                return 1;
            else if(wins(Player.YOU)) {
                return -1;
            }
            return 0;
        }

        @Override
        public State next(Action action) {
            return new State(this, action);
        }

        @Override
        public Iterable<Action> moves() {
            return new Iterable<Action> () {
                @Override
                public Iterator<Action> iterator() {
                    return State.this.new MoveIterator();
                }
            };
        }

        @Override
        public String toString() {
            String result = "";
            String separator = " ";
            for (int row = 0; row < N; row++) {
                if (row > 0) {
                    result += " \n";
                    result += "---+---+---\n";
                    separator = " ";
                }
                for (int col = 0; col < N; col++) {
                    result += separator;
                    result += get(row, col);
                    separator = " | ";
                }
            }
            result += " \n";
            return result;
        }
@Override
        public int hashCode() {
            int count = 0;
            int index = 1;
            for(char c: board) {
                if(c == 'O') {
                    count = 3*count+1;
                } else if(c == 'X') {
                    count = 3*count+2;
                }
                else{
                    count = count*3;
                }
            }
            return count;
        }

        private class MoveIterator implements Iterator<Action> {
            int index = 0;
            @Override
            public boolean hasNext() {
                for(int i = index; i < board.length; i++) {
                    if(board[i] == ' ') {
                        return true;
                    }
                }
                return false;
            }

            @Override
            public Action next() {
                for(int i = index; i < board.length; i++) {
                    if(board[i] == ' ') {
                        index++;
                        return new Action(i/3, i%3, player);
                    }
                }
                System.out.println("Index is " + index);
                System.out.println("RETURNING NULL");
                return null;
            }
        }
    }

    public static void main(String[] args) {
        TicTacToeWithReinforcement.State state = new TicTacToeWithReinforcement.State(Player.ME);
        ReinforcementLearning<Action> rlearner = new ReinforcementLearning<>();
        rlearner.train();
    //    System.exit(0);
        Console console = System.console();
        while (state.emptySquares() > 0) {
            if (state.wins(Player.YOU)) {
                System.out.println("You won !!!");
                break;
            } else if (state.emptySquares() == 0) {
                System.out.println("Tie !!!");
                break;
            }

            Action action = rlearner.bestMove(state,null);
            //System.out.println("row " + action.row +"col " + action.col);
            state = state.next(action);
            System.out.println(state);

            if (state.wins(Player.ME)) {
                System.out.println("I won !!!");
                break;
            } else if (state.emptySquares() == 0) {
                System.out.println("Tie !!!");
                break;
            }
            
            int row = 0;
            int col = 0;
            String line = "";
            do {
                do {
                    line = console.readLine("Row: ");
                    try {
                        row = Integer.parseInt(line) - 1;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid row: " + line);
                    }
                    if (row >= 0 && row < 3) break;
                    System.out.println("Invalid row: " + line);
                } while (true);
                
                do {
                    line = console.readLine("Col: ");
                    try {
                        col = Integer.parseInt(line) - 1;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid column: " + line);
                    }
                    if (col >= 0 && col < 3) break;
                    System.out.println("Invalid col: " + line);
                } while (true);
        
                if (state.isEmpty(row, col)) break;
                System.out.println("Square is not empty");
            } while (true);

            state = new State(state, new Action(row, col, Player.YOU));
        }
        System.out.println("TERMINATING");
    }
}

