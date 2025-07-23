

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Clock  extends JFrame{
    private JLabel lblClock;

    public Clock() {
        lblClock = new JLabel();
        lblClock.setHorizontalAlignment(JLabel.CENTER);
        lblClock.setOpaque(true);
        lblClock.setBackground(Color.lightGray);
        lblClock.setForeground(Color.BLACK);
        lblClock.setFont(new Font("Arial",Font.BOLD, 45));

        setTitle("Clock");
        setSize(550, 300);
        add(lblClock);
        setLocationRelativeTo(null);
        setVisible(true);

        new MyThread().start();

    }
    class MyThread extends Thread {
      public void run() {
        while(true) {
            Date d = new Date();
            String s = d.getHours()+":"+
                       d.getMinutes()+":"+
                       d.getSeconds();
                lblClock.setText(s);
                try {
                    sleep(100);
                } catch (Exception e) {}

        }
      } 
    }

    public static void main(String[] args) {
       new Clock() ;
    }
    
}
