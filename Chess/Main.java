package Chess;

import Chess.Pieces.Queen;
import Chess.Position;

public class Main {
    public static void main(String[] args) {
        Queen queen = new Queen();
        Position testPosition = new Position(3, 5);
        queen.setPosition(testPosition);

        if (queen.isvalidMove(testPosition)) {
            System.out.println("Yes, I can move there");
            System.out.println(queen.getPosition());
        } else {
            System.out.println("Nope, can't do!");
            System.out.println(queen.getPosition());
        }
    }
}
