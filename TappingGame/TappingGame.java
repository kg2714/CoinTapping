package TappingGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class TappingGame {
	public static int coin = 0, perTap = 1;
	

	public static JLabel cash, pT;
	public static Canvas canvas;
	public static JButton buy;
	public static JSpinner hmn;

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		JFrame f = new JFrame("Tapping Game");
		f.setSize(675,  309);
		f.setDefaultCloseOperation(3);
		f.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 659, 270);
		f.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("$$$ PRESS HERE TO GET COIN! $$$");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNewLabel.setBounds(0, 11, 430, 20);
		panel.add(lblNewLabel);
		
		canvas = new Canvas();
		canvas.setBackground(new Color(128, 128, 128));
		canvas.setBounds(0, 37, 430, 233);
		canvas.addMouseListener(new Listener());
		canvas.addKeyListener(new Listener());
		panel.add(canvas);
		
		cash = new JLabel("$ ");
		cash.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		cash.setBounds(436, 61, 205, 23);
		panel.add(cash);
		
		pT = new JLabel("$ 1/tap");
		pT.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		pT.setBounds(436, 95, 205, 23);
		panel.add(pT);
		
		buy = new JButton("Buy");
		buy.setBounds(436, 142, 51, 23);
		buy.addActionListener(new Listener());
		panel.add(buy);
		
		hmn = new JSpinner();
		hmn.setModel(new SpinnerNumberModel(1, 1, 9999999, 1));
		hmn.setBounds(497, 143, 114, 20);
		panel.add(hmn);
		
		JLabel lblNewLabel_2 = new JLabel("$/tap");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(615, 142, 44, 19);
		panel.add(lblNewLabel_2);
		
		f.setVisible(true);
	}
}
