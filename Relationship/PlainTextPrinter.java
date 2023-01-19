package Relationship;

class PlainTextPrinter extends Printer {

    @Override
    public String printToScreen() {

        return " this is a plain text string format of the string : {" + this.stringToBePrinted + "}";
    }

}