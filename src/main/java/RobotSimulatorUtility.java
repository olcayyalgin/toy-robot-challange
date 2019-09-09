import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RobotSimulatorUtility {

    public static final String PLACE_REGEX = "(?i)PLACE ([0-4])(,\\s?)([0-4])(,\\s?)(NORTH|WEST|SOUTH|EAST)\\s?$";
    public static final String MOVE_REGEX = "(?i)MOVE\\s?$";
    public static final String RIGHT_REGEX = "(?i)RIGHT\\s?$";
    public static final String LEFT_REGEX = "(?i)LEFT\\s?$";
    public static final String REPORT_REGEX = "(?i)REPORT\\s?$";

    public static final String SPLIT_REGEX = "(\\s|, |,)";

    private RobotSimulatorUtility() {
    }


    public static boolean isCommandPlace(String command) {
        return Pattern.compile(PLACE_REGEX)
                .matcher(command)
                .matches();
    }

    public static boolean isCommandMove(String command) {
        return Pattern.compile(MOVE_REGEX)
                .matcher(command)
                .matches();
    }

    public static boolean isCommandRight(String command) {
        return Pattern.compile(RIGHT_REGEX)
                .matcher(command)
                .matches();
    }


    public static boolean isCommandLeft(String command) {
        return Pattern.compile(LEFT_REGEX)
                .matcher(command)
                .matches();
    }


    public static boolean isCommandReport(String command) {
        return Pattern.compile(REPORT_REGEX)
                .matcher(command)
                .matches();
    }


    public static List<String> splitPlaceCommand(String command) {
        return Stream.of(command.split(SPLIT_REGEX))
                .map(s-> new String(s))
                .collect(Collectors.toList());
    }

    public static enum Direction{
        NORTH(0,"NORTH") {
            @Override
            void move(Robot robot) {
                robot.increasePositionY();
            }
        },
        EAST(1,"EAST") {
            @Override
            void move(Robot robot) {
                robot.increasePositionX();
            }
        },
        SOUTH(2,"SOUTH") {
            @Override
            void move(Robot robot) {
                robot.decreasePositionY();
            }
        },
        WEST(3,"WEST") {
            @Override
            void move(Robot robot) {
                robot.decreasePositionX();
            }
        };

        public String direction;
        public int directionNo;

        Direction(int directionNo,String direction){
            this.direction = direction;
            this.directionNo = directionNo;
        }

        public static Direction getDirection(String direction){
           return Arrays.stream(Direction.values())
                   .filter(d-> direction.equals(d.direction))
                   .findFirst()
                   .get();
        }

        public static Direction getDirection(int directionNo){
            return Arrays.stream(Direction.values())
                    .filter(d-> d.directionNo ==directionNo)
                    .findFirst()
                    .get();
        }

        abstract void move(Robot robot);
    }


}
