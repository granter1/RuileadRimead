import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Button extends JButton {
	static JButton button = new JButton();
	
	public Button() {
		try {
			Image img = ImageIO.read(getClass().getResource("rrbutton.jpg"));
			button.setIcon(new ImageIcon(img));
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
	public static void loadButton() {
		new Button();
	}
	
	public static JButton getButton() {
		return button;
	}
}