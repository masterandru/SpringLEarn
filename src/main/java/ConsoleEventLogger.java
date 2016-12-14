/**
 * user
 * 13.12.2016
 */
public class ConsoleEventLogger implements EventLogger {
    public void logEvent(Event event) {
        System.out.println(event);
    }
}
