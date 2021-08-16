package leson6;

public class AnimalApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsic");
        Dog dog = new Dog("Bobic");
        cat.setDistRun(200);
        dog.SetSwimDist(40);
        cat.setSwimDist(10);
        System.out.println(cat);
        cat.run();
        cat.swim();
        dog.run();
        dog.swim();
    }
}
