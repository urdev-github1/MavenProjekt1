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
public class PrimaryController implements Initializable, ItemListener {

     //boolean schalter = false;


    //@FXML
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //pass2.setText("Test");
        //pass2.setVisible(true);
    }



    //@FXML - Steht vor privaten Member/Methoden um den Zugriff aus FXML heraus zu erlauben.

    @FXML
    private Button pwgenerator;

    @FXML
    private PasswordField pass1;    //Entspricht der fx:id=pass1

    @FXML
    private TextField pass2;    //Entspricht der fx:id=pass2

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

    //Checkbox-Status 'Login-Wechsel' auswerten.

    @Override
    public void itemStateChanged(ItemEvent event) {


        String zustand = "deselektiert";
        //schalter = true;
        //pass2.setText("Test");

        setData(false);


        if (event.getStateChange() == ItemEvent.SELECTED){
            zustand = "selektiert";


//            pass2.setVisible(true);
//                    generator.setVisible(true);  //Button
//            pass1.setVisible(false);
//        } else {
//            pass2.setVisible(false);
////                    generator.setVisible(false);
//            pass1.setVisible(true);
        }

        System.out.println("CheckboxDemo: " + event.getItem() + " " + zustand);
    }



    @FXML
    public void setData(Boolean data) {
        pass2.setVisible(data);

    }


}
