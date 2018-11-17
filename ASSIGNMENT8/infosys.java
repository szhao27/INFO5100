package ASSIGNMENT8;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;




public class infosys{
        public static void main(String[] args){
            studentvv vv=new studentvv();
            studentt mm=new studentt();
            studentController con=new studentController(mm,vv);
            vv.setVisible(true);
        }
}