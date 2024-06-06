package gui;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GameWindow extends JFrame {

	public GameWindow()
	{
		setSize(1000, 700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new GamePanel());
		pack();
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new GameWindow();
	}
}
