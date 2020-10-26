package UniversityMeanCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class Win extends JFrame {

    private LinkedList<JTextField> nrCredite;
    private LinkedList<JTextField> noteMaterii;
    private JButton plusButton;
    private JButton minusButton;
    private JButton calculateButton;
    private JTextField jTextField;
    private JTextField crediteField;
    private float mean;


    private int y = 10;

    public Win() {
        this.setSize(500, 500);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        plusButton = new JButton("Add Field");
        plusButton.setBounds(200, 350, 220, 70);
        this.add(plusButton);
        noteMaterii = new LinkedList<>();
        nrCredite = new LinkedList<>();

        calculateButton = new JButton("Calculate");
        calculateButton.setBounds(10,350,170,70);
        this.add(calculateButton);

        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNewField();
            }
        });
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });
        this.setVisible(true);
    }

    private void calculate() {
        int i = 0;
        int sum = 0;
        int totalCredits = 0;
        while (!noteMaterii.isEmpty()) {
            sum = sum + Integer.parseInt(noteMaterii.get(i).getText())*Integer.parseInt(nrCredite.get(i).getText());
            totalCredits = totalCredits + Integer.parseInt(nrCredite.get(i).getText());
            i++;
        }
        mean = sum / totalCredits;
        System.out.println(mean);
    }

    private void addNewField() {
        jTextField = new JTextField();
        crediteField = new JTextField();
        jTextField.setBounds(10, y, 300, 30);
        crediteField.setBounds(330, y, 60, 30);
        y += 60;
        noteMaterii.add(jTextField);
        nrCredite.add(crediteField);
        this.add(jTextField);
        this.add(crediteField);
        this.repaint();
    }
}