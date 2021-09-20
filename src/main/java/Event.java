

import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

public class Event  {
    private int id = new Random().nextInt();
    private String msg;
    private Date date;
    private DateFormat dateFormatter;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Event(Date date, DateFormat dateFormatter) {
        this.date = date;
        this.dateFormatter = dateFormatter;
    }

    @Override
    public String  toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + dateFormatter.format(date) +
                '}';
    }



}
