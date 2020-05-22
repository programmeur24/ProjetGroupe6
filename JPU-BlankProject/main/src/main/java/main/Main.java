/**
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
package main;
import java.awt.Container;

//Sipoufo
import contract.ControllerOrder;
import controller.Controller;
import controller.IInsanePersonController;
import controller.InsanePersonController;
import model.Model;
//import view.IInsanePersonView;
//import view.InsanePersonView;
import view.View;

/**
 * The Class Main.
 *
 * @author Jean-Aymeric Diet
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     * @throws Exception 
     */
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
    }
}
