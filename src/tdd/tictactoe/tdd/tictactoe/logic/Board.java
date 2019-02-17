package tdd.tictactoe.tdd.tictactoe.logic;

import java.util.LinkedHashMap;
import java.util.Map;

public class Board {

    private Map<Integer, String> board = new LinkedHashMap<>();

    public Board() {
        for (int i = 1; i < 10; i++) {
            this.board.put(i, "");
        }
    }

    public Map<Integer, String> getBoard() {
        return board;
    }

    public boolean isWin() {
        if (board.get(1).equals(board.get(2)) && board.get(2).equals(board.get(3))) {
            if (!board.get(1).equals("")) {
                return true;
            }
        }
        if (board.get(4).equals(board.get(5)) && board.get(5).equals(board.get(6))) {
            if (!board.get(4).equals("")) {
                return true;
            }
        }
        if (board.get(7).equals(board.get(7)) && board.get(7).equals(board.get(7))) {
            if (!board.get(7).equals("")) {
                return true;
            }            }
        return false;
    }

}
