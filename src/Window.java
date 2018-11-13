import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;


public class Window {

	private Game game;
	
	private JFrame frame;
	private JTextField textField;
	private SolitairePanel panel;
	
	/**
	 * Create the application.
	 */
	public Window(Game game) {
		this.game = game;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JButton btnNewGame = new JButton("New Game");
		menuBar.add(btnNewGame);
		btnNewGame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				game.newGame();
				setPlace(CardPlace.set1, new Card());
			}
		});
		
		textField = new JTextField();
		textField.setBackground(Color.GREEN);
		frame.getContentPane().add(textField, BorderLayout.SOUTH);
		textField.setEditable(false);
		
		panel = new SolitairePanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
				
	}

	public void setPlace(CardPlace place, Card card){
		panel.setPlace(place, card);
	}
	
	public void setText(String text){
		textField.setText(text);
	}
	
}
