import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Button implements ActionListener {
	static JButton button = new JButton();
	public static int buttonPress;

	public Button() {
		try {
			Image img = ImageIO.read(getClass().getResource("rrbutton.jpg"));
			button.setIcon(new ImageIcon(img));
		} catch (Exception ex) {
			System.out.println(ex);
		}
		button.addActionListener(this);
	}

	public static void loadButton() {
		new Button();
	}

	public static JButton getButton() {
		return button;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		int randomNumber = (int)(Math.random() *8)  + 1;

		switch(randomNumber) {

		case 1:
			Game1();
			break;
		case 2:
			Game2();
			break;

		case 3:
			Game3();
			break;

		case 4:
			Game4();
			break;

		case 5:
			Game5();
			break;

		case 6:
			Game6();
			break;

		case 7:
			Game7();
			break;
		case 8:
			Game8();
			break;
		default: 
			JOptionPane.showMessageDialog(null, "Unlik");
		}
	}

	public static void Game1(){
		buttonPress=1;
		Game.refresh();
	}

	public static void Game2(){
		buttonPress=2;
		Game.refresh();
	}

	public static void Game3(){
		buttonPress=3;
		Game.refresh();
	}

	public static void Game4(){
		buttonPress=4;
		Game.refresh();
	}

	public static void Game5(){
		//JOptionPane.showMessageDialog(null, "Ni dhearna me riamh ! ");
		buttonPress=5;
		Game.refresh();
	}

	public static void Game6(){
		//JOptionPane.showMessageDialog(null, "Ól an cupán");
		buttonPress=6;
		Game.refresh();
	}

	public static void Game7(){
		//JOptionPane.showMessageDialog(null, "Shot amháin");
		buttonPress=7;
		Game.refresh();
	}

	public static void Game8(){
		//JOptionPane.showMessageDialog(null, "Lion an cupán suas");
		buttonPress=8;
		Game.refresh();
	}

}
