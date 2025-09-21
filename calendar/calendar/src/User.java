import java.util.Scanner;

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

    public void addAttendance(String eventC){
        attendanceTotal += 1;

        try (Scanner scanner = new Scanner(new java.io.File("events.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts[0].equals(eventC)) {
                    points += Integer.parseInt(parts[1]);
                    return; // Exit after finding the event code
                }
            }
            Scanner nc = new Scanner(new java.io.File("exampleEvents.txt"));
            while(nc.hasNextLine()){
                String line = nc.nextLine();
                String[] parts = line.split(",");
                if (parts[0].equals(eventC)) {
                    points += Integer.parseInt(parts[1]);
                    return; // Exit after finding the event code
                }
            }
        } catch (java.io.FileNotFoundException ex) {
            System.out.println("File not found: " + ex.getMessage());
        }
        

        
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

    public String toString(){
        return "User: " + username + " (ID: " + userID + ")\nPoints: " + points + "\nTotal Events Attended: " + attendanceTotal + "\n";
    }
}