import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Events extends JPanel{

        public Events(LocalDate selectedDay, JPanel parent){
            // public ArrayList<Event> getEvents(String date){
            //     ArrayList<Event> events = new ArrayList<>;
            //     String select = "SELECT * FROM `calendar` WHERE `Date` = '';";
            //     return events;
            // }
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            ArrayList<Event> events = new ArrayList<>();
            JPanel list;
            setLayout(new BorderLayout(20,20));
            setBackground(Color.white);
            setBorder(BorderFactory.createEmptyBorder(40,20,30,20));

            int rows = 4;
            if (events.size()>4)
                rows = events.size();

            list = new JPanel(new GridLayout(rows,1,1,10));
            list.setBackground(Color.white);

            JScrollPane sp = new JScrollPane(list);

            for (int i=0; i<29; i++){
            final int j = i;
            JPanel event = new JPanel(new GridLayout(2,1));
            event.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(10,10,10,10), BorderFactory.createMatteBorder(0,10,0,0, Color.decode("#00d1e8"))));
            event.setBackground(Color.decode("#f0f0f0"));
            event.setCursor(new Cursor(Cursor.HAND_CURSOR));
            event.addMouseListener(new MouseListener(){

                @Override
                public void mouseClicked(MouseEvent e) {
                    new EventEditor(events.get(j), parent);
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                   
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                }

                @Override
                public void mouseExited(MouseEvent e) {
                }
                
            });

            JLabel title = new JLabel("Event Title");
            title.setBorder(BorderFactory.createEmptyBorder(0,15,0,15));
            title.setFont(new Font("Noto Sans", Font.PLAIN, 18));
            title.setForeground(Color.black);
            event.add(title);

            JLabel time = new JLabel("Event Time");
            time.setBorder(BorderFactory.createEmptyBorder(5,15,4,15));
            time.setFont(new Font("Noto Sans", Font.PLAIN, 14));
            time.setForeground(Color.DARK_GRAY);
            event.add(time);

            list.add(event);
            }
            add(sp, BorderLayout.CENTER);
            JButton newEvent = new JButton("New");
            newEvent.setFont(new Font("Noto Sans", Font.PLAIN, 20));
            newEvent.setBackground(Color.decode("#00d1e8"));
            newEvent.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new EventEditor(new Event(), parent);
                }

            });
            newEvent.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            add(newEvent, BorderLayout.SOUTH);
    }
}