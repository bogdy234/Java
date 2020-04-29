package helloworld;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Random;
import java.util.stream.IntStream;
import java.awt.event.ActionEvent;

public class HelloWorld {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWorld window = new HelloWorld();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HelloWorld() {
		initialize();
	}

	int nrPoints=0;
	int i=0;
	String ua="";
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Font myFont = new Font("Serif", Font.BOLD, 30);
		Font gameoverFont=new Font("Comic Sans MS",Font.BOLD,50);
		frame = new JFrame();
		frame.setBounds(100, 100, 629, 532);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel question = new JLabel("New label");
		question.setFont(myFont);
		
		JLabel gameOver = new JLabel("GAME OVER");
		gameOver.setBounds(121, 75, 421, 136);
		frame.getContentPane().add(gameOver);
		gameOver.setVisible(false);
		
		question.setVerticalAlignment(SwingConstants.TOP);
		question.setHorizontalAlignment(SwingConstants.CENTER);
		question.setBounds(0, 0, 615, 216);
		frame.getContentPane().add(question);
		JButton checkButton = new JButton("Check");

		String[] questions= {"What is the capital of Italy?","Result: 2+2x2?"};
		
		String[] raspA= {"Berlin","8"};
		String[] raspB= {"Paris","6"};
		String[] raspC= {"Bucharest","0"};
		String[] raspD= {"Rome","4"};
		
		String[] rasp= {"Rome","6"};

		JRadioButton a = new JRadioButton("A");
		a.setBounds(34, 222, 103, 21);
		frame.getContentPane().add(a);
		
		JRadioButton b = new JRadioButton("B");
		b.setBounds(321, 222, 103, 21);
		frame.getContentPane().add(b);
		
		JRadioButton c = new JRadioButton("C");
		c.setBounds(34, 291, 103, 21);
		frame.getContentPane().add(c);
		
		JRadioButton d = new JRadioButton("D");
		d.setBounds(321, 291, 103, 21);
		frame.getContentPane().add(d);
		JLabel points = new JLabel("Points: 0");
	
		JButton nextButton = new JButton("NEXT");
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nextButton.setVisible(false);
				checkButton.setVisible(true);
				Random r=new Random();
				i=r.nextInt(2);
				question.setText(questions[i]);
				a.setText(raspA[i]);
				b.setText(raspB[i]);
				c.setText(raspC[i]);
				d.setText(raspD[i]);	
				a.setEnabled(true);b.setEnabled(true);c.setEnabled(true);d.setEnabled(true);
				a.setSelected(false);b.setSelected(false);c.setSelected(false);d.setSelected(false);
			}
		});
		
	
		nextButton.setBounds(364, 411, 178, 57);
		frame.getContentPane().add(nextButton);
		
		JButton exitButton = new JButton("EXIT");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitButton.setBounds(10, 447, 85, 21);
		frame.getContentPane().add(exitButton);
		
		ButtonGroup group=new ButtonGroup();
		group.add(a);group.add(b);group.add(c);group.add(d);
	
		JLabel finalScore = new JLabel("New label");
		finalScore.setBounds(121, 273, 399, 108);
		frame.getContentPane().add(finalScore);
		
		points.setBounds(10, 352, 127, 45);
		frame.getContentPane().add(points);
		
		points.setVisible(false);a.setVisible(false);b.setVisible(false);c.setVisible(false);d.setVisible(false);question.setVisible(false);nextButton.setVisible(false);
		checkButton.setVisible(false);
		JButton start = new JButton("START");
		start.setFont(new Font("Tahoma", Font.PLAIN, 30));
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				points.setVisible(true);a.setVisible(true);b.setVisible(true);c.setVisible(true);d.setVisible(true);question.setVisible(true);nextButton.setVisible(true);
				start.setVisible(false);nextButton.setVisible(false);checkButton.setVisible(true);
				Random r=new Random();
				i = r.nextInt(1);
				question.setText(questions[i]);
				a.setText(raspA[i]);
				b.setText(raspB[i]);
				c.setText(raspC[i]);
				d.setText(raspD[i]);
				a.setSelected(false);b.setSelected(false);c.setSelected(false);d.setSelected(false);
			}
		});
		start.setBounds(150, 165, 274, 147);
		frame.getContentPane().add(start);
		finalScore.setVisible(false);
		checkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!a.isSelected() && !b.isSelected() && !c.isSelected() && !d.isSelected())
				{
					JOptionPane.showMessageDialog(null,"Choose something");
				}
				else {
					if (a.isSelected())
						ua=a.getText();
					else if (b.isSelected())
						ua=b.getText();
					else if (c.isSelected())
						ua=c.getText();
					else if (d.isSelected())
						ua=d.getText();
	
					if (ua==rasp[i])
					{
						JOptionPane.showMessageDialog(null,"Right Answer");
						nrPoints+=100;
						checkButton.setVisible(false);
						nextButton.setVisible(true);
					}
					else {
						points.setVisible(false);a.setVisible(false);b.setVisible(false);c.setVisible(false);d.setVisible(false);question.setVisible(false);nextButton.setVisible(false);
						start.setVisible(false);nextButton.setVisible(false);checkButton.setVisible(false);
						gameOver.setFont(gameoverFont);
						gameOver.setVisible(true);
						finalScore.setFont(gameoverFont);
						finalScore.setText("Points : "+nrPoints);
						finalScore.setVisible(true);
					}
					points.setText("Points:"+nrPoints);
					a.setEnabled(false);b.setEnabled(false);c.setEnabled(false);d.setEnabled(false);
				}
			}
		});
		checkButton.setBounds(364, 411, 178, 57);
		frame.getContentPane().add(checkButton);
		
		
		
		
	}
}
