package homework;

public class Cat implements  Action {


protected String name;

    @Override
    public String getName() {
        return name;
    }

    public Cat(String name){
    this.name = name;


}
    @Override
    public void run() {
        System.out.println(name + " побежал.");

    }

    @Override
    public void jump() {
        System.out.println(name + " прыгнул.");

    }
}
