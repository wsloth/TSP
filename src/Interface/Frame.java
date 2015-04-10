/**
 * -- This is a frame for the TSP simulation --
 * <p>
 * <p>
 * <p>
 * -- created on 10-4-2015 by Simon Brink --
 */
package Interface;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Frame extends JFrame implements ActionListener {

    private JLabel width;
    private JComboBox selectWidth;
    private String[] arrayWidth = {"100", "1000", "500"};

    private JButton reset;
    private JButton start;
    private JButton stop;

    private JLabel result;
    private JTextArea displayResult;

    private JButton enumeration;
    private JButton greedy;
    private JButton random;

    public Frame() {

        setTitle("TSP Simulation");
        setLayout(new GridLayout(3, 5));
        setSize(1000, 1000);

        width = new JLabel("Width : ");
        add(width);
        selectWidth = new JComboBox(arrayWidth);
        add(selectWidth);

        reset = new JButton("Reset");
        add(reset);
        enumeration = new JButton("Enumeration");
        add(enumeration);
        enumeration.addActionListener(this);

        greedy = new JButton("Greedy");
        add(greedy);
        greedy.addActionListener(this);

        random = new JButton("Random");
        add(random);
        random.addActionListener(this);

        add(new Field());


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}