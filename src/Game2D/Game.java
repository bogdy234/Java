package Game2D;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Game extends Canvas implements Runnable {

    public static final int WIDTH_WINDOW = 960;
    public static final int HEIGHT_WINDOW = WIDTH_WINDOW / 12 * 9;
    public final String TITLE = "2D GAME";

    private BufferedImage image = new BufferedImage(WIDTH_WINDOW, HEIGHT_WINDOW, BufferedImage.TYPE_INT_RGB);
    private BufferedImage spriteSheet = null;

    private boolean isRunning = false;
    private Thread thread;

    private Player p;
    private Enemy[] enemies;


    private synchronized void start() {
        if (isRunning)
            return;
        isRunning = true;
        thread = new Thread(this);
        thread.start();
    }

    private synchronized void stop() {
        if (!isRunning)
            return;
        isRunning = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    public void init() {
        requestFocus();
        BufferedImageLoader loader = new BufferedImageLoader();
        try {
            spriteSheet = loader.loadImage("/image2.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        p = new Player(200, 200, this);
        addKeyListener(new KeyInput(this));
    }

    @Override
    public void run() {
        init();
        long lastTime = System.nanoTime();
        final double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        int updates = 0;
        int frames = 0;
        long timer = System.currentTimeMillis();

        while (isRunning) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            if (delta >= 1) {
                tick();
                updates++;
                delta--;
            }
            render();
            frames++;
            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                System.out.println(updates + " Ticks,Fps " + frames);
                updates = 0;
                frames = 0;
            }
        }
        stop();
    }

    private void tick() {
        p.tick();
    }

    private void render() {
        BufferStrategy bufferStrategy = this.getBufferStrategy();  //from Canvas inherit

        if (bufferStrategy == null)   // ca sa se faca doar prima data
        {
            createBufferStrategy(3);
            return;
        }


        Graphics g = bufferStrategy.getDrawGraphics();
        //////////////////////  here draw things

        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        p.render(g);
        //////////////////////
        g.dispose();
        bufferStrategy.show();

    }

    public static void main(String[] args) {
        Game game = new Game();

        JFrame gameWindow = new JFrame();
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.add(game);
        gameWindow.setPreferredSize(new Dimension(WIDTH_WINDOW, HEIGHT_WINDOW));
        gameWindow.setMaximumSize(new Dimension(WIDTH_WINDOW, HEIGHT_WINDOW));
        gameWindow.setMinimumSize(new Dimension(WIDTH_WINDOW, HEIGHT_WINDOW));

        gameWindow.setTitle(game.TITLE);
        gameWindow.pack();

        gameWindow.setResizable(false);
        gameWindow.setLocationRelativeTo(null);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        gameWindow.setLocation(dim.width / 2 - gameWindow.getWidth() / 2, dim.height / 2 - gameWindow.getHeight() / 2);
        gameWindow.setLayout(null);
        gameWindow.setVisible(true);
        game.start();

    }

    public BufferedImage getSpriteSheet() {
        return spriteSheet;
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyChar();
        if (key == 'w') {
            p.setVelY(0);
        }
        else if (key=='s'){
            p.setVelY(0);

        }
        else if (key=='a'){
            p.setVelX(0);

        }
        else if (key=='d'){
            p.setVelX(0);
        }
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyChar();
        if (key == 'w') {
            p.setVelY(-2);
        }
        else if (key=='s'){
            p.setVelY(2);

        }
        else if (key=='a'){
            p.setVelX(-2);

        }
        else if (key=='d'){
            p.setVelX(2);
        }
    }
}
