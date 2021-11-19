package less6;

import javax.swing.*;
import java.awt.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ExoClient2 extends JFrame {
    private final String SERVER_ADDRESS = "localhost";
    private final int SERVER_PORT = 8089;

    private JTextField textField;
    private JTextArea textArea;

    private Socket socket;
    private DataInputStream dataInputStream;
    private DataOutputStream dataOutputStream;



    public ExoClient2() {
        try {
            openConnection();
        }catch (IOException e) {
            e.printStackTrace();
        }
        prepareUI();

    }

    private void openConnection () throws IOException {
        socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
        dataInputStream = new DataInputStream(socket.getInputStream());
        dataOutputStream = new DataOutputStream(socket.getOutputStream());

        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    while (true) {

                        String messageFromServer = dataInputStream.readUTF();

                        if (messageFromServer.equals("/end")) {
                            break;
                        }

                        textArea.append(messageFromServer);
                        textArea.append("\n");
                    }

                    textArea.append("Соединение разорвано");
                    textField.setEnabled(false);
                    closeConnection();

                }catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        }).start();

    }

    private void closeConnection() {
        try {
            dataOutputStream.close();

        }catch (Exception ex) {

        }

        try {
            dataInputStream.close();

        }catch (Exception ex) {

        }

        try {
            socket.close();
        }catch (Exception ex) {

        }
    }

    private void sendMessage() {
        if (textField.getText().trim().isEmpty()) {
            return;
        }
        try {
            dataOutputStream.writeUTF(textField.getText());
            textField.setText("");
            textField.grabFocus();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void prepareUI () {

        setBounds(200, 200, 500, 500);
        setTitle("EchoClient2");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JPanel panel = new JPanel(new BorderLayout());
        JButton button = new JButton("Send");
        panel.add(button, BorderLayout.EAST);
        textField = new JTextField();
        panel.add(textField, BorderLayout.CENTER);

        add(panel, BorderLayout.SOUTH);

        button.addActionListener(e -> sendMessage());

        textField.addActionListener(e -> sendMessage());

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ExoClient2());
    }

}

