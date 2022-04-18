package Chess;

public class Piece {
    Position position;

    public boolean isvalidMove(Position newPosition) {
        if (newPosition.row > 0 && newPosition.column > 0 && newPosition.row < 8 && newPosition.column < 8) {
            return true;
        }else{
            return false;
        }
    }

    public Position getPosition(){
        return this.position;
    }

    public void setPosition(Position newPosition){
        if (isvalidMove(newPosition)) {
            this.position = newPosition;
        }
    }
}
