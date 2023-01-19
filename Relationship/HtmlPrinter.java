package Relationship;

class HtmlPrinter extends Printer {

    @Override
    public String printToScreen() {

        return "<h1> this is a html format of the string : { " + this.stringToBePrinted + " } </h1>";
    }

}