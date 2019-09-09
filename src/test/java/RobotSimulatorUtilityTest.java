import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RobotSimulatorUtilityTest {


    /**
     * Utility class checks if user's input is correct or which command.
     */
    @Test
    public void testIsCommandPlace(){
        String placeCommand1_TRUE = "place 2,3,NORTH";
        String placeCommand2_TRUE = "PLACE 2, 3, NORTH";


        String placeCommand3_TRUE = "place 0,0, NORTH";
        String placeCommand4_TRUE = "place 0,0, EAST";
        String placeCommand5_TRUE = "place 0,0, WEST";
        String placeCommand6_TRUE = "place 0,0, SOUTH";

        String placeCommand7_FALSE = "MOVE 0,0, NORTH";
        String placeCommand8_FALSE = "PLAC 0,0,  NORTH";
        String placeCommand9_FALSE = "PLACE 0,0 ,NORTH";

        String placeCommand10_TRUE = "place 0,0, NORTH ";
        String placeCommand11_TRUE = "place 0,0, EAST ";
        String placeCommand12_TRUE = "place 0,0, WEST ";
        String placeCommand13_TRUE = "place 0,0, SOUTH ";

        String placeCommand14_FALSE = "place 0,0, SOUT";

        String placeCommand15_FALSE = "place 5,5, NORTH";

        assertTrue(RobotSimulatorUtility.isCommandPlace(placeCommand1_TRUE));
        assertTrue(RobotSimulatorUtility.isCommandPlace(placeCommand2_TRUE));
        assertTrue(RobotSimulatorUtility.isCommandPlace(placeCommand3_TRUE));
        assertTrue(RobotSimulatorUtility.isCommandPlace(placeCommand4_TRUE));
        assertTrue(RobotSimulatorUtility.isCommandPlace(placeCommand5_TRUE));
        assertTrue(RobotSimulatorUtility.isCommandPlace(placeCommand6_TRUE));
        assertTrue(!RobotSimulatorUtility.isCommandPlace(placeCommand7_FALSE));
        assertTrue(!RobotSimulatorUtility.isCommandPlace(placeCommand8_FALSE));
        assertTrue(!RobotSimulatorUtility.isCommandPlace(placeCommand9_FALSE));
        assertTrue(RobotSimulatorUtility.isCommandPlace(placeCommand10_TRUE));
        assertTrue(RobotSimulatorUtility.isCommandPlace(placeCommand11_TRUE));
        assertTrue(RobotSimulatorUtility.isCommandPlace(placeCommand12_TRUE));
        assertTrue(RobotSimulatorUtility.isCommandPlace(placeCommand13_TRUE));
        assertTrue(!RobotSimulatorUtility.isCommandPlace(placeCommand14_FALSE));
        assertTrue(!RobotSimulatorUtility.isCommandPlace(placeCommand15_FALSE));

    }

    @Test
    public void testIsCommandMove(){
        String moveCommand_true ="MOVE";
        String moveCommand2_true ="move";
        String moveCommand3_true ="MOVE ";
        String moveCommand4_true ="move ";
        String moveCommand5_false ="movex";

        assertTrue(RobotSimulatorUtility.isCommandMove(moveCommand_true));
        assertTrue(RobotSimulatorUtility.isCommandMove(moveCommand2_true));
        assertTrue(RobotSimulatorUtility.isCommandMove(moveCommand3_true));
        assertTrue(RobotSimulatorUtility.isCommandMove(moveCommand4_true));
        assertTrue(!RobotSimulatorUtility.isCommandMove(moveCommand5_false));

    }

    @Test
    public void testIsCommandRight(){
        String command_true ="RIGHT";
        String command2_true ="right";
        String command3_true ="RIGHT ";
        String command4_true ="right ";
        String command5_false ="righx";

        assertTrue(RobotSimulatorUtility.isCommandRight(command_true));
        assertTrue(RobotSimulatorUtility.isCommandRight(command2_true));
        assertTrue(RobotSimulatorUtility.isCommandRight(command3_true));
        assertTrue(RobotSimulatorUtility.isCommandRight(command4_true));
        assertTrue(!RobotSimulatorUtility.isCommandRight(command5_false));

    }

    @Test
    public void testIsCommandLeft(){
        String command_true ="LEFT";
        String command2_true ="left";
        String command3_true ="LEFT ";
        String command4_true ="left ";
        String command5_false ="leftx";

        assertTrue(RobotSimulatorUtility.isCommandLeft(command_true));
        assertTrue(RobotSimulatorUtility.isCommandLeft(command2_true));
        assertTrue(RobotSimulatorUtility.isCommandLeft(command3_true));
        assertTrue(RobotSimulatorUtility.isCommandLeft(command4_true));
        assertTrue(!RobotSimulatorUtility.isCommandLeft(command5_false));

    }

    @Test
    public void testIsCommandReport(){
        String command_true ="REPORT";
        String command2_true ="report";
        String command3_true ="REPORT ";
        String command4_true ="report ";
        String command5_false ="reportx";

        assertTrue(RobotSimulatorUtility.isCommandReport(command_true));
        assertTrue(RobotSimulatorUtility.isCommandReport(command2_true));
        assertTrue(RobotSimulatorUtility.isCommandReport(command3_true));
        assertTrue(RobotSimulatorUtility.isCommandReport(command4_true));
        assertTrue(!RobotSimulatorUtility.isCommandReport(command5_false));

    }

    @Test
    public void testSplitPlaceCommand(){
        String placeCommand1 = "place 2,3,NORTH";
        String placeCommand2 = "PLACE 4, 3, NORTH";

       assertEquals("place", RobotSimulatorUtility.splitPlaceCommand(placeCommand1).get(0));
       assertEquals("NORTH", RobotSimulatorUtility.splitPlaceCommand(placeCommand1).get(3));
       assertEquals("4",  RobotSimulatorUtility.splitPlaceCommand(placeCommand2).get(1));

    }

    @Test
    public void testModulus(){
        int x = -1;

        assertEquals(3, Math.floorMod(x,4));

    }

}
