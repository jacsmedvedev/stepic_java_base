package robot_move;

public class Main {

	public static void main(String[] args) {
		
		Robot robot = new Robot(2, 1, Direction.LEFT);
		RobotMove rm = new RobotMove(robot);
		
		System.out.println("Начальнаые координвты --- (" + robot.getX() + ";" + robot.getY() + ")");
		rm.moveRobot(robot, 8, 9);		
		System.out.println("Конечные координвты --- (" + robot.getX() + ";" + robot.getY() + ")");
	}
}
