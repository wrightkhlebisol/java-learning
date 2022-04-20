package Chess.Pieces;

import Chess.Piece;
import Chess.Position;

public class Rook extends Piece {
    int column;
    int row;
    
    public boolean isvalidMove(Position newPosition) {
        if (!super.isvalidMove(newPosition)) {
            return false;
        }
        
        if (newPosition.column == this.column || newPosition.row == this.row) {
            return true;
        } else {
            return false;
        }
    }
}
