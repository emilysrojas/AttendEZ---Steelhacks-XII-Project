import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridLayout;
import java.time.LocalDate;


public class App {
    public static void main(String[] args){
        
        //EventEditor n = new EventEditor();
        JFrame frame = new JFrame("Calendar");
        frame.setSize(900,500);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.white);

        JPanel mainPanel = new JPanel(new GridLayout(1,2));

        LocalDate date = LocalDate.now();
        
        mainPanel.add(new Calendar(date.getYear(), date.getMonthValue(),date, mainPanel));
        mainPanel.add(new Events(date, mainPanel));

        frame.getContentPane().add(mainPanel);
        frame.setVisible(true);
    }
}
