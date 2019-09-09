import java.util.Objects;

public class Robot {

    private int x;
    private int y;
    private RobotSimulatorUtility.Direction facing;

    private static int UPPER_LIMIT =4;
    private static int LOWER_LIMIT=0;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public RobotSimulatorUtility.Direction getFacing() {
        return facing;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setFacing(RobotSimulatorUtility.Direction facing) {
        this.facing = facing;
    }

    public Robot() {
    }

    public Robot(int x, int y, RobotSimulatorUtility.Direction facing) {
        this.x = x;
        this.y = y;
        this.facing = facing;
    }

    public void increasePositionY(){
        if(!atPositionUpperLimit(this.getY())){
            this.setY(this.getY()+1);
        }
    }

    public void decreasePositionY(){
        if(!atPositionLowerLimit(this.getY())){
            this.setY(this.getY()-1);
        }
    }

    public void decreasePositionX(){
        if(!atPositionLowerLimit(this.getX())){
            this.setX(this.getX()-1);
        }
    }

    public void increasePositionX(){
        if(!atPositionUpperLimit(this.getX())){
            this.setX(this.getX()+1);
        }
    }

    public void changeDirectionLeft(){
        int newDirectionNo =this.getFacing().directionNo-1;
        this.setFacing(RobotSimulatorUtility.Direction.getDirection(Math.floorMod(newDirectionNo,4)));
    }

    public void changeDirectionRight(){
        int newDirectionNo =this.getFacing().directionNo+1;
        this.setFacing(RobotSimulatorUtility.Direction.getDirection(Math.floorMod(newDirectionNo,4)));
    }

    private boolean atPositionUpperLimit(int position){
       return position == UPPER_LIMIT;
    }

    private boolean atPositionLowerLimit(int position){
        return position == LOWER_LIMIT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Robot robot = (Robot) o;
        return x == robot.x &&
                y == robot.y &&
                Objects.equals(facing, robot.facing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, facing);
    }

    @Override
    public String toString() {
        return x+","+y+","+facing.direction;
    }
}


