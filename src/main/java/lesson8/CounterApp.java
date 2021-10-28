package lesson8;

import javax.swing.*;
import java.awt.*;

public class CounterApp extends JFrame {
    private int value;

    public  CounterApp(int value){
        this.value = value;
        setBounds(500,500,300,150);
        setTitle("Simpl counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //шрифт
        Font font = new Font("Arial", Font.BOLD,32);
//счетчик



    //public static void main(String[] args) {
        new CounterApp(0);
    }
}
