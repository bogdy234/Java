package Game2D;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Player {
    private double x;
    private double y;

    private double velX=0;
    private double velY=0;

    private BufferedImage player;

    private KeyInput keyInput;

    Game game;

    public void setVelX(double velX) {
        this.velX = velX;
    }

    public void setVelY(double velY) {
        this.velY = velY;
    }



    public Player(double x, double y,Game game) {
        this.x = x;
        this.y = y;

        SpriteSheet ss = new SpriteSheet(game.getSpriteSheet());
        player = ss.grabImage(1,1,80,80);
    }

    public void render(Graphics g){
        g.drawImage(player,(int)x,(int)y,null);
    }

    public void tick(){
        x+=velX;
        y+=velY;
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
