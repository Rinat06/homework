public class Main {
    public static void main(String[] args) {
        Builder mersedes = new Builder("Mersedes", "w211", 5, Color.Mate_Black, 2006, car_tip.passenger_car, 19);
        System.out.println(mersedes.getInfo());
        factory factory = new factory("Germany", "Berlin");
        System.out.println(factory.getInfo());



        System.out.println("----------------------");



        Builder bmw = new Builder("BMW", "e39", 4,Color.Black, 2000, car_tip.passenger_car, 17);
        System.out.println(bmw.getInfo());
        factory factory1 = new factory("Russia", "Mocow");
        System.out.println(factory1.getInfo());
    }
}