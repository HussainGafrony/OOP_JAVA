
abstract class Car {
    protected int speed, numberOfdoors;
    protected String color, gearBoxSystem;
    protected boolean turnONN = false;
    private CarDashboard carDashboard;

    public Car(int speed, int numberOfdoors, String color, String gearBoxSystem) {
        this.speed = speed;
        this.numberOfdoors = numberOfdoors;
        this.color = color;
        this.gearBoxSystem = gearBoxSystem;
    }

    public abstract int move();

    public abstract boolean turnON();

    public abstract boolean turnOFF();

    public abstract boolean accelerate(int speed);

    public abstract boolean park();

    public void installDashboard(CarDashboard dashboard) {
        this.carDashboard = dashboard;
    }

    public String CarInfo() {
        if (this.carDashboard != null) {
            return "This speed is " + this.speed + "\n more info ... " + this.carDashboard.readDashboard();
        } else {
            return "This speed is " + this.speed;
        }

    }

}