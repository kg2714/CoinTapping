package TappingGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class Listener implements MouseListener, ActionListener, KeyListener {

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource() == TappingGame.canvas) {
			TappingGame.coin += TappingGame.perTap;
			TappingGame.cash.setText("$ "+TappingGame.coin);
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == TappingGame.buy) {
			getCoin();

		}
	}

	public static void getCoin() {
		if (TappingGame.coin >= (int) (TappingGame.hmn.getModel().getValue()) * (27)) {

			TappingGame.coin -= (int) (TappingGame.hmn.getModel().getValue()) * (27);
			TappingGame.cash.setText("$ "+TappingGame.coin);
			if ((int) TappingGame.hmn.getModel().getValue() < 9999999) {
				TappingGame.perTap += (int) TappingGame.hmn.getModel().getValue();

				TappingGame.pT.setText("$ "+TappingGame.perTap + "/tap");
			} else {
				TappingGame.pT.setText("$ 1/tap");
				JOptionPane.showMessageDialog(null, "It's must be from 1 to 9999999");
			}
			
		} else {
			JOptionPane.showMessageDialog(null, "You don't have "+(int) (TappingGame.hmn.getModel().getValue()) * (27)+"$");
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getSource() == TappingGame.canvas) {
			TappingGame.coin += TappingGame.perTap;
			TappingGame.cash.setText("$ "+TappingGame.coin);
		}		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
