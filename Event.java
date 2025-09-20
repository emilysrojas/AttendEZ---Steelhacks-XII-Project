public class Event {
    //variables for event
    public String n;
    public String h;
    public int d;
    public int t;
    public String p;
    public static int eventid;
    
    //constructing new event object
    public Event(String name, String host, int date, int time, String place){
        n = name;
        h = host;
        d = date; //check how to properly input date
        t = time;
        p = place;
        eventid +=1; //check if this is how to make id
    }

    //next few methods are just accessors
    public String getName(){
        return n;
    }

    public String getHost(){
        return h;
    }

    public int getDate(){
        return d;
    }

    public int getTime(){
        return t;
    }

    public String getPlace(){
        return p;
    }


    //next few methods are to change object variables
    public void setName(String name){
        n = name;
    }

    public void setHost(String host){
        h = host;
    }

    public void setDate(int date){
        d = date;
    }

    public void setTime(int time){
        t = time;
    }

    public void setPlace(String place){
        p = place;
    }


//     //next method determine point value for event
//     public int getPoint(){
//         return 
//     }

    public String toString(){
        return h + " is hosting " + n + " on " + d + " at " + t + " at " + p;
    }
}
