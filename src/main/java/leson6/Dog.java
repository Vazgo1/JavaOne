package leson6;

public class Dog extends Animal {

    public Dog(String Name) {
        super(Name);
    }

    @Override
    public void run() {
        if (DistRun <= 500) {
            System.out.println(Name + " Пробежал " + DistRun + " метров ");
        } else {
            System.out.println(" не добежал ");
        }
    }

    @Override
    public void swim() {
        if (DistSwim <= 200) {
            System.out.println(Name + " проплыл " + " метров ");
        } else {
            System.out.println(" не доплыл ");

        }
    }

    public void setDistRun(int distRun) {
        if (distRun >= 0) {
            DistRun = distRun;
        } else {
            System.out.println(" число не может быть отрецательным ");
        }
    }

    public void SetSwimDist(int swimDist){
        if (swimDist>=0) {
            DistSwim = swimDist;
        }else {
            System.out.println(" число не может быть отрецательным ");
        }
    }
}
