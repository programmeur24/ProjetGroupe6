package controller;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class Controller.
 * this class permits the controlle of the View pack and Model and it is in this class that we choose the map
 * @author Groupe 7 : Sipoufo, Regina, Christ, Wilfrid
 * @version 1.0
 */
public final class Controller implements IController {

	/** The view. */
	private IView view;

	/** The model. */
	private IModel model;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view  the view
	 * @param model the model
	 */
	public Controller(final IView view, final IModel model) {
		this.setView(view);
		this.setModel(model);

	}
	
	public Controller() {
		
	}

	/**
	 * Control.
	 * Permits the display of the message of the beginning of the game
	 *
	 * @see contract.IController#control()
	 */
	public void control() {
		this.view.printMessage(this.getMessageToShow());
	}
	
	public String getMessageToShow() {
		return "Welcome to BoulderDash of Group 7 ! \n Press Space for start the game. Use Z/Q/S/D to move the character.";
	}
	
	/**
	 * Start method.
	 * Launch the model loop. Refresh each 100 milliseconds.
	 */
	
	public void start() {
		
		while(true) {
			this.model.loop();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * Sets the view.
	 *
	 * @param pview the new view
	 */
	private void setView(final IView pview) {
		this.view = pview;
	}

	/**
	 * Sets the model.
	 *
	 * @param model the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

	/**
	 * Order perform.
	 * Execute specific method depending on the order.
	 * @param controllerOrder the controller order
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	public void orderPerform(final ControllerOrder controllerOrder) {

			switch (controllerOrder) {
			case Map1:
				this.model.loadMap(1);
				break;
			case Map2:
				this.model.loadMap(2);
				break;
			case Map3:
				this.model.loadMap(3);
				break;
			case Map4:
				this.model.loadMap(4);
				break;
			case Map5:
				this.model.loadMap(5);
				break;
			case Map6:
				this.model.loadMap(6);
				break;
			case Map7:
				this.model.loadMap(7);
				break;
			case u:
				this.model.loadMap(1);
				break;
			case i:
				this.model.loadMap(2);
				break;
			case o:
				this.model.loadMap(3);
				break;
			case p:
				this.model.loadMap(4);
				break;
			case j:
				this.model.loadMap(5);
				break;
			case k:
				this.model.loadMap(6);
				break;
			case Z:
				this.model.getMap().getPlayer().movePlayer('Z');
				//this.model.modelNotify();
				break;
			case Q:
				this.model.getMap().getPlayer().movePlayer('Q');
				//this.model.modelNotify();
				break;
			case S:
				this.model.getMap().getPlayer().movePlayer('S');
				//this.model.modelNotify();
				break;
			case D:
				this.model.getMap().getPlayer().movePlayer('D');
				//this.model.modelNotify();
				break;
			default:
				break;
			}
			
		}
	

}
