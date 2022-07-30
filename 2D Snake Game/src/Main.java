import java.awt.Color;

import javax.swing.JFrame;
public class Main {
public static void main(String[] args) {
		//Creating Java Frame
		JFrame f = new JFrame();
		f.setTitle("Snake Game");
		f.setBounds(10,10,905,700);
		f.setResizable(false);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBackground(Color.DARK_GRAY);
		//Adding gameplay object of Gameplay class in the j frame
		Gameplay gameplay = new Gameplay();
		f.add(gameplay);
		

	}
}
