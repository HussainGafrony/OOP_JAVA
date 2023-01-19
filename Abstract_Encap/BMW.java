
class BMW extends Car {

    public BMW(int speed, int numberOfdoors, String color, String gearBoxSystem) {
        super(speed, numberOfdoors, color, gearBoxSystem);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int move() {
        return this.speed;
    }

    @Override
    public boolean turnON() {

        this.turnONN = true;
        return true;
    }

    @Override
    public boolean turnOFF() {
        this.turnONN = false;
        return true;
    }

    @Override
    public boolean accelerate(int speed) {
        this.speed = speed;
        return true;
    }

    @Override
    public boolean park() {

        return true;
    }

}
