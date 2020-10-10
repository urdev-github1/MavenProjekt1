package de.jdev.mavenprojekt1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    public static Scene scene;

    //Die Startmethode legt ein root-Element fest, eine Szene und ordnet die Szene der Stage zu.
    @Override
    public void start(Stage primaryStage) throws IOException {

        //Die FXML-Datei wird aus den Ressourcen geladen.
        Parent root = FXMLLoader.load(getClass().getResource("primary.fxml"));

        //Die Scene festgelegt.
        scene = new Scene(root);

        //Die Scene (Szene) wird der Stage (Bühne) zugeordnet.
        primaryStage.setScene(scene);
        primaryStage.setTitle("????-Login");
        primaryStage.setResizable(false);

        //Die Stage anzeigen.
        primaryStage.show();
    }

    //
    public static void main(String[] args) {
        launch();
    }
}