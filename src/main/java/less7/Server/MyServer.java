package less7.Server;

import less7.constants.Constants;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * логика сервера.
 */
public class MyServer {

    public AuthService getAuthService() {
        return authService;
    }

    /**
     * Сервис аутентификации.
     */
    private AuthService authService;

    /**
     * Активные клиенты.
     */
    private List<ClientHandler> clients;

    public MyServer() {
        try (ServerSocket server = new ServerSocket(Constants.SERVER_PORT)) {

            authService = new BaseAuthService();
            authService.start();

            clients = new ArrayList<>();

            while (true) {
                System.out.println("Сервер ожидает подключения.");
                Socket socket = server.accept();
                System.out.println("Клиент подключился");
                new ClientHandler(this, socket);
            }

        }catch (IOException ex) {
            System.out.println("Ошибка в работе сервера.");
            ex.printStackTrace();
        } finally {
            if (authService != null) {
                authService.stop();
            }
        }
    }

    public synchronized void broadcastMessage(String message) {

        clients.forEach(client -> client.sendMessage(message));
    }

    public synchronized void privBroadcastMessage(String message, String privName, String otpravitel) {
        for (ClientHandler cl : clients) {
            if (cl.getName().equals(privName)) {
                for (ClientHandler cl1 : clients) {
                    if (cl1.getName().equals(otpravitel)) {
                        cl.sendMessage(message);
                        cl1.sendMessage("Вы отправили личное сообщение для " + privName);
                        return;
                    }
                }
            }
        }
        for (ClientHandler cl : clients) {
            System.out.println("Пользователь не найден.");
            if (cl.getName().equals(otpravitel)) {
                cl.sendMessage("Такого пользователя не существует.");
                return;
            }
        }
    }

    public synchronized void subscribe (ClientHandler client) {
        clients.add(client);
    }

    public synchronized void unsubscribe (ClientHandler client) {
        clients.remove(client);
    }

}