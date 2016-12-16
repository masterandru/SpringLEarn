import java.util.Collection;

/**
 * user
 * 16.12.2016
 */
public class CombineEventLogger implements EventLogger {
    private Collection loggerrs;

    public void logEvent(Event event) {

    }

    public CombineEventLogger(Collection loggerrs) {
        this.loggerrs = loggerrs;
    }
}
