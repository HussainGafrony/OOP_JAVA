/**
 * Abstract&Encapsulation
 */
class Microwave {

    // public static void main(String[] args) {
    // System.out.println("Hello hussein");
    // }

    private int temp, time;
    private String program;
    boolean status = false;

    public Microwave(int temp, int time, String program) {
        this.temp = temp;
        this.time = time;
        this.program = program;
    }

    public String defreeze() {
        this.turnOnMicHeatinSystem();
        this.loadingDefreezingProgram();
        this.setTimer();
        this.onVoltag();
        return "I am defreeze the food at " + this.temp + " using the program" + this.program;
    }

    private String turnOnMicHeatinSystem() {
        return "Starting on Heating System";
    }

    private String loadingDefreezingProgram() {
        return "loading Program" + this.program;
    }

    private String setTimer() {
        return "Setting de_freezing time to " + this.time + "seconds";
    }

    boolean onVoltag() {
        this.status = true;
        return true;
    }

    boolean offVoltag() {
        this.status = false;

        return false;
    }
}