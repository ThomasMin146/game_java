package game2d;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	public GameFrame(GamePanel gamePanel) {
		
		new JFrame();
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(gamePanel);
		
		this.setVisible(true);
	}

}
