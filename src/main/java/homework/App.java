package homework;

public class App {
    public static void main(String[] args) {

        Action[] participants = new Action[3];
        participants[0] = new Human("Aleksey");
        participants[1] = new Cat("Barsik");
        participants[2] = new Robot("12421");

//Создаем массив с препятствиями.
        Obstacles[] obstaclesTrack = new Obstacles[4];
        obstaclesTrack[0] = new RunningTrack();
        obstaclesTrack[1] = new RunningTrack();
        obstaclesTrack[2] = new Wall();
        obstaclesTrack[3] = new Wall();

//Вызываем метод прохождения препятствий.
        goObstacles(participants, obstaclesTrack);
    }

    //Метод прохождения препятствий.
    public static void goObstacles (Action[] participants, Obstacles[] obstaclesTrack) {

        for (Action obj : participants) {
            for (Obstacles obst : obstaclesTrack) {

                if (obst.getType().equals("беговая дорожка")) {
                    obj.run();
                    obj.goObstaclesInterface(obst.getVar(), obj.getName(), obst.getType());
                    continue;
                }
                else if (obst.getType().equals("стена")){
                    obj.jump();
                    obj.goObstaclesInterface(obst.getVar(), obj.getName(), obst.getType());
                    continue;
                }

            }
        }
    }

}
