package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;

import Model.Model;
import View.View;
import View2.View2;

public class Controller {

    private Model model;
    private View view;
	private View2 view2;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        model.addObserver(view);

        view.setCalcButtonListener(new CalcButtonListener());

    }
    //For view2
    public Controller(Model model, View2 view) {
        this.model = model;
        this.view2 = view2;

        model.addObserver(view);

        view.setCalcButtonListener(new CalcButtonListener());

    }
    class CalcButtonListener implements ActionListener {
        boolean OperationAlreadyHappened = false;

        public void actionPerformed(ActionEvent e) {

            JButton button = (JButton) e.getSource();
            String buttonText = button.getText();
            String computationText = view.getComputationDisplayText();
           // String computationText2 = view2.getComputationDisplayText();

            ButtonInfo buttonInfo = new ButtonInfo(buttonText);
            StringInfo stringInfo = new StringInfo(computationText);
           // StringInfo stringInfo2 = new StringInfo(computationText2);

            if (buttonInfo.isClear) {model.Clear();return;}

            if (stringInfo.isEmpty) {

                if (buttonInfo.isNumber) {setComputationText(computationText + buttonText);
                } else if (buttonInfo.isDot) {setComputationText(computationText + buttonText);
                
                } else if (buttonInfo.isOperator) {} // do nothing
                else if (buttonInfo.isEquals) {} // do nothing

            } else { // string is NOT empty

                if (stringInfo.isLastCharacterNumber) {

                    if (buttonInfo.isNumber) {
                        if (OperationAlreadyHappened) {setComputationText(buttonText);OperationAlreadyHappened = false;} 
                        else {setComputationText(computationText + buttonText);
                        }
                    }

                    else if (buttonInfo.isOperator) {setComputationText(computationText + buttonText);
                    } 
                    else if (buttonInfo.isDot) {setComputationText(computationText + buttonText);
                   } 
                    else if (buttonInfo.isEquals) {OperationAlreadyHappened = true; performComputation();}
                }

                else if (stringInfo.isLastCharacterOperator) {

                    if (buttonInfo.isNumber) {setComputationText(computationText + buttonText);
                    } 
                    else if (buttonInfo.isOperator) {setComputationText(computationText.substring(0,stringInfo.lastCharIndex) + buttonText);
                    } 
                    else if (buttonInfo.isDot) {setComputationText(computationText + buttonText);
                    } 
                    else if (buttonInfo.isEquals) {} // do nothing

                }

                else if (stringInfo.isLastCharacterDot) {

                    if (buttonInfo.isNumber) {setComputationText(computationText + buttonText);
                    } 
                    else if (buttonInfo.isOperator) {} // do nothing
                    else if (buttonInfo.isDot) {setComputationText(computationText.substring(0,stringInfo.lastCharIndex));
                    } 
                    else if (buttonInfo.isEquals) {} // do nothing

                }

            }

        }

        private void performComputation() {
            model.computeString();
        }

        private void setComputationText(String text) {
            model.setComputationText(text);
        }

    }
}