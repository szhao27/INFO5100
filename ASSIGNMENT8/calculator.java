package ASSIGNMENT8;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

enum Operation {
    ADD, SUBTRACT, MULTIPLY, DIVIDE
}

public class calculator extends JFrame {

    private Font font;
    private JTextField resultTextField;
    private JButton add, subtract, multiply, divide, compute,reset;
    private JButton numbers[];


     int first = 0;

     int second = 0;
    Operation o=null;
     boolean kkk=true;



    class OperationListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            kkk=false;
            if (e.getSource() == add) {
                o = Operation.ADD;
            }
            if (e.getSource() == subtract) {
                o = Operation.SUBTRACT;
            }
            if (e.getSource() == multiply) {
                o = Operation.MULTIPLY;
            }
            if (e.getSource() == divide) {
                o = Operation.DIVIDE;
            }

        }

    }

    class ComputeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int result = 0;
            if (o == Operation.ADD) {
                result = first + second;
            }
            if (o == Operation.SUBTRACT) {
                result = first - second;
            }
                if (o == Operation.DIVIDE) {
                    result = first / second;
                }
            if (o == Operation.MULTIPLY) {
                result = first * second;
            }
            first=result;
            second=0;
            resultTextField.setText(result + "");

        }

    }
    class NumberListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int t=0;
            if(e.getSource()==numbers[0]){
            t=0;
            }
            if(e.getSource()==numbers[1]){
                t=1;
            }if(e.getSource()==numbers[2]){
                t=2;
            }if(e.getSource()==numbers[3]){
                t=3;
            }if(e.getSource()==numbers[4]){
                t=4;
            }if(e.getSource()==numbers[5]){
                t=5;
            }if(e.getSource()==numbers[6]){
                t=6;
            }if(e.getSource()==numbers[7]){
                t=7;
            }
            if(e.getSource()==numbers[8]){
                t=8;
            }if(e.getSource()==numbers[9]){
                t=9;
            }
            if(o!=null){
                kkk=false;
            }
            if(kkk){
                first=t+10*first;
                resultTextField.setText(first + "");
            }
            else{
                second=t+10*second;
                resultTextField.setText(second + "");
            }
        }

        }
    class ResetListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        kkk=true;
        first=0;
        second=0;
        Operation o=null;
        resultTextField.setText("");
        }
    }
    public calculator() {
        createComponents();
        setLayout();
        addComponents();
        addBehaviors();
        display();
    }

    private void addBehaviors() {
        ComputeListener cl = new ComputeListener();
        compute.addActionListener(cl);

        OperationListener ol = new OperationListener();
        add.addActionListener(ol);
        subtract.addActionListener(ol);
        multiply.addActionListener(ol);
        divide.addActionListener(ol);

        NumberListener nn=new NumberListener();
        for(int i=0;i<10;i++){
            numbers[i].addActionListener(nn);
        }
        ResetListener rr=new ResetListener();
        reset.addActionListener(rr);
    }

    private void display() {
        setSize(600, 600);
        setVisible(true);

    }

    private void addComponents() {
        Container c = getContentPane();
        c.add(resultTextField);

        JPanel panel = new JPanel();
        panel.add(add);
        panel.add(subtract);
        panel.add(multiply);
        panel.add(divide);
        c.add(panel);

        panel = new JPanel();
        panel.add(compute);
        panel.add(reset);
        c.add(panel);

        JPanel p = new JPanel();
        p.add(numbers[1]);
        p.add(numbers[2]);
        p.add(numbers[3]);
        p.add(numbers[4]);

        c.add(p);

        p = new JPanel();
        p.add(numbers[5]);
        p.add(numbers[6]);
        p.add(numbers[7]);
        p.add(numbers[8]);

        c.add(p);

        p = new JPanel();
        p.add(numbers[9]);
        p.add(numbers[0]);

        c.add(p);

    }

    private void setLayout() {
        GridLayout gl = new GridLayout(10, 1);
        Container c = this.getContentPane();
        c.setLayout(gl);

    }

    private void createComponents() {
        font = new Font("TimesRoman", Font.PLAIN, 36);
        resultTextField = new JTextField(10);
        resultTextField.setFont(font);

        add = new JButton("+");
        add.setFont(font);
        subtract = new JButton("-");
        subtract.setFont(font);
        multiply = new JButton("x");
        multiply.setFont(font);
        divide = new JButton("%");
        divide.setFont(font);
        compute = new JButton("=");
        compute.setFont(font);
        reset=new JButton("AC");
        reset.setFont(font);

        numbers = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = new JButton(i + "");
            numbers[i].setFont(font);
        }

    }

    public static void main(String[] args) {
        calculator c = new calculator();

    }

}
