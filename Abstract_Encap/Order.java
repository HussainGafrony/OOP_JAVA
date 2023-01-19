
class Order {

    private String source;
    private String destination;

    public Order(String source, String destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    private int weight;

    String deliverOrder(Car car) {
        car.turnON();
        car.move();
        car.accelerate(230);
        car.park();
        car.turnOFF();
        if (car instanceof WeightHolder) {
            ((WeightHolder) car).leftCargo();
        }
        return "I`m moving from " + this.source + " to " + this.destination + " to deliver a package of " + this.weight
                + " K.G ";
    }
}
