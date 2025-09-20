import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calendar extends JPanel{
    private static final long serialVersionUID = 1L;
    public Calendar(){
        setLayout(new BorderLayout(30, 30));
        setBorder(BorderFactory.createEmptyBorder(40,20,30,20));
        setBackground((Color.white));

        JPanel top = new JPanel(new BorderLayout(10,10));
        top.setBackground(null);

        JLabel date = new JLabel("September 2025");
        date.setHorizontalAlignment(JLabel.CENTER);
        date.setFont(new Font("Noto Sans", Font.BOLD, 30));
        date.setForeground(Color.decode("#0ecf78"));
        top.add(date, BorderLayout.CENTER);

        JPanel days = new JPanel(new GridLayout(1, 7));
        days.setBackground(null);
        
        add(top, BorderLayout.NORTH);
        String[] daysList = {"Mon","Tu","Wed","Thu","Fri","Sat","Sun"};
        for (int i = 0; i < daysList.length; i++){
            days.add(new DayLabel(daysList[i], Color.decode("#f0f0f0"), Color.black, true));
        }

        add(days, BorderLayout.CENTER);
    }
}