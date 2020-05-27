package view;

import java.awt.event.KeyEvent;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The View class.
 * @author Groupe 7 : Sipoufo, Regina, Christ, Wilfrid
 * @version 1.0
 *
 */

public final class View implements IView, Runnable {

	
	private ViewFrame viewFrame = null; /** return view frame to null */

	/**
	 * TheView's constructor
	 * Instantiates a new viewFrame
	 * @param model
	 */
	public View(final IModel model) {
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}
	
	public View() {
		
	}

	/**
	 * 
	 * @param keyCode
	 * @return ControllerOrder use for the differents keys
	 */
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) {
		switch (keyCode) {
			case KeyEvent.VK_Z:
				return ControllerOrder.Z;	
			case KeyEvent.VK_Q:
				return ControllerOrder.Q;
			case KeyEvent.VK_S:
				return ControllerOrder.S;
			case KeyEvent.VK_D:
				return ControllerOrder.D;
			default:
				return ControllerOrder.nothing;
		}
	}
	
	/**
	 * @param message
	 */
	public void printMessage(final String message) {
		
		this.viewFrame.printMessage(message);
	}

	/**
	 * For active the windows
	 */
	public void run() {
			this.viewFrame.setVisible(true);
	}

	/** sets controller and parameter */
	
	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
	}
}

