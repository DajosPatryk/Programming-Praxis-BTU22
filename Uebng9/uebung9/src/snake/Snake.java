package snake;

import java.util.LinkedList;

public class Snake implements ISnake {
    //private LinkedList<Body> body = new LinkedList<Body>();
    private GameBoard board;
    private char dir;
    
    /**
     * Creates a new Snake with default length in the middle of the Console.
     * Every body cell has the default position for x and y.
     *
     * The default direction should be GO_RIGHT.
     *
     * @param board
     *              Set the board of the snake to board.
     */
    public Snake(GameBoard board) {
        for (int i = 0; i < DEFAULT_START_LENGTH; i++) {
            body.add(new Body(10, 10));
        }
        this.dir = GO_RIGHT;
        this.board = board;
    }
    
    /**
     * Gets the cell length of the snake.
     * @return: cell length in integer.
     */
    public int getLength() {
        return body.size();
    }
    
    public void setDir(char dir) {
        this.dir = dir;
    }
    
    public char getDir() {
        return this.dir;
    }

    /**
     * Checks if snake ate an apple.
     * @return true: if snake ate an apple.
     */
    public boolean isEating() {
        if (body.get(0).getPositionX() == board.getAppleBody().getPositionX() && body.get(0).getPositionY() == board.getAppleBody().getPositionY()) {
            return true;
        }
        return false;
    }
    
    /**
     * Checks if the snake eats itself.
     * @return true: if snake eats itself.
     */
    public boolean isSelfEating() {
        for (int i = 1; i < body.size(); i++) {
            if (body.get(0).getPositionX() == body.get(i).getPositionX() && body.get(0).getPositionY() == body.get(i).getPositionY()) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Checks if the snake left the board.
     * @return true: if snake left the board.
     */
    public boolean leavesTheBoard() {
        if (body.get(0).getPositionX() == -1 || body.get(0).getPositionX() == 41) {
            return true;
        }
        if (body.get(0).getPositionY() == -1 || body.get(0).getPositionY() == 28) {
            return true;
        }
        return false;
    }
    
    /**
     * Moves the snake and checks if the snake left the board, ate itself or ate an apple.
     * @return true: if the snake is alive;
     * @return false: if the snake died;
     */
    public boolean move() {
        int x = 0;
        int y = 0;
        if (dir == 'd') {
            x = 1;
        }
        if (dir == 'w') {
            y = -1;
        }
        if (dir == 's') {
            y = 1;
        }
        if (dir == 'a') {
            x = -1;
        }
        int tempX = body.get(0).getPositionX();
        int tempY = body.get(0).getPositionY();
        body.get(0).setPositionX(body.get(0).getPositionX() + x);
        body.get(0).setPositionY(body.get(0).getPositionY() + y);
        for (int i = 1; i < body.size(); i++) {
            int temp = tempX;
            tempX = body.get(i).getPositionX();
            body.get(i).setPositionX(temp);
            temp = tempY;
            tempY = body.get(i).getPositionY();
            body.get(i).setPositionY(temp);
        }
        if (isEating()) {
            board.setApple();
            body.add(new Body(body.get(body.size() - 1).getPositionX() - x, body.get(body.size() - 1).getPositionY() - y));
        }
        if (leavesTheBoard()) {
            return false;
        }
        if(isSelfEating()){
            return false;
        }
        return true;
    }
}
