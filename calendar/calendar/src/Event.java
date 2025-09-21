


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.io.FileWriter;
import java.io.IOException;

public class Event{
    private static int idCounter = 0; //static counter to assign unique IDs to each event
    public int eventUniqueID; // every event has a unique ID for accesing it
    public String name;
    public String host;
    public LocalDateTime dateTime;
    public String place;
    public String eventCode; // this is what people will use to join the event
    public int eventPoints; // points associated with the event

    
    //constructors

    //constructor with random code
    public Event(String n, String h, LocalDateTime dateTime, String p) throws IOException{
        this.eventUniqueID=idCounter++; //assign the current counter value as the event ID, then increment the counter
        name = n;
        host = h;
        this.dateTime = dateTime;
        place = p;
        eventCode = "";
        eventPoints=10; //default points for an event is 10
        
        //generate a random 6 character event code
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        for (int i = 0; i < 6; i++) {
            char c = chars[(int) (Math.random() * chars.length)];
            eventCode += c;
        }

        //write event details to a file
        FileWriter writer = new FileWriter("events.txt", true); //open in append mode
        writer.write(eventCode+"," +eventPoints+"\n"); //write event code and points to file
        writer.close();

   }

   //constructor with specified code
   public Event(String n, String h, LocalDateTime dateTime, String p, String code) throws IOException{
        this.eventUniqueID=idCounter++; //assign the current counter value as the event ID, then increment the counter
        name = n;
        host = h;
        this.dateTime = dateTime;
        place = p;
        eventCode = code;
        eventPoints=10; //default points for an event is 10
        
        //write event details to a file
        FileWriter writer = new FileWriter("events.txt", true); //open in append mode
        writer.write(eventCode+"," +eventPoints+"\n"); //write event code and points to file
        writer.close();

   }



    public Event(LocalDate date){
            eventUniqueID=idCounter++;
            name = "Untitled Event";
            dateTime = LocalDateTime.of(date, LocalTime.now());
            eventPoints=10;
        }

    public Event(){
        eventUniqueID=idCounter++;
        name = "Untitled Event";
        dateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        eventPoints=10;
    }


    //next few methods are just accessors
    public int getID(){
        return eventUniqueID;
    }

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

    public int getPoints(){
        return eventPoints;
    }


    public String toString(){
        return host + " is hosting " + name + " on " + dateTime + "at " + place;
    }

    public String getEventCode(){
        return eventCode;
    }

    // methods to modify event details
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
}
