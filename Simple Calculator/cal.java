import javax.swing.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener{
    private JTextField t1;

    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton b10;
    private JButton b11;
    private JButton b12;
    private JButton b13;
    private JButton b14;
    private JButton b15;
    private JButton b16;
    private JButton b17;

    private Integer res;
    private  String operation;

    public Calculator(){
        setLayout(null);
        setSize(680, 480);
        t1 = new JTextField();
        t1. setBounds(100, 100, 200, 30);

        b1 = new JButton("1");
        b1.setBounds(100, 140, 50, 30);
        b1 = new JButton("2");
        b1.setBounds(150, 140, 50, 30);
        b3 = new JButton("3");
        b3.setBounds(200, 140, 50, 30);
        b4 = new JButton("+");

        b4.setBounds(250, 140, 50, 30);
        b5 = new JButton("4");
        b5.setBounds(100, 170, 50, 30);
        b6 = new JButton("5");
        b6.setBounds(150, 170, 50, 30);
        b7 = new JButton("6");
        b7.setBounds(200, 170, 50, 30);
        b8 = new JButton("-");
        b8.setBounds(250, 170, 50, 30);

        b9 = new JButton("7");
        b9.setBounds(100, 200, 50, 30);
        b10 = new JButton("8");
        b10.setBounds(150, 200, 50, 30);
        b11 = new JButton("9");
        b11.setBounds(200, 200, 50, 30);
        b12 = new JButton("x");
        b12.setBounds(250, 200, 50, 30);

        b13 = new JButton("/");
        b13.setBounds(100, 230, 50, 30);
    }
}