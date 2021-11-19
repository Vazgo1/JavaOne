package leson6;

public abstract class Animal {
    protected String Name;
    protected int DistRun;
    protected int DistSwim;

    public Animal(String name){


    }
    public Animal(String Name, int distRun, int distSwim) {
        this.Name = Name;
        this.DistRun = distRun;
        this.DistSwim = distSwim;
    }

    protected Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + Name + '\'' +
                ", DistRun=" + DistRun +
                ", DistSwim=" + DistSwim +
                '}';
    }



    public abstract void run();

    public abstract void swim();
}
