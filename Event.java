public class Event {
    //variables for event
    public String name;
    public String host;
    public int date;
    public int time;
    public String place;
    public static int eventid;
    
    //constructing new event object
    public Event(String n, String h, int d, int t, String p){
        name = n;
        host = h;
        date = d;
        time = t;
        place = p;
        // eventid +=1; //check if this is how to make id
    }

    //next few methods are just accessors
    public String getName(){
        return name;
    }

    public String getHost(){
        return host;
    }

    public int getDate(){
        return date;
    }

    public int getTime(){
        return time;
    }

    public String getPlace(){
        return place;
    }


    //next few methods are to change object variables
    public void setName(String n){
        name = n;
    }

    public void setHost(String h){
        host = h;
    }

    public void setDate(int d){
        date = d;
    }

    public void setTime(int t){
        time = t;
    }

    public void setPlace(String p){
        place = p;
    }


//     //next method determine point value for event
//     public int getPoint(){
//         return 
//     }

    public String toString(){
        return host + " is hosting " + name + " on " + date + " at " + time + " at " + place;
    }
}
