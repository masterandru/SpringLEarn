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

        //app.logEvent("Come event for user 1");
        //app.logEvent("Come event for user 2");

        Event testEvent1 = (Event) ctx.getBean("event");
        Event testEvent2 = (Event) ctx.getBean("event");
        testEvent1.setMsg("Come event for user 1");
        testEvent2.setMsg("Come event for user 2");

        app.logEvent(testEvent1);
        app.logEvent(testEvent1);

        ctx.close();
    }

    void logEvent(Event event) {
        //String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(event);

    }

    public App(Client client, ConsoleEventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }
}
