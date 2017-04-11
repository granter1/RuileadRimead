import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class UI extends JFrame {
	private final JPanel mainPanel;
	private static Wheel wheel = new Wheel();
	
	public UI() {
		Wheel.loadGame();
		mainPanel = new JPanel();
		mainPanel.add(wheel.getWheel());
		//default size of our window and its layout:
		setPreferredSize(new Dimension(1000, 1000));
		getContentPane().setLayout(new GridLayout());
		getContentPane().add(mainPanel);
		setTitle("Monopoly");
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}