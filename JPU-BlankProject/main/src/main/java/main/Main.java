package main;

import contract.ControllerOrder;
import controller.Controller;
import model.Model;
import view.View;
/**
 * The Main class.
 * @author Groupe 7 : Sipoufo, Regina, Christ, Wilfrid
 * @version 1.0
 *
 */ 
public abstract class Main {

    /**
     * The main method.
     * @param args
     */
    public static void main(final String[] args) {
    	
        final Model model = new Model();   
        final View view = new View(model);
        final Controller controller = new Controller(view, model);
        view.setController(controller);
        controller.control();
        controller.orderPerform(ControllerOrder.Map1); 

        controller.start();

    }
}
