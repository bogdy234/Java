package Game2D;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Enemy {
    private double x;
    private double y;

    private BufferedImage enemy;

    Game game;

    public Enemy(double x, double y,Game game) {
        this.x = x;
        this.y = y;
        this.game=game;

        SpriteSheet ss = new SpriteSheet(game.getSpriteSheet());
        enemy=ss.grabImage(0,0,50,50);
    }

    public void render(Graphics g){
        g.drawImage(enemy,(int)x,(int)y,null);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
