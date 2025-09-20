public class User {
    private int userID;
    public int points;
    public int attendanceTotal;

    public User(int id, int p, int a){
        userID = id;
        points = p;
        attendanceTotal = a;
    }

    public void addPoints(int p){
        points += p;
    }

    public void addAttendance(int a){
        attendanceTotal += a;
    }

    public int getPoints(){
        return points;
    }

    public int getAttendance(){
        return attendanceTotal;
    }
}