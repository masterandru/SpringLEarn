import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

/**
 * user
 * 13.12.2016
 */
public class Event {
    int id;
    String msg;
    Date date;

    public Event(Date date) {
        Random random = new Random();
        id = random.nextInt();
        this.date = date;
    }

    public Event() {
        Random random = new Random();
        id = random.nextInt();
        this.date = new Date();
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Event{" + "date=" + date + ", id=" + id + ", msg='" + msg + '\'' + '}';
    }
}
