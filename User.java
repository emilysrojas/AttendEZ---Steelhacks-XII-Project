public class User {
    private static int idCounter = 0; // static counter to assign unique IDs
    private int userID; // unique ID for each user
    public String username;
    public int points;
    public int attendanceTotal;

    public User(String username){
        this.userID = idCounter++;
        this.username = username;
        points = 0;
        attendanceTotal = 0;
    }

    public void addAttendance(Event e){
        attendanceTotal += 1;
        points += e.getPoints();
    }

    public int getPoints(){
        return points;
    }

    public int getAttendance(){
        return attendanceTotal;
    }
    public int getID(){
        return userID;
    }

    public String getUsername(){
        return username;
    }
}