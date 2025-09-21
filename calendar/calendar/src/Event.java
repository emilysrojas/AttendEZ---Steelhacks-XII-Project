


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Event{
    private static int idCounter = 0;
    public int eventUniqueID;
    public String name;
    public String host;
    public LocalDateTime dateTime;
    public String place;
    public String eventCode;
    private String description;

    

    public Event(String n, String description, String h, LocalDateTime dateTime, String p){
        this.eventUniqueID=idCounter++;
        name = n;
        host = h;
        this.dateTime = dateTime;
        place = p;

        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        for (int i = 0; i < 6; i++) {
            char c = chars[(int) (Math.random() * chars.length)];
            eventCode += c;
        }

   }
    public Event(LocalDate date){
            dateTime = LocalDateTime.of(date, LocalTime.now());
        }
    public Event(){}

    public int getID(){
        return eventUniqueID;
    }

    //next few methods are just accessors
    public String getName(){
        return name;
    }

    public String getHost(){
        return host;
    }

    public LocalDateTime getDate(){
        return dateTime;
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

    public void setDate(LocalDateTime d){
        dateTime = d;
    }

    public void setPlace(String p){
        place = p;
    }

    public String toString(){
        return host + " is hosting " + name + " on " + dateTime + "at " + place;
    }

    public String getEventCode(){
        return eventCode;
    }
}
