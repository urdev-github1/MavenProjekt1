package de.jdev.mavenprojekt1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Random;

//Event-Handling
public class PrimaryController {

    //@FXML - Steht vor privaten Member/Methoden um den Zugriff aus FXML heraus zu erlauben.

    @FXML
    private Button pwgenerator;

    @FXML
    private TextField pass2;    //pass2 entspricht der ID in primary.fxml

    //Getter => Abfrage in der Einstiegsklasse.
    public String getPassw() {
        return pass2.getText();
    }

    //Passwortgenerator
    @FXML
    private void handleButtonAction(ActionEvent event) {

        //Passwort erzeugen
        int length = 8;

        String zeichen = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();

        //Array für 8-Zeichen langes Passwort
        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            password[i] = zeichen.charAt(random.nextInt(zeichen.length()));
        }

        //Passwort in das Textfeld schreiben
        pass2.setText(String.valueOf(password));
    }


//     ---------------------------------------------------------------------------------------------------------------------------------


//    //
//    //@Override
//    public void actionPerformed(java.awt.event.ActionEvent event) {
//
//        //Text des Source-Objektes.
//        String cmd = event.getActionCommand();
//
//        if (cmd == "Mandant1") {
//            JOptionPane.showMessageDialog(null, "Hallo 1 von " + cmd);
//        }
//
//        if (cmd == "Mandant2") {
//            JOptionPane.showMessageDialog(null, "Hallo 2 von " + cmd);
//            //JOptionPane.showMessageDialog(null, "Hallo 2 von " + cmd + " " + primaryController.getPassw());
//            //Pfad zusammenbauen
//            String mandant = "firma2";
//            String ddeserver = "abas-EKS_abas-ERP" + " " + mandant;
//            String path2mandant = "\\\\abas-fs1\\erp" + mandant;
//            String path2rungui = path2mandant + "\\rungui.exe";
//            //Mandantenstart
////          Runtime rs = Runtime.getRuntime();
////          rs.exec(path2rungui + " * " + ddeserver + " " + path2mandant + " " + primaryController.getPassw());
//        }
//
//
//
////        //Referenz auf das Source-Objekt.
////        if (event.getSource() instanceof MenuItem) {
////            MenuItem eventSrc = (MenuItem) event.getSource();
////            App app = new App();
////            if (eventSrc == app.mandant2) {     //<- app.mandant2 ist immer leer - warum?
////                JOptionPane.showMessageDialog(null, "TEST");
////            }
////        }
//
//    }



}
