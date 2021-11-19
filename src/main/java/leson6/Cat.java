package leson6;

public class Cat extends Animal {
    public Cat() {

    }

    public Cat(String Name) {
        super(Name);
    }

    @Override
    public void run() {
        if (DistRun <= 200) {
            System.out.println( Name + " Пробежал " + DistRun + " метров");
        } else {
            System.out.println(" не добежал ");
        }
    }

    @Override
    public void swim() {
        System.out.println(Name + " а коты не умеют плават ");

    }

    public void setDistRun(int distRun) {
        if (distRun >= 0) {
            DistRun = distRun;
        }else {
            System.out.println(" Число не может быть отрецательным ");
        }

    }

    public  void setSwimDist(int swimDist) {
        if (swimDist>=0) {
            DistSwim = swimDist;
        }else {
            System.out.println(" Число не может быть отрецательным ");
        }
    }
}

