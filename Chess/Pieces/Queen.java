package Chess.Pieces;

import Chess.Piece;
import Chess.Position;

public class Queen extends Piece {
    int column;
    int row;

    boolean isValidMove(Position newPosition) {
        if (!super.isvalidMove(newPosition)) {
            return false;
        } 
        
        if ((Math.abs(newPosition.column - this.column) == Math.abs(newPosition.row - this.row)) && (newPosition.row == this.row || newPosition.column == this.column)) {
            return true;
        } else {
            return false;
        }
        
        
        
        

    }
}
