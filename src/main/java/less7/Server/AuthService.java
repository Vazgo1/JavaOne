package less7.Server;

/**
 * Сервис аунтификации
 */

public interface AuthService {

    /**
     * Запустить сервис
     */
    void start();

    /**
     * Отключить сервис
     */
    void  stop();

    /**
     * Получить никнайм по логину и поролю
     * @param login
     * @param pass
     * @return никнейм если найден и null если нет
     */
    String getNickByLoginAndPass(String login, String pass);
}
