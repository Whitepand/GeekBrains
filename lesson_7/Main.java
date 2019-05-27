import lesson_7.Cat;
import lesson_7.Plate;

public class Main {
    public static void main(String[] args) {
        System.out.println("List of cats:");
        Cat[] x = {new Cat("Rokkie", 7), new Cat("Tod", 5), new Cat("Killer", 15)};
        Plate plate = new Plate(100);
        for (Cat c : x) {
            System.out.println(c);
        }
        System.out.println("\n" + plate);
        System.out.println("                             ");
        System.out.println("increase food by 100");
        plate.increaseFood(100);
        System.out.println(plate);
        System.out.println("                              ");
        System.out.println("Cats take food:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
        }
    }
}
