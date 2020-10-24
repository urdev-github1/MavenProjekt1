package de.jdev.mavenprojekt1;

import java.util.Optional;
import javafx.geometry.Pos;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import javax.swing.*;

public class SecondaryController {

    //
    public boolean freischalten;

    //Konstruktor wird bei der Instanzerzeugung durchlaufen.
    //https://thecodinginterface.com/blog/javafx-alerts-and-dialogs/
    public SecondaryController() {

        //
        Dialog<String> dialog = new Dialog<>();
        dialog.setTitle("Version: 0.7.1 (Ulrich Rodtko am 26.10.2020)");
        dialog.setHeaderText("Zugriff auf die Demo-Mandanten freischalten.");

//        // Set the icon (must be included in the project).
//        dialog.setGraphic(new ImageView(this.getClass().getResource("/Images/abas-info.png").toString()));

        //Image image = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Emojione_1F62D.svg/64px-Emojione_1F62D.svg.png");
        Image image = new Image("/Images/abas-info32.png");
        ImageView imageView = new ImageView(image);
        dialog.setGraphic(imageView);
        dialog.getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);

        PasswordField pwd = new PasswordField();
        pwd.setPrefWidth(150);

        HBox loginHBox = new HBox();
        loginHBox.setAlignment(Pos.CENTER_LEFT);
        loginHBox.setSpacing(10);
        loginHBox.getChildren().addAll(new Label("Bitte gebe hier das Passwort ein:"), pwd);

        dialog.getDialogPane().setContent(loginHBox);
        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == ButtonType.OK) {
                return pwd.getText();
            }
            return null;
        });

        //Rückgabe eines optionalen <String> nach einem Klick auf den Ok-Button.
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) {

            //Passwort auswerten
            String a = result.get();
            String b = "#demo";

            if (a.equals(b)) {                  //Bei Eingabe des Passwortes 'demo'
                freischalten = true;
//                System.out.println("Ok");
            } else {
                freischalten = false;
                JOptionPane.showMessageDialog(null, "Das hat nicht funktiniert!\n" + "Bitte probiere es nochmal.", "[Hinweis]", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}