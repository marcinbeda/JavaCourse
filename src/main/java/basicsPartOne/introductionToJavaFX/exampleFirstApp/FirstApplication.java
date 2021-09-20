package basicsPartOne.introductionToJavaFX.exampleFirstApp;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FirstApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane layout = new BorderPane();

        Scene scene = new Scene(layout, 400, 200);

        TextField textField = new TextField();
        Label label = new Label("Average: 0.0");

        Button button = new Button("Przycisk");
        button.setOnAction(event -> {
            String textFromTextField = textField.getText();
            String[] splittedText = textFromTextField.split(",");
            double average = 0.0;
            for (String s: splittedText) {
                average += Double.parseDouble(s);
            }
            average /= splittedText.length;
            label.setText("Average: " + average);
        });

        VBox vBox = new VBox();
        vBox.getChildren().addAll(textField, button, label);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);

        layout.setCenter(vBox);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Moja pierwsza aplikacja");
        primaryStage.show();
    }
}
