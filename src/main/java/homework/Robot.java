package homework;

public class Robot implements  Action {

protected String name;

public Robot (String name){


    this.name = name;
}



    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println(name + " побежал");

    }

    @Override
    public void jump() {
        System.out.println(name + " прыгнул.");


    }
}


