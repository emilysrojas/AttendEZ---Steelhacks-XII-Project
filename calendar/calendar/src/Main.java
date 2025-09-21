import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;

public class Main {
    public static void main(String [] args) throws IOException{
        User demoUser = new User("DemoUser");
        Event demoEvent1 = new Event("Steelhacks XII", "Pitt", LocalDateTime.of(2025, 9, 20, 11, 0), "Pittsburgh, PA");

        demoUser.addAttendance(demoEvent1);
        System.out.println(demoUser);

        Event demoEvent2 = new Event("Steelhacks XIII", "Pitt", 
            LocalDateTime.of(2026, 9, 20, 11, 0), "Pittsburgh, PA","STEEL2");
        demoUser.addAttendance("STEEL2");
        System.out.println(demoUser);

        demoUser.addAttendance("WICS25");
        System.out.println(demoUser);


        FileOutputStream fos = new FileOutputStream("events.txt");
        fos.close();







    }
}
