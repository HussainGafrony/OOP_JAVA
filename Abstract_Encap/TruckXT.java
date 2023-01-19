public class TruckXT extends Car implements WeightHolder {

    public TruckXT(int speed, int numberOfdoors, String color, String gearBoxSystem) {
        super(speed, numberOfdoors, color, gearBoxSystem);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int move() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean turnON() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean turnOFF() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean accelerate(int speed) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean park() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean leftCargo() {
        // TODO Auto-generated method stub
        return true;
    }

}
