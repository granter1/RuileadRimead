import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class UI extends JFrame {
	private final JPanel mainPanel;
	
	public UI() {
		Game.loadGame();
		Button.loadButton();
		mainPanel = new JPanel();
		//default size of our window and its layout:
		setPreferredSize(new Dimension(750, 750));
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		getContentPane().setLayout(new GridLayout());
		mainPanel.add(Game.getGame());
		mainPanel.add(Button.getButton());
		getContentPane().add(mainPanel);
		setTitle("R�il�ad Rimead");
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}