package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// java swing графическая библиотека
public class WindowApp extends JFrame {
    public WindowApp() {
        setTitle("my new window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++) {
            JButton button = new JButton("Button#" + (i + 1));
            add(button);


        }

       /*JButton button = new JButton("Baton #1");
        JButton button2 = new JButton("Baton #2");
        add(button, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);*/
        setLayout(null);
        JTextField textField =new JTextField();
        textField.setBounds(20,20,120,32);
        add(textField);
        JButton button = new JButton("Talda");
        button.setBounds(20,60,120,32);
        add(button);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setText(textField.getText());

            }
        });
    textField.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(textField.getText());
            button.setText(textField.getText());
        }
    });
    addWindowListener(new WindowAdapter() {
        @Override
        public void windowOpened(WindowEvent e) {
            System.out.println("Игорь иваныч");
        }
    });
    setVisible(true);
    }


    public static void main(String[] args) {
        new WindowApp();
    }
}
