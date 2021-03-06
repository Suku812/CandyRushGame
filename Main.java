
//import Swing.CandyRushGame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements Runnable
{
    
	Thread t;
	CandyRushGame cr;

	public Main(){
            
		t = new Thread(this,"Dispose");

		cr = new CandyRushGame(this);
		cr.start();
		add(cr);

		addKeyListener(cr);
		setTitle("Candy Rush"); //Title Frame
		setResizable(false);
		getContentPane().setBackground(Color.white);
		setSize(1200, 700); 		//frame size
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void run(){
		dispose();
	}

	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}