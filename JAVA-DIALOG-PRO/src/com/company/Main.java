package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private static JDialog d;

    public static void main(String[] args) {
	// write your code here
        new Main();
    }


    Main() {
        JFrame f= new JFrame();
        d = new JDialog(f , "Dialog Example", true);
        d.setLayout( new FlowLayout() );
        JButton b = new JButton ("OK");
        b.addActionListener ( new ActionListener()
        {
            public void actionPerformed( ActionEvent e )
            {
                Main.d.setVisible(false);
            }
        });
        d.add( new JLabel ("Message to You - Click button to continue."));
        d.add(b);
        d.setSize(500,500);
        d.setVisible(true);
    }

}
