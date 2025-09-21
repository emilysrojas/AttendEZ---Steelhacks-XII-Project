import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calendar extends JPanel{
    public Calendar(int year, int month, LocalDate selectedDay, JPanel mainPanel){
        setLayout(new BorderLayout(30, 30));
        setBorder(BorderFactory.createEmptyBorder(40,20,30,20));
        setBackground((Color.white));

        JPanel top = new JPanel(new BorderLayout(10,10));
        top.setBackground(null);

        JLabel date = new JLabel(LocalDate.of(year, month, 1).format(DateTimeFormatter.ofPattern("MMMM yyyy")));
        date.setHorizontalAlignment(JLabel.CENTER);
        date.setFont(new Font("Noto Sans", Font.BOLD, 30));
        date.setForeground(Color.decode("#0ecf78"));
        top.add(date, BorderLayout.CENTER);

        JPanel days = new JPanel(new GridLayout(7, 7));
        days.setBackground(null);
        
        Color header = Color.decode("#f90069");
        days.add(new DayLabel("Su", header, Color.white, false));
        days.add(new DayLabel("Mo", header, Color.white, false));
        days.add(new DayLabel("Tu", header, Color.white, false));
        days.add(new DayLabel("We", header, Color.white, false));
        days.add(new DayLabel("Thu", header, Color.white, false));
        days.add(new DayLabel("Fr", header, Color.white, false));
        days.add(new DayLabel("Sa", header, Color.white, false));

        add(top, BorderLayout.NORTH);
        
        LocalDate firstDay = LocalDate.of(year, month, 1);
        String[] daysList = new String[] {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        int j = 0;
        while (!firstDay.getDayOfWeek().toString().equals(daysList[j])){
            days.add(new DayLabel("", Color.decode("#f0f0f0"), Color.black, false));
            j++;
        }

        int daysNum = YearMonth.of(year, month).lengthOfMonth();
        

        for (int i = 1; i <= daysNum; i++){
            final int day = i;
            DayLabel dayLabel;
            if (selectedDay.getYear()==year && selectedDay.getMonthValue() ==month && selectedDay.getDayOfMonth()==i){
                dayLabel = new DayLabel(i+"", Color.decode("#0ecf78"), Color.black, true);
            }else if (i%5==0){
                dayLabel = new DayLabel(i+"", Color.decode("#00d1e8"), Color.black, true);
            }else{
                dayLabel = new DayLabel(i+"", Color.decode("#f0f0f0"), Color.black, true);
            }
            dayLabel.addMouseListener(new MouseListener(){
                public void mouseReleased(MouseEvent e){}
                public void mousePressed(MouseEvent e){}
                public void mouseExited(MouseEvent e){}
                public void mouseEntered(MouseEvent e){}
                public void mouseClicked(MouseEvent e){
                    mainPanel.removeAll();
                    LocalDate selected = LocalDate.of(year, month, day);
                    mainPanel.add(new Calendar(year, month, selected, mainPanel));
                    mainPanel.add(new Events());
                    mainPanel.revalidate();
                }
    
            });
            days.add(dayLabel);
        }


        for (int i = 0; i < 42-(j+daysNum); i++){
            days.add(new DayLabel("", Color.decode("#f0f0f0"), Color.black, true));
        }


        add(days, BorderLayout.CENTER);


    }
}