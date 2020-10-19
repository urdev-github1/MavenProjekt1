package de.jdev.mavenprojekt1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

//Event-Handling
public class PrimaryController implements ItemListener {

    @FXML
    private Button pwgenerator;

    @FXML
    private PasswordField pass1;    //Entspricht der fx:id=pass1

    @FXML
    private TextField pass2;        //Entspricht der fx:id=pass2

    //Getter => Abfrage im EvtEchtmandanten, EvtTestmandanten, EvtDemomandanten
    public String getPassw() {
        return pass2.getText();
    }

    //Setter => TextField ein- und ausblenden.
    public void setVisiblePassField(Boolean passFieldVisible) {
        pass2.setVisible(passFieldVisible);
    }

    //Setter => PasswordField ein- und ausblenden.
    public void setVisibleTextField(Boolean textFieldVisible) {
        pass2.setVisible(textFieldVisible);
    }

//    //Setter => Passwort von außerhalb setzen.
//    public void setPass(String passwort) {
//        pass2.setText(passwort);
//    }

    //Checkbox-Status 'Login-Wechsel' auswerten.
    App app = new App();

    @Override
    public void itemStateChanged(ItemEvent event) {

        if (event.getStateChange() == ItemEvent.SELECTED){
            //Aufruf der Setter Methode für das Textfeld.
            app.primaryController.setVisibleTextField(false);
            //Aufruf der Setter Methode für das Passwortfeld.
            app.primaryController.setVisiblePassField(true);
        } else {
            app.primaryController.setVisibleTextField(true);
            app.primaryController.setVisiblePassField(false);
        }
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
