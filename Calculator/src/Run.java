import javax.swing.SwingUtilities;

import Controller.Controller;
import Model.Model;
import View.View;
import View2.View2;

//Rami AlGhuzzi
public class Run {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {

//                Model model = new Model();
//                View view = new View(model);
//                Controller controller = new Controller(model, view);
//                model.addObserver(view);
                //for view2 Toggle the comments down below
                Model model = new Model();
                View2 vieww = new View2(model);
                Controller controller = new Controller(model, vieww);
                model.addObserver(vieww);

            }
        });

    }

}
//caution: 
//this calculator works only when you enter a number of two characters
//e.g. if you want to write '2' you have to write it like this '02'
//and if you want to write down a '0.5' you have to write it '.5'
//thank you
