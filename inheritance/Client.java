/**
 * Client
 */
class Client {

    public String source;
    public int timeout;

    public Client(String source, int timeout) {
        this.source = source;
        this.timeout = timeout;
    }

    public String connect() {
        return "I`m connect to " + this.source;
    }

    public String call() {
        return "I have fetched this data for you Datatata";
    }

    public boolean terminate() {
        return true;
    }
}