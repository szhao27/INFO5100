package ASSIGNMENT8;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.event.ActionListener;

class studentvv extends JFrame {
    public static int totalnum=0;
    private static final long serialVersionUID = 1L;
    private Font font;
    private JButton addbutton;
    private JLabel IDlabel,namelabel,genderlabel,Femalelabel,Malelabel;
    private JTextField IDTextField,nameTextField;
    private JTable sitable;
    private JCheckBox Male,Female;
    private GridLayout gg;
    private String[][] roww=new String[15][3];
    private String[] field={"ID","name","gender"};
    private JScrollPane jsp;

    public studentvv(){
        createComponents();
        setLayout();
        display();
    }
    private void createComponents() {
        font = new Font("TimesRoman", Font.PLAIN, 20);
        sitable = new JTable(roww,field);
        jsp = new JScrollPane();
        IDTextField = new JTextField(5);
        IDTextField.setFont(font);
        nameTextField = new JTextField(5);
        nameTextField.setFont(font);
        Male=new JCheckBox("MALE");
        Female=new JCheckBox("FEMALE");

        IDlabel=new JLabel("ID");
        IDlabel.setFont(font);
        namelabel=new JLabel("name");
        namelabel.setFont(font);
        genderlabel=new JLabel("gender");
        genderlabel.setFont(font);



        addbutton=new JButton("add");
        addbutton.setFont(font);

    }

    private void display() {
        setSize(600, 600);
        setVisible(true);

    }

    private void setLayout() {
        Container cc = this.getContentPane();
        this.setLocation(600, 300);
        this.setLayout(null);

        cc.add(IDlabel);
        IDlabel.setBounds(70, 40, 90, 20);
        cc.add(namelabel);
        namelabel.setBounds(270, 40, 90, 20);
        cc.add(genderlabel);
        genderlabel.setBounds(470, 40, 90, 20);
        cc.add(IDTextField);
        IDTextField.setBounds(40, 80, 90, 20);
        cc.add(nameTextField);
        nameTextField.setBounds(250, 80, 90, 20);
        cc.add(addbutton);
        addbutton.setBounds(190, 130, 220, 40);

        cc.add(Male);
        Male.setBounds(430, 60, 80, 60);
        cc.add(Female);
        Female.setBounds(510, 60, 80, 60);





        jsp.setBounds(40, 240, 530, 230);
        jsp.setViewportView(sitable);
        sitable.setRowHeight(35);
        DefaultTableCellRenderer ll = new DefaultTableCellRenderer();
        ll.setHorizontalAlignment(JLabel.CENTER);
        sitable.setDefaultRenderer(Object.class, ll);
        cc.add(jsp);

        setVisible(true);


    }
    public void addaddListener(ActionListener AL){
        this.addbutton.addActionListener(AL);
    }
    public String getID(){
        return IDTextField.getText();
    }
    public String getName(){
        return nameTextField.getText();
    }
    public String getGender(){
        if(Female.isSelected())  return "female";
        if(Male.isSelected())  return "male";
        return null;
    }
    public String[][] getRow(){
        return roww;
    }
    public void setRow(String ID,String name,String gender){
        this.roww[totalnum][0]=ID;
        this.roww[totalnum][1]=name;
        this.roww[totalnum][2]=gender;
        totalnum++;
        jsp.setViewportView(sitable);
        add(jsp);
    }

}