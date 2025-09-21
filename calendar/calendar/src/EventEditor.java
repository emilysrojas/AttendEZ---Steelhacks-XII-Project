

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.util.Date;

public class EventEditor { 

    public EventEditor(Event e, JPanel parent) {
        JTextField title;
        JTextField time;
        JTextField description;
        Date day;
        Events events;
        JFrame frame = new JFrame("Calendar");
        frame.setSize(700,350);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.white);

        JPanel mainPanel = new JPanel(new BorderLayout(20,20));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(40,20,20,20));
        mainPanel.setBackground(Color.white);

        JPanel center = new JPanel(new GridLayout(3,2,20,20));
        center.setBackground(Color.white);

        JLabel l1 = new JLabel("Title");
        l1.setFont(new Font("Noto Sans", Font.PLAIN, 20));
        l1.setHorizontalAlignment(JLabel.CENTER);
        center.add(l1);

        title = new JTextField();
        title.setFont(new Font("Noto Sans", Font.PLAIN, 20));
        title.setHorizontalAlignment(JLabel.CENTER);
        center.add(title);
        
        JLabel l2 = new JLabel("Time");
        l2.setFont(new Font("Noto Sans", Font.PLAIN, 20));
        l2.setHorizontalAlignment(JLabel.CENTER);
        center.add(l2);

        time = new JTextField();
        time.setFont(new Font("Noto Sans", Font.PLAIN, 20));
        time.setHorizontalAlignment(JLabel.CENTER);
        center.add(time);

        JLabel l3 = new JLabel("Event Code: ");
        l3.setFont(new Font("Noto Sans", Font.PLAIN, 20));
        l3.setHorizontalAlignment(JLabel.CENTER);
        center.add(l3);

        description = new JTextField();
        description.setFont(new Font("Noto Sans", Font.PLAIN, 20));
        description.setHorizontalAlignment(JLabel.CENTER);
        center.add(description);

        mainPanel.add(center, BorderLayout.CENTER);

        JPanel bottom = new JPanel(new GridLayout(1,2,20,20));
        bottom.setBackground(null);

        JButton delete = new JButton("Delete");
        delete.setFont(new Font("Noto Sans", Font.PLAIN, 20));
        delete.setBackground(Color.decode("#00d1e8"));
        delete.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        bottom.add(delete);

        JButton save = new JButton("Save");
        save.setFont(new Font("Noto Sans", Font.PLAIN, 20));
        save.setBackground(Color.decode("#00d1e8"));
        save.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        bottom.add(save);


        mainPanel.add(bottom, BorderLayout.SOUTH);

        frame.getContentPane().add(mainPanel);

        frame.setVisible(true);
    }
}