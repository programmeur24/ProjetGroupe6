package view;

import BaseDonnee.Main;

public class chrono implements Runnable {
	private final int PAUSE = 4;//time out between two loop
	
	public void run() {
		
		while(true) {
			//Main.view.repaint();
			try {
				Thread.sleep(PAUSE);
			} catch (InterruptedException e) {}
		}
		
	}
}
