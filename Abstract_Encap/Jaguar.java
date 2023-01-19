class Jaguar extends Car {

    public Jaguar(int speed, int numberOfdoors, String color, String gearBoxSystem) {
        super(speed, numberOfdoors, color, gearBoxSystem);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int move() {

        return this.speed * 3;
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
        this.speed = speed * 2 + 4;
        return true;
    }

    @Override
    public boolean park() {
        // TODO Auto-generated method stub
        return false;
    }

}