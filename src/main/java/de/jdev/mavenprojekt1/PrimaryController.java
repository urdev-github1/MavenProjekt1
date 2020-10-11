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

    //Getter => Abfrage des Passwortes im Hauptprogramm (App).
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
}
