public class MainClass {

    public static void main (String [] args){

        Cat[] cats = {
                new Cat("Barsik", 30),
                new Cat ("Fedot", 60),
                new Cat ("Vasyka", 15)};

        Plate plate = new Plate(100);

        plate.plateInfo();

        for (Cat c : cats) {
            c.eat(plate);
            c.catInfo();
            plate.plateInfo();
        }

        plate.increaseFood(200);
        plate.plateInfo();

    }
}