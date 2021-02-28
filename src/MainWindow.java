import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.media.*;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;

import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import javafx.stage.Window;
import javafx.stage.WindowEvent;
import javafx.util.Duration;

import java.io.File;

public class MainWindow {

    //CoverWindow cover1 = new CoverWindow();



    int c=1;
    Group root = new Group();
    int score =0;


    public  void start(Stage mainStage) {

        Group taskLayout = new Group();

        Scene taskScene1 = new Scene(taskLayout,1000,500);




        Label Score = new Label("Score: "+score );
        Score.setTextFill(Color.web("#FFFFFF"));
        Score.setFont(Font.font("Times New Roman Italic",FontWeight.BOLD,40));
        Score.setLayoutX(750.0);
        Score.setLayoutY(30.0);
        TranslateTransition sco = new TranslateTransition(new Duration(21000),Score);
        sco.setCycleCount(1);
        sco.setByX(1400);
        sco.setByZ(20);
        //sco.play();

        Label over = new Label();
        over.setTextFill(Color.web("#1E90FF"));
        over.setFont(Font.font("Times New Roman Italic",FontWeight.BOLD,40));
        over.setLayoutX(800.0);
        over.setLayoutY(200.0);







       // root.getChildren().addAll(Score,over);

        Rectangle[] arr = new Rectangle[30];
        Rectangle[] arrB = new Rectangle[30];
        Label [] label = new Label[30];
        Path[]  stara = new Path[4];


            int x = 100;
            int x1 = 140;
            double x2 = 120.0;
            for (int i = 1; i <= 29; i++) {
                Rectangle r = new Rectangle(x, 130, 60, 220);
                r.setFill(Color.WHITE);
                r.setStroke(Color.DEEPSKYBLUE);
                arr[i] = r;

                Label l = new Label();
                l.setFont(Font.font("Times New Roman Italic", FontWeight.BOLD, 20));
                l.setLayoutX(x2);
                l.setLayoutY(310.0);
                label[i] = l;

                Rectangle rb = new Rectangle(x1, 130, 50, 120);
                rb.setFill(Color.BLACK);
                arrB[i] = rb;
                root.getChildren().addAll(r, l, rb);
                x = x + 60;
                x1 = x1 + 60;
                x2 = x2 + 60.0;

            }

            Label one = new Label("Starting");
        one.setFont(Font.font("Verdana",FontWeight.SEMI_BOLD,20));
        one.setTextFill(Color.web("#00CED1"));
        one.setLayoutX(500.0);
        one.setLayoutY(50.0);
       /* Label two = new Label("2");
        two.setFont(Font.font("verdana",FontWeight.SEMI_BOLD,40));
        two.setTextFill(Color.web("#00CED1"));
        two.setLayoutX(500.0);
        two.setLayoutY(50.0);
        Label three = new Label("3");
        three.setFont(Font.font("verdana",FontWeight.SEMI_BOLD,40));
        three.setTextFill(Color.web("#00CED1"));
        three.setLayoutX(500.0);
        three.setLayoutY(50.0);*/
        root.getChildren().addAll(one,Score,over);


            double x3 = 702.0;
            for(int i=1;i<=3;i++){
                Path star = new Path();
                star.getElements().addAll(new MoveTo(20, 0),
                        new LineTo(0, 20),
                        new LineTo(40, 20),
                        new ClosePath(),
                        new MoveTo(0, 7),
                        new LineTo(40, 7),
                        new LineTo(20, 30),
                        new ClosePath());
                star.setFill(Color.web("#FFD700"));

                star.setLayoutX(x3);
                star.setLayoutY(250.0);
                stara[i]=star;
                root.getChildren().add(stara[i]);

                if(i==2) {

                    x3 = x3 + 480.0;
                }else{
                    x3 = x3 + 600.0;
                }
            }



        label[1].setText("A");
        label[2].setText("B");
        label[3].setText("C");
        label[4].setText("D");
        label[5].setText("E");
        label[6].setText("F");
        label[7].setText("G");
        label[8].setText("H");
        label[9].setText("I");
        label[10].setText("J");
        label[11].setText("1");
        label[12].setText("K");
        label[13].setText("L");
        label[14].setText("M");
        label[15].setText("N");
        label[16].setText("O");
        label[17].setText("P");
        label[18].setText("Q");
        label[19].setText("R");
        label[20].setText("S");
        label[21].setText("2");
        label[22].setText("T");
        label[23].setText("U");
        label[24].setText("V");
        label[25].setText("W");
        label[26].setText("X");
        label[27].setText("Y");
        label[28].setText("Z");
        label[29].setText("3");



        ScaleTransition myscale1 = new ScaleTransition(new Duration(500),one);
        myscale1.setCycleCount(2);
        myscale1.setAutoReverse(true);
        myscale1.setByX(1.2);
        myscale1.setByY(1.2);
        /*ScaleTransition myscale2 = new ScaleTransition(new Duration(1000),two);
        myscale2.setCycleCount(2);
        myscale2.setAutoReverse(true);
        myscale2.setByX(1.2);
        myscale2.setByY(1.2);
        ScaleTransition myscale3 = new ScaleTransition(new Duration(1000),three);
        myscale3.setCycleCount(2);
        myscale3.setAutoReverse(true);
        myscale3.setByX(1.2);
        myscale3.setByY(1.2);*/


        TranslateTransition myrotate = new TranslateTransition(new Duration(20000),root);
        myrotate.setCycleCount(1);
        //myrotate.setAutoReverse(true);
         myrotate.setByX(-1800);

        myrotate.setByZ(20);
        //myrotate.play();

       // SequentialTransition mySTrans = new SequentialTransition(myscale1,m);
        ParallelTransition myPTrans = new ParallelTransition(myrotate,sco);
        SequentialTransition mySTrans = new SequentialTransition(myscale1,myPTrans);
        mySTrans.play();



        Scene mainScene = new Scene(root, 1000, 500, Color.BLACK);

        mainStage.setScene(mainScene);



        //For task1 scene

        Button okbtn = new Button();

        okbtn.setText("OK");
        okbtn.setLayoutY(400.0);
        okbtn.setLayoutX(900.0);
        //okbtn.setVisible(false);
        Image taskCover = new Image("file:taskCover.jpg",1000,500,false,false);

        ImageView iv1 = new ImageView();
        iv1.setImage(taskCover);
        okbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mainStage.setScene(mainScene);
                one.setVisible(true);
                mySTrans.play();
                //one.setVisible(false);
                //sco.play();



            }
        });

        taskLayout.getChildren().addAll(iv1,okbtn);
        //Button[] circle = new Button[28];

        Button btn = new Button("A");
        btn.setLayoutX(300.0);
        btn.setLayoutY(505.0);
        btn.setStyle(
                "-fx-background-radius: 45em; " +
                        "-fx-min-width: 43px; " +
                        "-fx-min-height: 43px; " +
                        "-fx-max-width: 43px; " +
                        "-fx-max-height: 43px;"
        );

        Button btn1 = new Button("B");
        btn1.setLayoutX(550.0);
        btn1.setLayoutY(520.0);
        btn1.setStyle(
                "-fx-background-radius: 45em; " +
                        "-fx-min-width: 43px; " +
                        "-fx-min-height: 43px; " +
                        "-fx-max-width: 43px; " +
                        "-fx-max-height: 43px;"
        );
        Button btn2 = new Button("C");
        btn2.setLayoutX(800.0);
        btn2.setLayoutY(512.0);
        btn2.setStyle(
                "-fx-background-radius: 45em; " +
                        "-fx-min-width: 43px; " +
                        "-fx-min-height: 43px; " +
                        "-fx-max-width: 43px; " +
                        "-fx-max-height: 43px;"
        );
        Button btn3 = new Button("D");
        btn3.setLayoutX(300.0);
        btn3.setLayoutY(530.0);
        btn3.setStyle(
                "-fx-background-radius: 45em; " +
                        "-fx-min-width: 43px; " +
                        "-fx-min-height: 43px; " +
                        "-fx-max-width: 43px; " +
                        "-fx-max-height: 43px;"
        );
        Button btn4 = new Button("E");
        btn4.setLayoutX(550.0);
        btn4.setLayoutY(540.0);
        btn4.setStyle(
                "-fx-background-radius: 45em; " +
                        "-fx-min-width: 43px; " +
                        "-fx-min-height: 43px; " +
                        "-fx-max-width: 43px; " +
                        "-fx-max-height: 43px;"
        );
        Button btn5 = new Button("F");
        btn5.setLayoutX(800.0);
        btn5.setLayoutY(545.0);
        btn5.setStyle(
                "-fx-background-radius: 45em; " +
                        "-fx-min-width: 43px; " +
                        "-fx-min-height: 43px; " +
                        "-fx-max-width: 43px; " +
                        "-fx-max-height: 43px;"
        );
        Button btn6 = new Button("G");
        btn6.setLayoutX(300.0);
        btn6.setLayoutY(550.0);
        btn6.setStyle(
                "-fx-background-radius: 45em; " +
                        "-fx-min-width: 43px; " +
                        "-fx-min-height: 43px; " +
                        "-fx-max-width: 43px; " +
                        "-fx-max-height: 43px;"
        );
        Button btn7 = new Button("H");
        btn7.setLayoutX(550.0);
        btn7.setLayoutY(570.0);
        btn7.setStyle(
                "-fx-background-radius: 45em; " +
                        "-fx-min-width: 43px; " +
                        "-fx-min-height: 43px; " +
                        "-fx-max-width: 43px; " +
                        "-fx-max-height: 43px;"
        );
        Button btn8 = new Button("I");
        btn8.setLayoutX(800.0);
        btn8.setLayoutY(560.0);
        btn8.setStyle(
                "-fx-background-radius: 45em; " +
                        "-fx-min-width: 43px; " +
                        "-fx-min-height: 43px; " +
                        "-fx-max-width: 43px; " +
                        "-fx-max-height: 43px;"
        );
        Button btn9 = new Button("J");
        btn9.setLayoutX(300.0);
        btn9.setLayoutY(565.0);
        btn9.setStyle(
                "-fx-background-radius: 45em; " +
                        "-fx-min-width: 43px; " +
                        "-fx-min-height: 43px; " +
                        "-fx-max-width: 43px; " +
                        "-fx-max-height: 43px;");

        TranslateTransition tbtn = new TranslateTransition(new Duration(4000),btn);
        tbtn.setCycleCount(1);
        tbtn.setByY(-1000.0);
        TranslateTransition tbtn1 = new TranslateTransition(new Duration(5000),btn1);
        tbtn1.setCycleCount(1);
        tbtn1.setByY(-1000.0);
        TranslateTransition tbtn2 = new TranslateTransition(new Duration(6000),btn2);
        tbtn2.setCycleCount(1);
        tbtn2.setByY(-1000.0);
        TranslateTransition tbtn3 = new TranslateTransition(new Duration(7000),btn3);
        tbtn3.setCycleCount(1);
        tbtn3.setByY(-1000.0);
        TranslateTransition tbtn4 = new TranslateTransition(new Duration(8000),btn4);
        tbtn4.setCycleCount(1);
        tbtn4.setByY(-1000.0);
        TranslateTransition tbtn5 = new TranslateTransition(new Duration(8000),btn5);
        tbtn5.setCycleCount(1);
        tbtn5.setByY(-1000.0);
        TranslateTransition tbtn6 = new TranslateTransition(new Duration(10000),btn6);
        tbtn6.setCycleCount(1);
        tbtn6.setByY(-1000.0);
        TranslateTransition tbtn7 = new TranslateTransition(new Duration(10000),btn7);
        tbtn7.setCycleCount(1);
        tbtn7.setByY(-1000.0);
        TranslateTransition tbtn8 = new TranslateTransition(new Duration(11000),btn8);
        tbtn8.setCycleCount(1);
        tbtn8.setByY(-1000.0);
        TranslateTransition tbtn9 = new TranslateTransition(new Duration(11000),btn9);
        tbtn9.setCycleCount(1);
        tbtn9.setByY(-1000.0);
        //TranslateTransition tokbtn= new TranslateTransition(new Duration(11000),okbtn);

        taskLayout.getChildren().addAll(btn,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9);
        ParallelTransition pTSbtn = new ParallelTransition(tbtn,tbtn1,tbtn2,tbtn3,tbtn4,tbtn5,tbtn6,tbtn7,tbtn8,tbtn9);

        //After task1 scene part


        mainScene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if(event.getCode()==KeyCode.A && c==1){
                    arr[1].setFill(Color.GREEN);
                    c++;
                    score++;
                    Score.setText("Score: "+score);



                }
                else if(event.getCode()==KeyCode.B&&c==2){
                    arr[2].setFill(Color.GREEN);
                    c++;
                    score++;
                    Score.setText("Score: "+score);


                }else if(event.getCode()==KeyCode.C && c==3){
                    c++;
                    arr[3].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);

                }else if(event.getCode()==KeyCode.D&&c==4){
                    c++;
                    arr[4].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);

                }else if(event.getCode()==KeyCode.E&&c==5){
                    c++;
                    arr[5].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);

                }else if(event.getCode()==KeyCode.F && c==6){
                    c++;
                    arr[6].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);

                }else if(event.getCode()==KeyCode.G &&c==7){
                    c++;
                    arr[7].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);

                }else if(event.getCode()==KeyCode.H && c==8){
                    c++;
                    arr[8].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);

                }else if(event.getCode()==KeyCode.I && c==9){
                    c++;
                    arr[9].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);

                }else if(event.getCode()==KeyCode.J && c==10){
                    c++;
                    arr[10].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);

                }else if(event.getCode()==KeyCode.DIGIT1 && c==11){
                    c++;
                    arr[11].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);

                    mySTrans.pause();
                    //sco.pause();
                    mainStage.setScene(taskScene1);

                    pTSbtn.play();


                }else if(event.getCode()==KeyCode.K && c==12){
                    c++;
                    arr[12].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);

                }else if(event.getCode()==KeyCode.L && c==13){
                    c++;
                    arr[13].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);

                }else if(event.getCode()==KeyCode.M && c==14){
                    c++;
                    arr[14].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);

                }else if(event.getCode()==KeyCode.N && c==15){
                    c++;
                    arr[15].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);

                }else if(event.getCode()==KeyCode.O && c==16){
                    c++;
                    arr[16].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);

                }else if(event.getCode()==KeyCode.P && c==17){
                    c++;
                    arr[17].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);

                }else if(event.getCode()==KeyCode.Q && c==18){
                    c++;
                    arr[18].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);

                }else if(event.getCode()==KeyCode.R && c==19){
                    c++;
                    arr[19].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);

                }else if(event.getCode()==KeyCode.S && c==20){
                    c++;
                    arr[20].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);

                }else if(event.getCode()==KeyCode.DIGIT2 && c==21){
                    c++;
                    arr[21].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);
                    mySTrans.pause();
                    //sco.pause();
                    mainStage.setScene(taskScene1);

                    pTSbtn.play();

                }else if(event.getCode()==KeyCode.T && c==22){
                    c++;
                    arr[22].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);

                }else if(event.getCode()==KeyCode.U && c==23) {
                    c++;
                    arr[23].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);


                }else if(event.getCode()==KeyCode.V && c==24){
                    c++;
                    arr[24].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);

                }else if(event.getCode()==KeyCode.W && c==25){
                    c++;
                    arr[25].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);

                }else if(event.getCode()==KeyCode.X && c==26){
                    c++;
                    arr[26].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);

                }else if(event.getCode()==KeyCode.Y && c==27){
                    c++;
                    arr[27].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);

                }else if(event.getCode()==KeyCode.Z && c==28){
                    c++;
                    arr[28].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);

                }else if(event.getCode()==KeyCode.DIGIT3 && c==29){
                    c++;
                    arr[29].setFill(Color.GREEN);
                    score++;
                    Score.setText("Score: "+score);
                    mySTrans.pause();
                    sco.pause();
                    //mainStage.setScene(taskScene1);

                   // pTSbtn.play();
                }else{


                    for(int i=1;i<=29;i++){
                        if(i==c && event.getCode()!=KeyCode.SPACE){
                            arr[i].setFill(Color.RED);
                            over.setText("Game Over!");
                            mySTrans.pause();
                            //sco.pause();

                            break;
                        }
                    }

                }

            }
        });



        mainStage.show();


    }
}
