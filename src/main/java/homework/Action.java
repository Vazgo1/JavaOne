package homework;

public interface Action {
    void  run();
    void  jump();
    String getName();

    default int goObstaclesInterface (int var, String name, String type) {

        if (var <= 5){
        System.out.println( name + " смог пробежать - " + type);
        return 1;
    }
    else {
        System.out.println(name + " не справился с препядствием - " + type);
        System.out.println(name + " выбыл");
        return 2;
    }
    }

}
