package Controller;

public class StringInfo {

boolean isEmpty;
boolean isLastCharacterNumber;
boolean isLastCharacterOperator;    
boolean isLastCharacterDot;
int lastCharIndex;

    public StringInfo(String computationText){

        readStringValue(computationText);

    }

    private void readStringValue(String computationText) {

        if (computationText.equals("")) {
            isEmpty = true;
        } else {
            lastCharIndex = computationText.length()-1;
            String lastChar = computationText.substring(lastCharIndex);
            switch(lastChar){
            case "0" : case "1" : case "2" : 
            case "3" : case "4" : case "5" : 
            case "6" : case "7" : case "8" : 
            case "9" : isLastCharacterNumber = true; break; 

            case "+" : case "-" : case "*" : 
            case "/" : case "%" : case "^" : isLastCharacterOperator= true; break; 

            case "." : isLastCharacterDot = true; break; 

            default : System.out.println("Cannot parse last character!");
            }

        }


    }

    public boolean isComputationTextEmpty() {
        return isEmpty;
    }


    public boolean isLastCharacterNumber() {
        return isLastCharacterNumber;
    }

    public boolean isLastCharacterOperator() {
        return isLastCharacterOperator;
    }

    public boolean isLastCharacterDot() {
        return isLastCharacterDot;
    }

    public int getLastCharIndex() {
        return lastCharIndex;
    }

}