package Relationship;

abstract class Printer {
    protected String stringToBePrinted;

    abstract public String printToScreen();

    public void setStringToBePrinted(String stringToBePrinted) {
        this.stringToBePrinted = stringToBePrinted;
    }
}
