import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Game extends JPanel {
	private static JPanel panel = new JPanel();
	static BufferedImage img;
	static int panelWidth;
	static int panelHeight;
	
	public Game() {
		try
		{
			img = ImageIO.read(this.getClass().getResource("rrBg.jpg")); // loads in the image of the board
			panelWidth = img.getWidth();
			panelHeight = img.getHeight(); 
			setPreferredSize(new Dimension(1000, 1000));
		}
		catch (IOException e) {
		}
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(img, 0, 0, 1000, 1000, this); // paints the board image
	}
	
	public static void loadGame()
	{
		panel.add(new Game());
	}
	
	public static JPanel getGame(){
		return panel;
	}

	public static void refresh() {
		panel.repaint();
	}
}