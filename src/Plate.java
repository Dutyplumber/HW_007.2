public class Plate {


    private int food;


    public Plate(int food){
        this.food = food;
    }

    public void plateInfo(){
        System.out.println(food + " is in the plate");
    }

    public boolean decreaseFood(int n){
        if ( food > n){
            System.out.println("Cat is eating...");
            food = food - n;
            return true;
        }
        else {
            System.out.println("Insufficient food in the plate!");
            return false;
        }
    }

    public void increaseFood(int n){
        food = food + n;
    }

}

