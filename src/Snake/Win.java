package Snake;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Win extends JFrame implements Runnable {

    Character character;
    private List<Character> parts;
    private static boolean isRunning = false;
    Thread thread;
    Character point;
    private int score = 0;
    private JLabel scoreLabel;
    Random r;
    Character lastPart = null;

    public Win() {
        this.setSize(Utils.WIN_WIDTH, Utils.WIN_HEIGHT);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getWidth() / 2, dim.height / 2 - this.getHeight() / 2);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle(Utils.TITLE);
        scoreLabel = new JLabel("Points:" + score);
        scoreLabel.setBounds(0, 0, 80, 30);
        this.add(scoreLabel);

        this.setVisible(true);

        character = new Character(Utils.CHARACTER_X_FIRST_COORDONATE, Utils.CHARACTER_Y_FIRST_COORDONATE);
        character.setLocation(character.getX(), character.getY());
        character.setSize(Utils.CHARACTER_SIZE, Utils.CHARACTER_SIZE);
        this.add(character);

        r = new Random();
        point = new Character(r.nextInt(Utils.WIN_WIDTH - Utils.MARGIN_OF_ERROR), r.nextInt(Utils.WIN_HEIGHT - Utils.MARGIN_OF_ERROR));
        point.setSize(Utils.CHARACTER_SIZE, Utils.CHARACTER_SIZE);
        this.add(point);

        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {

            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {
                if (keyEvent.getKeyChar() == 'w' && character.getDirection() != -2) {
                    character.setDirection(-1);
                    character.setVelY(8);
                    parts.forEach(e->{
                        e.setDirection(-1);
                        e.setVelY(8);
                    });
                } else if (keyEvent.getKeyChar() == 's' && character.getDirection() != -1) {
                    character.setDirection(-2);
                    character.setVelY(8);
                    parts.forEach(e->{
                        e.setDirection(-2);
                        e.setVelY(8);
                    });
                } else if (keyEvent.getKeyChar() == 'a' && character.getDirection() != 1) {
                    character.setDirection(0);
                    character.setVelX(8);
                    parts.forEach(e->{
                        e.setDirection(0);
                        e.setVelY(8);
                    });
                } else if (keyEvent.getKeyChar() == 'd' && character.getDirection() != 0) {
                    character.setDirection(1);
                    character.setVelX(8);
                    parts.forEach(e->{
                        e.setDirection(1);
                        e.setVelY(8);
                    });
                }
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {
                if (keyEvent.getKeyChar() == 'w' && character.getDirection() != -2) {
                    character.setDirection(-1);
                    character.setVelY(5);
                    parts.forEach(e->{
                        e.setDirection(-1);
                        e.setVelY(5);
                    });

                } else if (keyEvent.getKeyChar() == 's' && character.getDirection() != -1) {
                    character.setDirection(-2);
                    character.setVelY(5);
                    parts.forEach(e->{
                        e.setDirection(-2);
                        e.setVelY(5);
                    });
                } else if (keyEvent.getKeyChar() == 'a' && character.getDirection() != 1) {
                    character.setDirection(0);
                    character.setVelX(5);
                    parts.forEach(e->{
                        e.setDirection(0);
                        e.setVelY(5);
                    });
                } else if (keyEvent.getKeyChar() == 'd' && character.getDirection() != 0) {
                    character.setDirection(1);
                    character.setVelX(5);
                    parts.forEach(e->{
                        e.setDirection(1);
                        e.setVelY(5);
                    });
                }
            }
        });
    }

    void start() {
        if (isRunning)
            return;
        isRunning = true;
        thread = new Thread(this);
        thread.start();
    }

    void stop() {
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

    @Override
    public void run() {
        parts = new ArrayList<>();
        r = new Random();
        while (isRunning) {
            if (gameOver()) {
                isRunning = false;
                int response = JOptionPane.showConfirmDialog(null, "GAME OVER!", "RESTART?", JOptionPane.YES_NO_OPTION);
                if (response == 0) {
                    restart();
                }
            }
            Rectangle rectangle2 = new Rectangle(point.getX(), point.getY(), Utils.CHARACTER_SIZE, Utils.CHARACTER_SIZE);
            Rectangle rectangle1 = character.getBounds();

            if (rectangle1.intersects(rectangle2)) {
                score += 100;
                scoreLabel.setText("Points:" + score);
                point.setX(r.nextInt(Utils.WIN_WIDTH - Utils.MARGIN_OF_ERROR));
                point.setY(r.nextInt(Utils.WIN_HEIGHT - Utils.MARGIN_OF_ERROR));
                point.setLocation(point.getX(), point.getY());
                addParts();
            }
            parts.forEach(e->{
               e.move();
               e.setLocation(e.getX(),e.getY());
            });
            character.move();
            character.setLocation(character.getX(), character.getY());
            try {
                thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        stop();
    }

    private void restart() {
        this.dispose();
        Win game = new Win();
        game.start();
    }

    private void addParts() {
        if (lastPart == null) {
            if (character.getDirection() == -1)
                parts.add(new Character(character.getX(), character.getY() + Utils.CHARACTER_SIZE));
            else if (character.getDirection() == -2)
                parts.add(new Character(character.getX(), character.getY() - Utils.CHARACTER_SIZE));
            else if (character.getDirection() == 0)
                parts.add(new Character(character.getX() + Utils.CHARACTER_SIZE, character.getY()));
            else if (character.getDirection() == 1)
                parts.add(new Character(character.getX() - Utils.CHARACTER_SIZE, character.getY()));
        }
        Character lastElement=parts.get(parts.size()-1);
        lastElement.setLocation(lastElement.getX(),lastElement.getY());
        lastElement.setSize(Utils.CHARACTER_SIZE,Utils.CHARACTER_SIZE);
        this.add(lastElement);

    }

    private boolean gameOver() {
        if (character.getX() > Utils.WIN_WIDTH - Utils.CHARACTER_SIZE || character.getX() < 0 || character.getY() > Utils.WIN_HEIGHT - Utils.CHARACTER_SIZE - 15 || character.getY() < 0)
            return true;
        return false;
    }
}
