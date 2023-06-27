package ExerciseProject.MTank;

public class Tank {
    private int x;
    private int y;

    private int direct; // 0 1 2 3
    private int speed;

    boolean isLive = true;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }
    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void moveUp() {
        this.y -= speed;
    }
    public void moveDown() {
        this.y += speed;
    }
    public void moveRight() {
        this.x += speed;
    }
    public void moveLeft() {
        this.x -= speed;
    }
}
