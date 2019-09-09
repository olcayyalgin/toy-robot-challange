import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotTest {

    private Robot robot;

    @BeforeEach
    void init(){
        robot = new Robot();
        robot.setY(2);
        robot.setX(3);
        robot.setFacing(RobotSimulatorUtility.Direction.NORTH);
    }


    /**
     * Checks Robot's class methods increase, decrease
     * After I will separate exceptional condition, this method tests all condition about move.
     *
     */

    @Test
    void testIncreseDecrease(){
        robot.decreasePositionX();

        assertEquals(2,robot.getX());
        assertEquals(2,robot.getY());

        robot.increasePositionX();

        assertEquals(3,robot.getX());
        assertEquals(2,robot.getY());

        robot.increasePositionY();

        assertEquals(3,robot.getX());
        assertEquals(3,robot.getY());

        robot.decreasePositionY();

        assertEquals(3,robot.getX());
        assertEquals(2,robot.getY());



        robot.decreasePositionX();
        robot.decreasePositionX();
        robot.decreasePositionX();
        robot.decreasePositionX();
        robot.decreasePositionX();

        assertEquals(0,robot.getX());
        assertEquals(2,robot.getY());

        robot.increasePositionY();
        robot.increasePositionY();
        robot.increasePositionY();
        robot.increasePositionY();
        robot.increasePositionY();
        robot.increasePositionY();

        assertEquals(4,robot.getY());
        assertEquals(0,robot.getX());

        robot.increasePositionX();
        robot.increasePositionX();
        robot.increasePositionX();
        robot.increasePositionX();
        /*robot.increasePositionX();
        robot.increasePositionX();
        robot.increasePositionX();*/

        assertEquals(4,robot.getX());
        assertEquals(4,robot.getY());

        robot.decreasePositionY();
        robot.decreasePositionY();
        robot.decreasePositionY();
        robot.decreasePositionY();
        robot.decreasePositionY();
        robot.decreasePositionY();
        robot.decreasePositionY();

        assertEquals(4,robot.getX());
        assertEquals(0,robot.getY());

    }

    @Test
    public void testChangeDirector(){
        robot.changeDirectionRight();
        assertEquals(RobotSimulatorUtility.Direction.EAST, robot.getFacing());

        robot.changeDirectionRight();
        assertEquals(RobotSimulatorUtility.Direction.SOUTH, robot.getFacing());

        robot.changeDirectionRight();
        assertEquals(RobotSimulatorUtility.Direction.WEST,robot.getFacing());

        robot.changeDirectionRight();
        assertEquals(RobotSimulatorUtility.Direction.NORTH, robot.getFacing());

        robot.changeDirectionLeft();
        assertEquals(RobotSimulatorUtility.Direction.WEST,robot.getFacing());

        robot.changeDirectionLeft();
        assertEquals(RobotSimulatorUtility.Direction.SOUTH,robot.getFacing());

        robot.changeDirectionLeft();
        assertEquals(RobotSimulatorUtility.Direction.EAST,robot.getFacing());

        robot.changeDirectionLeft();
        assertEquals(RobotSimulatorUtility.Direction.NORTH,robot.getFacing());
    }
}
