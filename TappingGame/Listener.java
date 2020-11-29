package TappingGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigInteger;
import java.util.Random;

import javax.swing.JOptionPane;

public class Listener implements MouseListener, ActionListener {

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource() == TappingGame.canvas) {
			TappingGame.coin = TappingGame.coin.add(TappingGame.perTap);
			TappingGame.cash.setText("$ "+TappingGame.coin.toString());
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
		if (TappingGame.coin.compareTo(new BigInteger(Integer.toString((int) ((int) (TappingGame.hmn.getModel().getValue()) * (27 * TappingGame.mtp))))) == 1) {

			TappingGame.coin = TappingGame.coin.subtract(new BigInteger(Integer.toString((int) ((int) (TappingGame.hmn.getModel().getValue()) * (27 * TappingGame.mtp)))));
			TappingGame.cash.setText("$ "+TappingGame.coin);
			if ((int) TappingGame.hmn.getModel().getValue() < 9999999) {
				TappingGame.perTap = TappingGame.perTap.add(new BigInteger(TappingGame.hmn.getModel().getValue().toString()));

				TappingGame.pT.setText("$ "+TappingGame.perTap + "/tap");
			} else {
				TappingGame.pT.setText("$ 1/tap");
				JOptionPane.showMessageDialog(null, "It's must be from 1 to 9999999");
			}
			TappingGame.mtp = new Random().nextDouble();
			
		} else {
			JOptionPane.showMessageDialog(null, "You don't have "+(int) (TappingGame.hmn.getModel().getValue()) * (27 * TappingGame.mtp)+"$");
		}
	}

}
