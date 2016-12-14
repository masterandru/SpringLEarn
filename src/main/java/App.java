import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.EventListener;

/**
 * user
 * 13.12.2016
 */
public class App {
    Client client;
    ConsoleEventLogger eventLogger;

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) ctx.getBean("app");

        //app.client = new Client("1","John Smith");
        //app.eventLogger = new ConsoleEventLogger();

        app.logEvent("Come event for user 1");
        app.logEvent("Come event for user 2");

        ctx.close();
    }

    void logEvent(String msg) {
        String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(message);

    }

    public App(Client client, ConsoleEventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }
}
