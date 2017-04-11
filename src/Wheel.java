import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Wheel extends JPanel {
	private static JPanel panel = new JPanel();
	static BufferedImage wheel;
	static BufferedImage arrow;
	static BufferedImage button;
	static int imageWidth;
	static int imageHeight;
	AffineTransform identity = new AffineTransform();
	
	public Wheel() {
		try {
			wheel = ImageIO.read(this.getClass().getResource("monopoly-board.jpg")); // loads in the image of the board
			imageWidth = wheel.getWidth();
			imageHeight = wheel.getHeight(); 
			setPreferredSize(new Dimension(1000, 1000));
			arrow = ImageIO.read(this.getClass().getResource("arrow.png"));
		}
		catch (IOException e) {
		}
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(wheel, 0, 0, imageWidth, imageHeight, this); // paints the board image
		Graphics2D g2d = (Graphics2D)g;
		//g2d.translate((imageWidth/2)+150, (imageHeight/2)-50); // Translate the center of our coordinates.
        g2d.rotate(.5);
		g2d.drawImage(arrow, (imageWidth/2)+150 , (imageHeight/2)-50, 300, 100, this);
	}
	
	public static void loadGame() {
		panel.add(new Wheel());
	}
	
	public JPanel getWheel(){
		return panel;
	}

	public static void refresh() {
		panel.repaint();
	}
	
}