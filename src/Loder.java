public class Loder {
    public static void main(String[] args) {
        String str = "Hi!";
        Dog dog1 = new Dog();
        System.out.printf("Вес кошки N1: %.2f %n", dog1.getWeight());
        dog1.feed(200.0);
        dog1.pee();
        dog1.drink(10.0);
        dog1.woof();
        System.out.printf("Вес кошки N1 после кормежки: %.2f %n", dog1.getWeight());
        System.out.println();
    }
}
