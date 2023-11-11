package com.example.demo5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        java.net.URL resource = getClass().getResource("/Views/Main.fxml");
        System.out.println("Resource => " + resource);
        FXMLLoader fxmlLoader = new FXMLLoader(resource);
        Scene scene = new Scene(fxmlLoader.load(), 420, 340);
        stage.setTitle("MENÚ PRINCIPAL");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}