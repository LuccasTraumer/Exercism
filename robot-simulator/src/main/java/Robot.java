import com.sun.org.apache.xpath.internal.operations.Or;

public class Robot{

    private GridPosition gridPosition;
    private Orientation orientation;



    public Robot(GridPosition gridPosition, Orientation orientation){
        this.gridPosition = gridPosition;
        this.orientation = orientation;
    }
    public void turnRight(){
        if(this.orientation == Orientation.NORTH){
            this.orientation = Orientation.EAST;
        }
        else if(this.orientation == Orientation.EAST){
            this.orientation = Orientation.SOUTH;
        }else if(this.orientation == Orientation.SOUTH){
            this.orientation = Orientation.WEST;
        }
        else{
            this.orientation = Orientation.NORTH;
        }
    }
    public void turnLeft(){
        if(this.orientation == Orientation.NORTH){
            this.orientation = Orientation.WEST;
        }
        else if(this.orientation == Orientation.WEST){
            this.orientation =  Orientation.SOUTH;
        }
        else if(this.orientation == Orientation.SOUTH){
            this.orientation = Orientation.EAST;
        }else{
            this.orientation = Orientation.NORTH;
        }
    }
    public void advance(){
        GridPosition aux;
        if(this.orientation == Orientation.NORTH){
            int y = this.gridPosition.y +1;
            int x = this.gridPosition.x;
             aux = new GridPosition(x,y);
            this.gridPosition = aux;
        }
        else if(this.orientation == Orientation.SOUTH){
            int x = this.gridPosition.x;
            int y = this.gridPosition.y-1;
            aux = new GridPosition(x,y);
            this.gridPosition = aux;
        }
        else if(this.orientation == Orientation.EAST){
            int x = this.gridPosition.x+1;
            int y = this.gridPosition.y;
            aux = new GridPosition(x,y);
            this.gridPosition = aux;
        }else{
            int x = this.gridPosition.x -1;
            int y = this.gridPosition.y;
            aux = new GridPosition(x,y);
            this.gridPosition = aux;
        }
    }
    public void simulate(String comands){
        for(int i=0; i <= comands.length()-1;i++){
            if(comands.charAt(i) == 'R'){
                turnRight();
            }
            else if (comands.charAt(i) == 'L'){
                turnLeft();
            }else {
                advance();
            }
        }
    }

    public GridPosition getGridPosition() {
        return gridPosition;
    }

    public Orientation getOrientation() {
        return orientation;
    }
}