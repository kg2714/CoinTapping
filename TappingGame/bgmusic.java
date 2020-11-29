package TappingGame;

import java.io.FileInputStream;
import java.io.IOException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.*;

public class bgmusic implements Runnable {
	@Override
	public void run() {
		Player p;
		FileInputStream fis;
		
		try {
			while (true) {
				fis = new FileInputStream("fsrc\\bg.mp3");
				p = new Player(fis);
				p.play();
				fis.close();
			}
			
		} catch (JavaLayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}
}
