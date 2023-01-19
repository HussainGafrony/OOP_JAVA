public class Hello {

    public static void main(String[] args) {
        // Microwave microwave = new Microwave(122, 35, "DE1");
        // // System.out.println(microwave.defreeze());
        // if (microwave.status) {
        // System.out.println(microwave.defreeze());
        // } else {
        // System.out.println("\n" + "onVoltag : " + microwave.onVoltag());
        // }

        // if (microwave.status) {
        // System.out.println(microwave.defreeze());
        // } else {
        // System.out.println("return :" + microwave.offVoltag());
        // }

        BMW bmw = new BMW(220, 4, "red", "Front");
        Jaguar jaguar = new Jaguar(320, 2, "Black", "Back");

        Order order1 = new Order("Hama", "Allepo", 1000);
        Order order2 = new Order("Homs", "Sham", 1500);

        System.out.println(order1.deliverOrder(bmw));
        System.out.println(order2.deliverOrder(jaguar));

    }

}
