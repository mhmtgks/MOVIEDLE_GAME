package com.example.moviedle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Optional;

public class HelloController {
    @FXML
    private Label l1,l2,l3,l4,l5,l6,l21,l22,l23,l24,l25,l26,l31,l32,l33,l34,l35,l36,l41,l42,l43,l44,l45,l46,l51,l52,l53,l54,l55,l56;
    @FXML
    private TextField txt;
    @FXML
    private HBox h1,h2,h3,h4,h5;
    int click =0,chosen=0,entered=0;
    dosyaceker dosyaceker;
    public HelloController() throws IOException {
        dosyaceker = new dosyaceker();
        chosen=dosyaceker.chooser();}
    @FXML
    protected void onGuessButtonClick() throws Exception {click++;
        if(click==1){
        entered=dosyaceker.finder(txt.getText());
        h1.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            kontrolcü(l1,l2,l3,l4,l5,l6);
        }else if(click==2){
            hboxborderchange(h1,h2);
            entered=dosyaceker.finder(txt.getText());
            kontrolcü(l21,l22,l23,l24,l25,l26);
        }else if(click==3){
            hboxborderchange(h2,h3);
            entered=dosyaceker.finder(txt.getText());
            kontrolcü(l31,l32,l33,l34,l35,l36);
        }else if(click==4){
            hboxborderchange(h3,h4);
            entered=dosyaceker.finder(txt.getText());
            kontrolcü(l41,l42,l43,l44,l45,l46);
        }else if(click==5){
            hboxborderchange(h4,h5);
            entered=dosyaceker.finder(txt.getText());
            kontrolcü(l51,l52,l53,l54,l55,l56);
        }
        if((click==5)&&entered!=chosen)                         // Losing Situation
        {
            Alert alert = new Alert(Alert.AlertType.NONE);
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("YOU LOOOOOOST");
            alert.setTitle("You Lose");
            alert.setContentText("You Lost This Game"+"\n Movie Name is = >"+dosyaceker.getEleman().get(chosen));
            ButtonType buton_yeniden = new ButtonType("Yeniden Başla");
            ButtonType buton_kapat = new ButtonType("Kapat");
            alert.getButtonTypes().setAll(buton_yeniden,buton_kapat);
            Optional<ButtonType> result = alert.showAndWait();

            if (result.orElse(buton_kapat) == buton_yeniden) {

                Stage stage = (Stage) l5.getScene().getWindow();
                stage.close();
                Platform.runLater( () -> {
                    try {
                        // Platform.exit();
                        new HelloApplication().start( new Stage() );
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
                alert.close();
            }else{
                Stage stage = (Stage) l5.getScene().getWindow();
                stage.close();
                alert.close();
            }
        }else if((click<=5)&&(entered==chosen))                  //Winning Situation
        {
            Alert alert = new Alert(Alert.AlertType.NONE);
            alert.setAlertType(Alert.AlertType.CONFIRMATION);
            alert.setTitle("You Won");
            alert.setContentText("You found it!!! Congratulations !!"+"\nIf you Wanna Learn something about this Movie \nThere is the Link ==>"+dosyaceker.getEleman().get(chosen+6));
            alert.setHeaderText("YOU WOOOOOON");
            ButtonType buton_yeniden = new ButtonType("Yeniden Başla");
            ButtonType buton_kapat = new ButtonType("Kapat");
            alert.getButtonTypes().setAll(buton_yeniden,buton_kapat);
            Optional<ButtonType> result = alert.showAndWait();

            if (result.orElse(buton_kapat) == buton_yeniden) {

                Stage stage = (Stage) l5.getScene().getWindow();
                stage.close();
                Platform.runLater( () -> {
                    try {
                        // Platform.exit();
                        new HelloApplication().start( new Stage() );
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
                alert.close();
            }else{
                Stage stage = (Stage) l5.getScene().getWindow();
                stage.close();
                alert.close();
            }
        }
    }
    public void setgreenn(Label lbl){           // to set labels green
        lbl.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
    }
    public void setredd(Label lbl){             // to set labels red
        lbl.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
    }
    public void kontrolcü(Label label1,Label label2,Label label3,Label label4,Label label5,Label label6){
        Label ll[]= {label1,label2,label3,label4,label5,label6};
        for(int i=0;i<6;i++){
        ll[i].setText(dosyaceker.getEleman().get(entered+i));
        if(ll[i].getText().equals(dosyaceker.getEleman().get(chosen+i)))
            setgreenn(ll[i]);
        else
            setredd(ll[i]);}}
    public void hboxborderchange(HBox eski,HBox yeni){
        eski.setBorder(new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.EMPTY)));
        yeni.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));  }
}