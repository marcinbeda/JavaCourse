package basicsPartOne.introductionToJavaFX.exampleAppWithSceneBuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ApplicationMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationMain.class.getResource("/basicsPartOne/introductionToJavaFX/exampleAppWithSceneBuilder/Template.fxml"));
        Parent layout = fxmlLoader.load();

        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}