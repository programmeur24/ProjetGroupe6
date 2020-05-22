package controller;

public class chrono {
	private final int PAUSE = 4;//time out between two loop
	
	public void run() {
		
		while(true) {
			
			//Main.scene.repaint();
			try {
				Thread.sleep(PAUSE);
			} catch (InterruptedException e) {}
		}
		
	}
}
