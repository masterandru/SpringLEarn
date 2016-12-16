import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.EventListener;
import java.util.Map;

/*
 * user
 * 13.12.2016
 */
public class App {
    Client client;
    //ConsoleEventLogger eventLogger;
    EventLogger logger;
    EventLogger defaultLogger;
    Map<EventType, EventLogger> loggers;

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) ctx.getBean("app");

        //app.client = new Client("1","John Smith");
        //app.eventLogger = new ConsoleEventLogger();

        //app.logEvent("Come event for user 1");
        //app.logEvent("Come event for user 2");

        //Event testEvent1 = (Event) ctx.getBean("event");
        //Event testEvent2 = (Event) ctx.getBean("event");
        //testEvent1.setMsg("Come event for user 1");
        //testEvent2.setMsg("Come event for user 2");

        EventLogger defaultLogger = (CacheFileEventLogger) ctx.getBean("cacheFileEventLogger");
        app.logEvent(EventType.ERROR, "Come event for user 1\"");
        app.logEvent(EventType.INFO, "Come event for user 2");
        //app.logEvent(null,testEvent2);

        ctx.close();
    }

    void logEvent(EventType type, String msg) {
        EventLogger logger = loggers.get(type);
        if (logger == null) {
            logger = defaultLogger;
        }
        logger.logEvent(event);
    }


    public App(Client client, EventLogger eventLogger, Map<EventType, EventLogger> loggers) {
        this.client = client;
        this.loggers = loggers;
    }


    void logEvent(Event event) {
        //String message = msg.replaceAll(client.getId(), client.getFullName());
        logger.logEvent(event);
    }


/*
    public App(Client client, ConsoleEventLogger eventLogger, EventType eventType) {
        this.client = client;
        this.eventLogger = eventLogger;
    }
*/

}