package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Observable;
import java.util.Observer;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

import com.entity.mobileelements.Player;

import contract.IModel;
import entity.Entity;
import entity.Map;

/** ViewPanel class */

@SuppressWarnings("unused")
public
class ViewPanel extends JPanel implements Observer {

	/** The view frame. */
	private ViewFrame viewFrame;
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -998294702363713521L;
	/** The counter until the end of the game */
	private static int counter = 200;
	/** The boolean to refresh some information only once */
	private boolean hasBeenNotifiedToStop = false;
	/** The boolean to start properly the timer */
	private boolean isTimerStart = false;

	public ViewPanel() {
	}

	/** instantiates ViewFrame and param it */
	public ViewPanel(final ViewFrame viewFrame) {
		this.setViewFrame(viewFrame);
		viewFrame.getModel().getObservable().addObserver(this);
		viewFrame.getModel().getMap();
	}

	
	
	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}
		
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	
	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
	}

	@Override
	protected void paintComponent(final Graphics graphics) {

		final double scale = 3.0;
		final int imageSize = 16;
		final int width = this.getWidth();
		final int height = this.getHeight();
		final int timerResetValue = 200;
		Map map = this.viewFrame.getModel().getMap();
		Entity[][] loadMap = null;
		Player player = null;

		if (map.getPlayer() != null) {

			loadMap = map.getArrayMap();
			player = this.viewFrame.getModel().getMap().getPlayer();
			int playerPosX = this.viewFrame.getModel().getMap().getPlayer().getPositionX();
			int playerPosY = this.viewFrame.getModel().getMap().getPlayer().getPositionY();
			Font font = new Font("Arial", Font.BOLD, 20);
			graphics.setFont(font);

			if (counter != 0 && counter != -100) {

				this.focusMapOnPlayer(graphics, width, height, playerPosX, playerPosY, scale, imageSize);

				this.displayMap(graphics, width, height);
				
				if (isTimerStart == false) {
					ViewPanel.startTimer();
					this.isTimerStart = true;
				}

				this.reverseFocusOnScreenAndStats(graphics, scale, width, height, playerPosX, playerPosY, player, map, imageSize);

			} else {
				graphics.clearRect(0, 0, width, height);
				graphics.drawString("BAD TIMING !", width / 2 - 75, height / 2);
				counter = -100;
				
			}
			

		} else {
			graphics.clearRect(0, 0, width, height);
		}
	}

	
	public static void startTimer() { 
		ViewPanel drawTimer = new ViewPanel();
		TimerTask timerTask = new TimerTask() {
			@Override
			public void run() {
				if (counter != -100 && counter > 0) {
					counter--;
				}
			}
		};
		Timer timer = new Timer("MyTimer"); 
		timer.scheduleAtFixedRate(timerTask, 1000, 1000); 
	}

	
	public void displayMap(Graphics graphics, int width, int height) {

		final int imageSize = 16;
		final int numberOfLevels = 7;
		Map map = this.viewFrame.getModel().getMap();
		IModel getModel = this.viewFrame.getModel();
		Entity[][] loadMap = map.getArrayMap();
		Player player = this.viewFrame.getModel().getMap().getPlayer();
		final int timerResetValue = 200;

		for (int x = 0; x < map.getWidthMap(); x++) {
			for (int y = 0; y < map.getHeightMap(); y++) {
				graphics.drawImage(loadMap[x][y].getSprite().getImage(), x * imageSize, y * imageSize, this);
			}
		}

		if (!player.getIsAlive()&& hasBeenNotifiedToStop == false) {

			hasBeenNotifiedToStop = true;
			graphics.clearRect(0, 0, width, height);
			this.viewFrame.printMessage("You died ! Try again...");
			getModel.loadMap(map.getId());
			hasBeenNotifiedToStop = false;
		}

		if (player.getIsWin() && hasBeenNotifiedToStop == false) {
			if (map.getId() < numberOfLevels) {
				getModel.loadMap(map.getId() + 1);
				counter = timerResetValue;
			} else {
				hasBeenNotifiedToStop = true;
				player.setIsAlive(false);
				graphics.clearRect(0, 0, width, height);
				this.viewFrame.printMessage("You won ! Congrats !");
				System.exit(0);
			}
		}
	}

	public void focusMapOnPlayer(Graphics graphics, int width, int height, int playerPosX, int playerPosY, double scale, int imageSize) {

		graphics.clearRect(0, 0, width, height);


			graphics.translate((int) (-playerPosX * imageSize * scale + width / 2),
					(int) (-playerPosY * imageSize * scale + height / 2));

			((Graphics2D) graphics).scale(scale, scale);
	}

	
	public void reverseFocusOnScreenAndStats(Graphics graphics, double scale, int width, int height, int playerPosX,
			int playerPosY, Player player, Map map, int imageSize) {

		final int xStartStatsValues = width - 220;
		final int yStartStatsValues = 0;
		final int xEndStatsValues = 240;
		final int yEndStatsValues = 65;
		final int xStartStatsDisplay = width - 210;

		((Graphics2D) graphics).scale(1 / scale, 1 / scale);

		graphics.translate((int) (+playerPosX * imageSize * scale - width / 2), (int) (+playerPosY * imageSize * scale - height / 2));
		graphics.setColor(Color.white);
		graphics.fillRect(xStartStatsValues, yStartStatsValues, xEndStatsValues, yEndStatsValues);
		graphics.setColor(Color.BLUE);
		graphics.drawString("Remaining time : " + counter, xStartStatsDisplay, 20);
		graphics.drawString(String.valueOf("Diamond Counter : " + player.getDiamondsCounter()), xStartStatsDisplay, 40);
		graphics.setColor(Color.RED);
		graphics.drawString(String.valueOf("Number needed : " + map.getNumberOfDiamondsNeeded()), xStartStatsDisplay,
				60);

		if (player.getDiamondsCounter() >= map.getNumberOfDiamondsNeeded()) {
			graphics.clearRect(xStartStatsValues, yStartStatsValues, xEndStatsValues, yEndStatsValues);
			graphics.setColor(Color.BLUE);
			graphics.drawString("Remaining time : " + counter, xStartStatsDisplay, 20);
			graphics.setColor(Color.GREEN);
			graphics.drawString(String.valueOf("Diamond Counter : " + player.getDiamondsCounter()), xStartStatsDisplay,
					40);
			graphics.drawString("Go to exit door!", xStartStatsDisplay, 60);
		}

	}
	
	
   
    public int getCounter() {
      return counter;
    }

   
    
    public void setCounter(int newCounter) throws IndexOutOfBoundsException{
      if (newCounter > 0 && newCounter < 10000) {
          ViewPanel.counter = newCounter;
      }else {
          throw new IndexOutOfBoundsException("Wrong parameters");
      }
    }

}

