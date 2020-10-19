package de.jdev.mavenprojekt1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

//Event-Handling
public class PrimaryController implements ItemListener {

    String passwort;

    @FXML
    private PasswordField passField1;    //Entspricht der fx:id=passField1

    @FXML
    private TextField passField2;        //Entspricht der fx:id=passField2

    @FXML
    private Label lblLabel;

    @FXML
    private Button btnButton;

    //Getter => Abfrage im EvtEchtmandanten, EvtTestmandanten, EvtDemomandanten
    public String getPassw() {

        //
        if (passField1.isVisible()) {
            passwort = passField1.getText();
        }

        //
        if (passField2.isVisible()) {
            passwort = passField2.getText();
        }

        //
        return passwort;
    }

    //Setter => TextField ein- und ausblenden.
    public void setVisiblePassField(Boolean passFieldVisible) {
        passField2.setVisible(passFieldVisible);
    }

    //Setter => PasswordField ein- und ausblenden.
    public void setVisibleTextField(Boolean textFieldVisible) {
        passField2.setVisible(textFieldVisible);
    }

    //Setter => Label ein- und ausblenden.
    public void setVisibleLabel(Boolean labelVisible) {
        lblLabel.setVisible(labelVisible);
    }

    //Setter => Button ein- und ausblenden.
    public void setVisibleButton(Boolean buttonVisible) {
        btnButton.setVisible(buttonVisible);
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

            //AUSBLENDEN
            //Aufruf der Setter Methode: Passwortfeld ausblenden.
            app.primaryController.setVisiblePassField(false);
            //Aufruf der Setter Methode: Label ausblenden.
            app.primaryController.setVisibleLabel(false);

            //EINBLENDEN
            //Aufruf der Setter Methode: Textfeld einblenden.
            app.primaryController.setVisibleTextField(true);
            //Aufruf der Setter Methode: Button einblenden.
            app.primaryController.setVisibleButton(true);

        } else {
            app.primaryController.setVisiblePassField(true);
            app.primaryController.setVisibleLabel(true);
            app.primaryController.setVisibleTextField(false);
            app.primaryController.setVisibleButton(false);
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

        //Generiertes Passwort in das Textfeld schreiben.
        passField2.setText(String.valueOf(password));
    }
}
