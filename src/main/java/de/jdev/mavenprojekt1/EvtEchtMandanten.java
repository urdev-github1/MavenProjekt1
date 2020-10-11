package de.jdev.mavenprojekt1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EvtEchtMandanten implements ActionListener {

    //
    @Override
    public void actionPerformed(ActionEvent event) {

        //Text des Source-Objektes.
        String cmd = event.getActionCommand();

        if (cmd == "Mandant1") {
            JOptionPane.showMessageDialog(null, "Hallo 1 von " + cmd);
            //Pfad zusammenbauen
            String mandant = "firma1";
            String ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
            String path2mandant = "\\\\abas-fs1\\erp" + mandant;
            String path2rungui = path2mandant + "\\rungui.exe";
            //Mandantenstart
//          Runtime rs = Runtime.getRuntime();
//          rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + primaryController.getPassw());
        }

        if (cmd == "Mandant2") {
            JOptionPane.showMessageDialog(null, "Hallo 2 von " + cmd);
            //JOptionPane.showMessageDialog(null, "Hallo 2 von " + cmd + " " + primaryController.getPassw());
            //Pfad zusammenbauen
            String mandant = "firma2";
            String ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
            String path2mandant = "\\\\abas-fs1\\erp" + mandant;
            String path2rungui = path2mandant + "\\rungui.exe";
            //Mandantenstart
//          Runtime rs = Runtime.getRuntime();
//          rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + primaryController.getPassw());
        }



//        //Referenz auf das Source-Objekt.
//        if (event.getSource() instanceof MenuItem) {
//            MenuItem eventSrc = (MenuItem) event.getSource();
//            App app = new App();
//            if (eventSrc == app.mandant2) {     //<- app.mandant2 ist immer leer - warum?
//                JOptionPane.showMessageDialog(null, "TEST");
//            }
//        }

    }
}
