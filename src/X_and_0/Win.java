package X_and_0;

import javax.swing.*;
import java.awt.*;

public class Win extends JFrame {
    String player1 = "X";
    String player2 = "0";
    String currentPlayer = player1;

    Font font = new Font("Arial", Font.BOLD, 38);
    Font font1 = new Font("Arial", Font.BOLD, 56);

    boolean hasWon = false;
    int nr = 0;

    public Win() {
        this.setTitle("X & 0 GAME!");
        this.setSize(900, 950);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getWidth() / 2, dim.height / 2 - this.getHeight() / 2);

        Board();

        JMenuBar mb = new JMenuBar();
        //JMenu f = new JMenu("File");
        //mb.add(f);
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(
                e -> System.exit(0)
        );
        mb.add(Box.createHorizontalGlue());
        mb.add(exit);
        this.setJMenuBar(mb);

        this.setVisible(true);
    }

    private void playerTurn(JLabel label) {
        if (currentPlayer.equals("X"))
            label.setText("0's turn");
        else
            label.setText("X's turn");
    }

    public void Board() {
        this.setLayout(null);
        JButton[][] board = new JButton[3][3];
        JLabel turnText = new JLabel("X's turn");
        turnText.setBounds(0, 0, 300, 30);
        turnText.setFont(font);
        this.add(turnText);

        int x = 0, y = 30;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton button = new JButton("");
                button.setFont(font1);
                button.setBounds(x, y, 300, 300);
                x += 300;
                board[i][j] = button;    // matricea de butoane
                this.add(button);

                button.addActionListener(actionEvent -> {  // inceput action listener
                    if (button.getText() == "" && hasWon == false) {        // cat timp nu a fost pus nimic si nu s-a terminat jocul
                        button.setText(currentPlayer);       // pune semnul jucatorului pe buton
                        if (currentPlayer.equals(player1))
                            button.setForeground(Color.blue);   // daca playerul curent are valoarea X seteaza culoarea albastru
                        else
                            button.setForeground(Color.red);  // daca playerul curent are valoarea 0 seteaza culoarea rosu
                        playerTurn(turnText);
                        choosePlayer();
                        won(board, player1);
                        if (hasWon == true) {
                            messageFunction(board, player1);
                        }
                        won(board, player2);
                        if (hasWon == true) {
                            messageFunction(board, player2);
                        }
                    }
                }); // end action Listener

            }  //end if j
            x = 0;
            y += 300;
        } //end if i
    }  // end function

    private void messageFunction(JButton[][] board, String player) {
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                board[k][l].setEnabled(false);
            }
        }
        int dialogResult = JOptionPane.showConfirmDialog(null, "Player " + player + " WON!\nRestart?", null, JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            this.dispose();
            new Win();
        }
    }

    private void choosePlayer() {
        if (currentPlayer.equals(player1))
            currentPlayer = player2;
        else currentPlayer = player1;
    }

    private void colorBlack(JButton button1, JButton button2, JButton button3) {
        button1.setBackground(Color.BLACK);
        button2.setBackground(Color.BLACK);
        button3.setBackground(Color.BLACK);
    }

    private void won(JButton[][] board, String s) {
        if (board[0][0].getText().equals(s) && board[1][0].getText().equals(s) && board[2][0].getText().equals(s)) {
            hasWon = true;
            colorBlack(board[0][0], board[1][0], board[2][0]);
        } else if (board[0][1].getText().equals(s) && board[1][1].getText().equals(s) && board[2][1].getText().equals(s)) {
            hasWon = true;
            colorBlack(board[0][1], board[1][1], board[2][1]);
        } else if (board[0][2].getText().equals(s) && board[1][2].getText().equals(s) && board[2][2].getText().equals(s)) {
            hasWon = true;
            colorBlack(board[0][2], board[1][2], board[2][2]);
        } else if (board[0][0].getText().equals(s) && board[0][1].getText().equals(s) && board[0][2].getText().equals(s)) {
            hasWon = true;
            colorBlack(board[0][0], board[0][1], board[0][2]);
        } else if (board[1][0].getText().equals(s) && board[1][1].getText().equals(s) && board[1][2].getText().equals(s)) {
            hasWon = true;
            colorBlack(board[1][0], board[1][1], board[1][2]);
        } else if (board[2][0].getText().equals(s) && board[2][1].getText().equals(s) && board[2][2].getText().equals(s)) {
            hasWon = true;
            colorBlack(board[2][0], board[2][1], board[2][2]);
        } else if (board[0][0].getText().equals(s) && board[1][1].getText().equals(s) && board[2][2].getText().equals(s)) {
            hasWon = true;
            colorBlack(board[0][0], board[1][1], board[2][2]);
        } else if (board[0][2].getText().equals(s) && board[1][1].getText().equals(s) && board[2][0].getText().equals(s)) {
            hasWon = true;
            colorBlack(board[0][2], board[1][1], board[2][0]);
        } else {
            hasWon = false;
        }
    }
}
