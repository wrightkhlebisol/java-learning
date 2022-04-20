package Chess.Pieces;

import Chess.Piece;
import Chess.Position;

public class Bishop extends Piece {
    int column;
    int row;

    boolean isValidMove(Position newPosition) {
        if (!super.isvalidMove(newPosition)) {
            return false;
        }

        if (Math.abs(newPosition.column - this.column) == Math.abs(newPosition.row - this.row)) {
            return true;
        } else {
            return false;
        }
        
    }
}
