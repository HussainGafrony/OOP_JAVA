public class CarDashboard {
    protected int oilLevel, fuelLevel, airPressure;

    private int getOilLevel() {
        return oilLevel;
    }

    private int getFuelLevel() {
        return fuelLevel;
    }

    private int getAirPressure() {
        return airPressure;
    }

    public String readDashboard() {
        return "Showing the following analysis: \n Fuel: " + this.getFuelLevel() + "\n Oil : " + this.getOilLevel()
                + "\n Air Pressure : " + this.getAirPressure();
    }

}
