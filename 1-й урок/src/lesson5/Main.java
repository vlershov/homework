package lesson5;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Собака", 500, 0.5, 10);
        horse horse = new horse("Лошадь", 1500, 3, 100);
        Bird bird = new Bird("Птица", 5, 0.2, 0);
        Cat сat = new Cat("Кошка", 200, 2, 0);


        System.out.println(horse.getCanjump(2));
        System.out.println(dog.getCanRun(300));
        System.out.println(сat.getCanswim(10));

        Dog dog1 = new Dog("Собака вольт", 600, 3, 20);

        System.out.println(dog1.getCanjump(1));
        System.out.println(dog1.getCanRun(500));
        System.out.println(dog1.getCanswim(10));

    }
}
