package robot_move;

/**
 * 
 * Class contains robot movement logic from from the starting point 
 * to the given point. 
 * 
 * @author yakov
 *
 */
public class RobotMove {
	
	private Robot _robot;
	public RobotMove() {}

	public RobotMove(Robot robot) {
		super();
		_robot = robot;
	}

	public Robot getRobot() {
		return _robot;
	}

	public void setRobot(Robot robot) {
		_robot = robot;
	}

	public void moveRobot(Robot robot, int toX, int toY) {
		
		System.out.println("Заданные координвты --- (" + toX + ";" + toY + ")");
		
		int tempX = robot.getX();
		int tempY = robot.getY();
		
		if (robot.getX() == toX) {
			robot.setX(toX);
		}
		if (robot.getY() == toY) {
			robot.setX(toY);
		}
		if (robot.getX() < toX) {
			if (robot.getDirection() == Direction.LEFT) {
				robot.turnRight();
				robot.turnRight();
			} else if (robot.getDirection() == Direction.DOWN) {
				robot.turnLeft();
			} else if (robot.getDirection() == Direction.UP) {
				robot.turnRight();
			}
		} else {
			if (robot.getDirection() == Direction.DOWN) {
				robot.turnRight();
			} else if (robot.getDirection() == Direction.RIGHT) {
				robot.turnLeft();
				robot.turnLeft();
			} else if (robot.getDirection() == Direction.UP) {
				robot.turnLeft();
			}
		}
		for (int i = 0; i < Math.abs(toX - tempX); i++) {
			robot.stepForward();
		}
		if (robot.getY() < toY) {
			if (robot.getDirection() == Direction.LEFT) {
				robot.turnRight();
			} else if (robot.getDirection() == Direction.RIGHT) {
				robot.turnLeft();
				;
			} else if (robot.getDirection() == Direction.DOWN) {
				robot.turnLeft();
				robot.turnLeft();
			}
		} else {
			if (robot.getDirection() == Direction.LEFT) {
				robot.turnLeft();
			} else if (robot.getDirection() == Direction.RIGHT) {
				robot.turnRight();
			} else if (robot.getDirection() == Direction.UP) {
				robot.turnLeft();
				robot.turnLeft();
			}
		}
		for (int i = 0; i < Math.abs(toY - tempY); i++) {
			robot.stepForward();
		}
	}
}
