package robot_move;

/**
 * Class contains the robot's position in Two-dimensional space,
 * look direction and move options. 
 * 
 * @author yakov
 *
 */
public final class Robot {
	
	private int _x;
	private int _y;
	private Direction _direction;
	
	public Robot() {
	}

	public Robot(int x, int y, Direction direction) {
		super();
		this._x = x;
		this._y = y;
		this._direction = direction;
	}
	

    public int getX() {
		return _x;
	}

	public int getY() {
		return _y;
	}

	public Direction getDirection() {
		return _direction;
	}

	public void setX(int x) {
		_x = x;
	}

	public void setY(int y) {
		_y = y;
	}

	public void setDirection(Direction direction) {
		_direction = direction;
	}

	/*
     * Robot rotates counterclockwise by 90 degrees
     */
	public void turnLeft() {
    	if (getDirection() == Direction.LEFT) {
    		_direction = Direction.DOWN;
    	} else if(getDirection() == Direction.DOWN) {
    		_direction = Direction.RIGHT;
    	} else if(getDirection() == Direction.RIGHT) {
    		_direction = Direction.UP;
    	} else if(getDirection() == Direction.UP) {
    		_direction = Direction.LEFT;
    	}
    }

	/*
     * Robot rotates clockwise by 90 degrees
     */
    public void turnRight() {
    	if (getDirection() == Direction.LEFT) {
    		_direction = Direction.UP;
    	} else if(getDirection() == Direction.UP) {
    		_direction = Direction.RIGHT;
    	} else if(getDirection() == Direction.RIGHT) {
    		_direction = Direction.DOWN;
    	} else if(getDirection() == Direction.DOWN) {
    		_direction = Direction.LEFT;
    	}   	
    }

    /*
     * Robot makes one step in the direction of the look
     */
    public void stepForward() {
    	if (getDirection() == Direction.LEFT) {
    		_x--;
    	} else if(getDirection() == Direction.UP) {
    		_y++;
    	} else if(getDirection() == Direction.RIGHT) {
    		_x++;
    	} else if(getDirection() == Direction.DOWN) {
    		_y--;
    	}   	
    }
}
