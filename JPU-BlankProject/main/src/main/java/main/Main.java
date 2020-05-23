/**
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
package main;
import java.awt.Container;

import contract.IController;
import controller.Controller;
import model.IInsanePersonModel;
import model.InsanePersonModel;
import view.IIsanePersonView;
import view.InsanePersonView;
import view.ViewFrame;
//import view.IInsanePersonView;
//import view.InsanePersonView;
//import view.View;

/**
 * The Class Main.
 *
 * @author Jean-Aymeric Diet
 */
public class Main {
	public static InsanePersonView vi;
	public static IIsanePersonView view;
    public static void main(final String[] args) throws Exception {
        //final Model model = new Model();
        //final View view = new View(model);
        //final Controller controller = new Controller(view, model);
        //view.setController(controller);

        //controller.control();
        //controller.orderPerform(ControllerOrder.English);
    	
    	/*final IInsanePersonView view = new InsanePersonView();
    	view.affiche();
    	final IInsanePersonController controller = new InsanePersonController();
    	view.getFenetre().setContentPane((Container) controller);
    	view.getFenetre().setVisible(true);*/
    	final  IInsanePersonModel model = new InsanePersonModel(2,1);
    	int i = model.getniveau();
    	view = new ViewFrame(i);
    	final IController controller = new Controller(model, view);
    	view.actualiser();
    	//controller.control();
    	//view.afficher();
    }
}
