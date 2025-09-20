import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Events extends JPanel{
    private static final long serialVersionUID = 1L;  
        public Events(){
            setLayout(new BorderLayout(20,20));
            setBackground(Color.white);
            setBorder(BorderFactory.createEmptyBorder(40,20,30,20));

            JPanel list = new JPanel(new GridLayout(4,1,10,10));
            list.setBackground(Color.white);

            for (int i=0; i<4; i++){
            JPanel event = new JPanel(new GridLayout(2,1));
            event.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(10,10,10,10), BorderFactory.createMatteBorder(0,10,0,0, Color.decode("#00d1e8"))));
            event.setBackground(Color.decode("#f0f0f0"));
            event.setCursor(new Cursor(Cursor.HAND_CURSOR));

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
            add(list, BorderLayout.CENTER);
        }
    }
