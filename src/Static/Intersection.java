package Static;

import Model.Turn;

import java.util.List;

public class Intersection extends Static{
    List<Turn> turns;

    void addTurn(Turn turn) {
        turns.add(turn);
    }

}
