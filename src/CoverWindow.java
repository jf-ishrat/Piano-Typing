import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class CoverWindow extends Application {
    MainWindow mainWindow = new MainWindow();

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage window)  {



       AnchorPane layout = new AnchorPane();

        Label name = new Label("Piano Typing");
        name.setFont(Font.font("Times New Roman Italic",FontWeight.BOLD,30));
        name.setTextFill(Color.web("#0076a3"));
        AnchorPane.setTopAnchor(name,15.0);
        AnchorPane.setLeftAnchor(name,15.0);

        Label score = new Label("Score");
        score.setFont(Font.font("Times New Roman Italic",FontWeight.BOLD,70));
        score.setTextFill(Color.web("#FFFFFF"));
        AnchorPane.setTopAnchor(score,80.0);
        AnchorPane.setLeftAnchor(score,800.0);



        Button newgame = new Button("New Game");
        newgame.setFont(Font.font("Times New Roman Italic",FontWeight.BOLD,25));
        newgame.setPrefSize(180,50);
        AnchorPane.setTopAnchor(newgame,300.0);
        AnchorPane.setLeftAnchor(newgame,780.0);

        newgame.setTextFill(Color.web("#0076a3"));

        newgame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                window.close();
                mainWindow.start(window);

            }
        });
        newgame.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if(event.getCode()== KeyCode.SPACE){
                    //window.close();

                    mainWindow.start(window);

                }
            }
        });

        Scene myscene = new Scene(layout,1000,500);

        window.setScene(myscene);

        Image cover = new Image("file:cover3.jpg",1000,500,false,false);

        ImageView iv = new ImageView();
        iv.setImage(cover);

        layout.getChildren().addAll(iv,newgame,name,score);



        window.show();


    }
}
