import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RobotSimulatorApplication {

    static Robot robot = new Robot();

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.print("Command : ");
                String input = br.readLine();

                executeCommand(input);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void executeCommand(String command){

        if(RobotSimulatorUtility.isCommandPlace(command)){
            robot.setX(Integer.valueOf(RobotSimulatorUtility.splitPlaceCommand(command).get(1)));
            robot.setY(Integer.valueOf(RobotSimulatorUtility.splitPlaceCommand(command).get(2)));
            String facing =RobotSimulatorUtility.splitPlaceCommand(command).get(3);
            robot.setFacing(RobotSimulatorUtility.Direction.getDirection(facing));

        }else if(RobotSimulatorUtility.isCommandLeft(command)){
            robot.changeDirectionLeft();

        }else if(RobotSimulatorUtility.isCommandRight(command)) {
            robot.changeDirectionRight();

        }else if(RobotSimulatorUtility.isCommandMove(command)){
            RobotSimulatorUtility.Direction direction= robot.getFacing();
            direction.move(robot);

        }else if(RobotSimulatorUtility.isCommandReport(command)){
            System.out.println(robot.toString());
        }
    }

    public static Robot getRobot(){
        return robot;
    }

}
