package Task5;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Delivery delivery = new Delivery();

        Customer customer = new Customer("Taras", "0689691591");
        Item item = new Item("Toy", 2, 9);
        ReceivePoint receivePoint = new ReceivePoint("Transkarpathian", "Khustskiy", "Mizhirya", "Shevchenka", 33);

        Customer customer1 = new Customer("Yurii", "0689691591");
        Item item1 = new Item("Joy Boy", 5, 100);
        ReceivePoint receivePoint1 = new ReceivePoint("Lvivska", "Lviv", "Zolochevo", "Franka", 56);

        System.out.println("Departure points:");
        delivery.printDeparturePoint();

        delivery.createDelivery(3, customer, item, receivePoint, ShipmentMethod.BUS);


        delivery.createDelivery(1, customer1, item1, receivePoint1, ShipmentMethod.TRACK);
        System.out.println("Shipments:");
        delivery.printShipments();

        System.out.println(" ");

        delivery.deleteDelivery(2);
        delivery.printShipments();

    }
}