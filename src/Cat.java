public class Cat {


    private String name;
    private int appetite;
    public boolean full;

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        full = false;//хоть она и так false
    }

    public void eat(Plate p){
        setFull(p.decreaseFood(appetite));
        return;
    }

    public void catInfo(){
        if (getFull()) System.out.println(name + " is full!\n");
        else System.out.println(name + " is hungry!\n");
    }


    public boolean getFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public String getName() {
        return name;
    }
}