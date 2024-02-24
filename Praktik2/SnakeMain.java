public class SnakeMain {
    public static void main(String[] args) {
        Snake snake1 = new Snake(3, 7);
        Snake snake2 = new Snake(5, 2);

        snake1.printPosition();
        snake2.printPosition();

        snake1.moveRight();
        snake1.moveUp();
        snake1.printPosition();

        snake2.moveLeft();
        snake2.moveDown();
        snake2.printPosition();
    }
}