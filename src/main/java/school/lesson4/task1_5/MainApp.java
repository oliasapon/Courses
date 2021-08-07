package school.lesson4.task1_5;

public class MainApp {
    public static void main(String[] args) {
        Cat catBob = new Cat("Bob", "white", 3);
        Dog dogSam = new Dog("Sam", "black", 5);
        Dog dogFin = new Dog("Fin", "grey", 1);

        catBob.run(-5);
        catBob.swim(12);
        dogSam.run(150);
        dogFin.run(501);
        dogSam.swim(12);

        System.out.println();
        Animal.showAmount();
        Cat.showAmount();
        Dog.showAmount();

        System.out.println();
        Cat catBarsik = new Cat("Barsik", 50);
        Plate plate = new Plate(100, 200);
        plate.info();
        catBarsik.eat(plate);
        plate.info();
        plate.fill();
        plate.info();

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Marta", 12);
        cats[1] = new Cat("Archi", 45);
        cats[2] = new Cat("Tosya", 150);

        System.out.println();
        for(Cat cat : cats){
            cat.eat(plate);
        }
        plate.info();
    }
}
