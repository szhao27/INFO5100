package ASSIGNMENT8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class studentController {
    private studentt mm;
    private studentvv vv;

    studentController(studentt mm, studentvv vv) {
        this.mm = mm;
        this.vv = vv;
        this.vv.addaddListener(new addListener());
    }


    class addListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String IDt = vv.getID();
            String namet = vv.getName();
            String gendert = vv.getGender();
            vv.setRow(IDt, namet, gendert);
            mm.setID(IDt);
            mm.setName(namet);
            mm.setGender(gendert);
        }
    }
}

