package de.jdev.mavenprojekt1;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import java.util.Random;

//Event-Handling
public class PrimaryController {

    //@FXML - Steht vor private Member oder Methoden und erlaubt den Zugriff aus FXML heraus.

    @FXML
    private TextField pass2;    //pass2 entspricht der ID in primary.fxml

    @FXML
    private Button pwgenerator;

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
