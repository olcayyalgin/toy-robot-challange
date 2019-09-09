import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotSimulatorTest {

    @Test
    public void testPlaceCommand(){

        String commandPlace = "PLACE 2,1, EAST";
        RobotSimulatorApplication.executeCommand(commandPlace);

        assertEquals("2,1,EAST", RobotSimulatorApplication.getRobot().toString());

    }

    /**
     * The method checks robot's location after executing some commands.
     * A lot of case was written same test method,
     * if I had time, I would separete each condition.
     *
     */

    @Test
    public void should_RobotPosition_when_doneCommands(){

        RobotSimulatorApplication.executeCommand("PLACE 2,1, EAST");
        RobotSimulatorApplication.executeCommand("MOVE");

        assertEquals("3,1,EAST", RobotSimulatorApplication.getRobot().toString());

        RobotSimulatorApplication.executeCommand("MOVE");

        assertEquals("4,1,EAST", RobotSimulatorApplication.getRobot().toString());

        RobotSimulatorApplication.executeCommand("MOVE");

        assertEquals("4,1,EAST", RobotSimulatorApplication.getRobot().toString());

        RobotSimulatorApplication.executeCommand("PLACE 3,3, NORTH");
        RobotSimulatorApplication.executeCommand("MOVE");

        assertEquals("3,4,NORTH", RobotSimulatorApplication.getRobot().toString());

        RobotSimulatorApplication.executeCommand("MOVE");
        RobotSimulatorApplication.executeCommand("MOVE");


        assertEquals("3,4,NORTH", RobotSimulatorApplication.getRobot().toString());

        RobotSimulatorApplication.executeCommand("LEFT");
        RobotSimulatorApplication.executeCommand("MOVE");
        RobotSimulatorApplication.executeCommand("MOVE");

        assertEquals("1,4,WEST", RobotSimulatorApplication.getRobot().toString());

        RobotSimulatorApplication.executeCommand("MOVE");
        RobotSimulatorApplication.executeCommand("MOVE");

        assertEquals("0,4,WEST", RobotSimulatorApplication.getRobot().toString());

        RobotSimulatorApplication.executeCommand("left");
        RobotSimulatorApplication.executeCommand("MOVE");

        assertEquals("0,3,SOUTH", RobotSimulatorApplication.getRobot().toString());

        RobotSimulatorApplication.executeCommand("left");
        RobotSimulatorApplication.executeCommand("MOVE");
        RobotSimulatorApplication.executeCommand("MOVE");

        assertEquals("2,3,EAST", RobotSimulatorApplication.getRobot().toString());

        RobotSimulatorApplication.executeCommand("MOVE");
        RobotSimulatorApplication.executeCommand("MOVE");
        RobotSimulatorApplication.executeCommand("MOVE");

        assertEquals("4,3,EAST", RobotSimulatorApplication.getRobot().toString());


        RobotSimulatorApplication.executeCommand("RIGHT ");
        RobotSimulatorApplication.executeCommand("MOVE");
        RobotSimulatorApplication.executeCommand("MOVE");

        assertEquals("4,1,SOUTH", RobotSimulatorApplication.getRobot().toString());

        RobotSimulatorApplication.executeCommand("MOVE");
        RobotSimulatorApplication.executeCommand("MOVE");

        assertEquals("4,0,SOUTH", RobotSimulatorApplication.getRobot().toString());

        RobotSimulatorApplication.executeCommand("left");
        RobotSimulatorApplication.executeCommand("LEFT");

        RobotSimulatorApplication.executeCommand("MOVE");
        RobotSimulatorApplication.executeCommand("MOVE");

        assertEquals("4,2,NORTH", RobotSimulatorApplication.getRobot().toString());

        RobotSimulatorApplication.executeCommand("MOVE");
        RobotSimulatorApplication.executeCommand("MOVE");
        RobotSimulatorApplication.executeCommand("MOVE");

        assertEquals("4,4,NORTH", RobotSimulatorApplication.getRobot().toString());

        RobotSimulatorApplication.executeCommand("RIGHT");

        RobotSimulatorApplication.executeCommand("MOVE");
        RobotSimulatorApplication.executeCommand("MOVE");

        assertEquals("4,4,EAST", RobotSimulatorApplication.getRobot().toString());

        RobotSimulatorApplication.executeCommand("PLACE 1,2,NORTH");

        RobotSimulatorApplication.executeCommand("LEFT");

        RobotSimulatorApplication.executeCommand("MOVE");
        RobotSimulatorApplication.executeCommand("MOVE");

        assertEquals("0,2,WEST", RobotSimulatorApplication.getRobot().toString());

        RobotSimulatorApplication.executeCommand("LEFT");

        RobotSimulatorApplication.executeCommand("MOVE");
        RobotSimulatorApplication.executeCommand("MOVE");
        RobotSimulatorApplication.executeCommand("MOVE");


        assertEquals("0,0,SOUTH", RobotSimulatorApplication.getRobot().toString());


    }

}
