package Calculator.src.calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main {
	public static void main(String[] args) {

		//Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		JFrame jframe=new JFrame("Calculator");
		jframe.setSize(900,900);
		//jframe.setLocation(dim.width/2-jframe.getWidth()/2 , dim.height/2-jframe.getWidth()/2);
		jframe.setVisible(true);
	//	jframe.getContentPane().setBackground(Color.gray);
		jframe.setLayout(null);
		
		JButton egal = new JButton("Executa"); 
	    jframe.add(egal);
	    egal.setBounds(130,500,100,100);  

		JTextField nr1 = new JTextField();
	    jframe.add(nr1);
	    nr1.setBounds(10,50,150,30);
		JTextField nr2 = new JTextField();
		jframe.add(nr2);
	    nr2.setBounds(210,50,150,30);
	    
	    Font f = new Font("TimesRoman",Font.BOLD,40);
	    
	    JLabel plus = new JLabel("+");
	    plus.setFont(f); 	//inainte de add
	    jframe.add(plus);
	    plus.setBounds(170,46,50,30);   // dupa add

	    JLabel egal1 = new JLabel("=");
	    egal1.setFont(f); 	//inainte de add
	    jframe.add(egal1);
	    egal1.setBounds(170+230,46,50,30);   // dupa add
	    
	    JLabel egal2 = new JLabel("=");
	    egal2.setFont(f); 	//inainte de add
	    jframe.add(egal2);
	    egal2.setBounds(400,46+100,50,30);   // dupa add
	    
	    JLabel egal3 = new JLabel("=");
	    egal3.setFont(f); 	//inainte de add
	    jframe.add(egal3);
	    egal3.setBounds(400,46+200,50,30);   // dupa add
	    
	    JLabel egal4 = new JLabel("=");
	    egal4.setFont(f); 	//inainte de add
	    jframe.add(egal4);
	    egal4.setBounds(400,46+300,50,30);   // dupa add
	    
		JLabel rezultat = new JLabel();
		JLabel rezultat2 = new JLabel();
		JLabel rezultat3 = new JLabel();
		//JLabel rezultat4 = new JLabel();
		
		JTextField nr3 = new JTextField();
	    jframe.add(nr3);
	    nr3.setBounds(10,50+100,150,30);
	    
	    JTextField nr4 = new JTextField();
		jframe.add(nr4);
	    nr4.setBounds(210,50+100,150,30);
	    
	    
	    JLabel minus = new JLabel("-");
	    minus.setFont(f); 	//inainte de add
	    jframe.add(minus);
	    minus.setBounds(170+6,46+99,30,30);   // dupa add
	    
	    JTextField nr5 = new JTextField();
	    jframe.add(nr5);
	    nr5.setBounds(10,50+200,150,30);
	    
	    JTextField nr6 = new JTextField();
		jframe.add(nr6);
	    nr6.setBounds(210,50+200,150,30);
	    
	    JLabel ori = new JLabel("*");
	    ori.setFont(f); 	//inainte de add
	    jframe.add(ori);
	    ori.setBounds(170+6,46+204,30,30);   // dupa add
	  
	    
	    JTextField nr7 = new JTextField();
	    jframe.add(nr7);
	    nr7.setBounds(10,50+300,150,30);
	    
	    JTextField nr8 = new JTextField();
		jframe.add(nr8);
	    nr8.setBounds(210,50+300,150,30);
	    
	    JLabel div = new JLabel("/");
	    div.setFont(f); 	//inainte de add
	    jframe.add(div);
	    div.setBounds(170+6,46+304,30,30);   // dupa add
	    
	    nr3.setDocument(nr1.getDocument());
	    nr4.setDocument(nr2.getDocument());
	    nr5.setDocument(nr1.getDocument());
	    nr6.setDocument(nr2.getDocument());
	    nr7.setDocument(nr1.getDocument());
	    nr8.setDocument(nr2.getDocument());

	    Font f2 = new Font("TimesRoman",Font.BOLD,17);
	    	    
	    
	    
		
		/*rezultat4.setFont(f2);
		rezultat4.setBounds(100,0,100,30);
	    jframe.add(rezultat4);*/
		
		JLabel rezultat5 = new JLabel();
		
		
	    egal.addActionListener(new ActionListener() {    // Actiune la butonul egal de la adunare.
	    		@Override
	    		public void actionPerformed(ActionEvent e)
	    		{
	    	try {
	    		double rezplus =Double.parseDouble(nr1.getText()) + Double.parseDouble(nr2.getText()); //nu il pot lasa in afara addActionListener
	    		rezultat.setText(String.valueOf(rezplus));
	    		
	    		
	    		jframe.add(rezultat);
	    	    rezultat.setBounds(500,50,170,30);
	    		rezultat.setFont(f2);

	    	    jframe.add(rezultat2);
	    		rezultat2.setBounds(500,50+100,170,30);
	    		rezultat2.setFont(f2);
	    		double rezminus=Double.parseDouble(nr3.getText()) - Double.parseDouble(nr4.getText());
	    		rezultat2.setText(String.valueOf(rezminus));
	    		
	    		jframe.add(rezultat3);
	    		rezultat3.setBounds(500,50+200,170,30);
	    		rezultat3.setFont(f2);
	    		
	    		double rezori=Double.parseDouble(nr5.getText()) * Double.parseDouble(nr6.getText());
	    		rezultat3.setText(String.valueOf(rezori));
	    		
	    		
	    		rezultat5.setFont(f2);
	    		rezultat5.setBounds(500,50+300,170,30);
	    		jframe.add(rezultat5);

	    		double rezdiv=Double.parseDouble(nr7.getText()) / Double.parseDouble(nr8.getText());
	    		rezultat5.setText(String.valueOf(rezdiv));
	    		
	    		
	    		
	    	}
	    	catch(NumberFormatException ex)
	    	{
	    		JOptionPane.showMessageDialog(rezultat,"You need to insert a NUMBER!","Warning",JOptionPane.WARNING_MESSAGE);
	    	}
	    		}
	    	});
	 }
	    
}