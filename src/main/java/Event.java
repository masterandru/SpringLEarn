import java.text.DateFormat;
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
    DateFormat df;

    public Event(Date date, DateFormat df) {
        Random random = new Random();
        id = random.nextInt();
        this.df = df;
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

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        String formattedDate = df.format(date);
        return "Event{" + "date=" + formattedDate + ", id=" + id + ", msg='" + msg + '\'' + '}';
    }
}
