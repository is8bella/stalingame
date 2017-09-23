package stalingame;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Stalin implements ActionListener {
	public static void main(String[] args) {
		Stalin stalingame = new Stalin();
		stalingame.startMenu();
	}

	private void startMenu() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton play = new JButton("START");
		JLabel instructions = new JLabel(
				"<html> <div style='text-align: center;'> Simon, the classic 80’s memory game, but with a dash of soviet autocracy."
						+ "<br> Meet Stalin. <br> The Game. <br> </div></html>",
				SwingConstants.CENTER);

		// Set up frame
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		frame.add(panel);
		panel.setLayout(new GridLayout(2, 0));
		panel.add(instructions);
		panel.add(play);
		play.addActionListener(this);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
