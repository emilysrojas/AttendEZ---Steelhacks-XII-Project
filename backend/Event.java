
import java.util.Date;

public class Event{
    private static int idCounter = 0;
    public int eventUniqueID;
    public String name;
    public String host;
    public Date date;
    public String place;
    public String eventCode;

    

    public Event(String n, String h, Date d, String p){
        this.eventUniqueID=idCounter++;
        name = n;
        host = h;
        date = d;
        place = p;

        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        for (int i = 0; i < 6; i++) {
            char c = chars[(int) (Math.random() * chars.length)];
            eventCode += c;
        }

   }

    //next few methods are just accessors
    public String getName(){
        return name;
    }

    public String getHost(){
        return host;
    }

    public Date getDate(){
        return date;
    }

    public String getPlace(){
        return place;
    }


    public void setName(String n){
        name = n;
    }

    public void setHost(String h){
        host = h;
    }

    public void setDate(Date d){
        date = d;
    }

    public void setPlace(String p){
        place = p;
    }

    public String toString(){
        return host + " is hosting " + name + " on " + date + "at " + place;
    }

    public String getEventCode(){
        return eventCode;
    }
}
