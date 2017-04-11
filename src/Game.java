import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Game extends JPanel {
	private static JPanel panel = new JPanel();
	static BufferedImage img, img1, img2, img3, img4, img5, img6, img7, img8;
	static int panelWidth;
	static int panelHeight;
	
	public Game() {
		try
		{
			img = ImageIO.read(this.getClass().getResource("rrBg.jpg"));
			img1 = ImageIO.read(this.getClass().getResource("rrBg1.jpg"));
			img2 = ImageIO.read(this.getClass().getResource("rrBg2.jpg"));
			img3 = ImageIO.read(this.getClass().getResource("rrBg3.jpg"));
			img4 = ImageIO.read(this.getClass().getResource("rrBg4.jpg"));
			img5 = ImageIO.read(this.getClass().getResource("rrBg5.jpg"));
			img6 = ImageIO.read(this.getClass().getResource("rrBg6.jpg"));
			img7 = ImageIO.read(this.getClass().getResource("rrBg7.jpg"));
			img8 = ImageIO.read(this.getClass().getResource("rrBg8.jpg"));
			panelWidth = 750;
			panelHeight = 750; 
			setPreferredSize(new Dimension(panelWidth, panelHeight));
		}
		catch (IOException e) {
		}
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(img, 0, 0, panelWidth, panelHeight, this); // paints the board image
		if(Button.buttonPress == 1) g.drawImage(img1, 0, 0, panelWidth, panelHeight, this);
		if(Button.buttonPress == 2) g.drawImage(img2, 0, 0, panelWidth, panelHeight, this);
		if(Button.buttonPress == 3) g.drawImage(img3, 0, 0, panelWidth, panelHeight, this);
		if(Button.buttonPress == 4) g.drawImage(img4, 0, 0, panelWidth, panelHeight, this);
		if(Button.buttonPress == 5) g.drawImage(img5, 0, 0, panelWidth, panelHeight, this);
		if(Button.buttonPress == 6) g.drawImage(img6, 0, 0, panelWidth, panelHeight, this);
		if(Button.buttonPress == 7) g.drawImage(img7, 0, 0, panelWidth, panelHeight, this);
		if(Button.buttonPress == 8) g.drawImage(img8, 0, 0, panelWidth, panelHeight, this);
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