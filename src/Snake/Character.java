package Snake;

import javax.swing.*;
import java.awt.*;

public class Character extends JComponent {

    private int x;
    private int y;
    private int velX=5;
    private int velY=5;

    private int direction = 1;

    public Character(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, Utils.CHARACTER_SIZE, Utils.CHARACTER_SIZE);
    }

    public void move() {
        if (direction == 1)
            x = x + velX;
        else if (direction == 0)
            x = x - velX;
        else if (direction == -1)
            y = y - velY;
        else if (direction == -2)
            y = y + velY;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setVelX(int velX) {
        this.velX = velX;
    }

    public void setVelY(int velY) {
        this.velY = velY;
    }

    public int getDirection() {
        return direction;
    }
}
