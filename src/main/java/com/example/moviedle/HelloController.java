package com.example.moviedle;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.io.FileNotFoundException;
import java.io.IOException;
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
    protected void onGuessButtonClick() throws IOException {click++;
        if(click==1){
        entered=dosyaceker.finder(txt.getText());
        h1.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            kontrolcü(l1, 0);
            kontrolcü(l2, 1);
            kontrolcü(l3, 2);
            kontrolcü(l4, 3);
            kontrolcü(l5, 4);
            kontrolcü(l6, 5);
        }else if(click==2){
            hboxborderchange(h1,h2);
            entered=dosyaceker.finder(txt.getText());
            kontrolcü(l21, 0);
            kontrolcü(l22, 1);
            kontrolcü(l23, 2);
            kontrolcü(l24, 3);
            kontrolcü(l25, 4);
            kontrolcü(l26, 5);
        }else if(click==3){
            hboxborderchange(h2,h3);
            entered=dosyaceker.finder(txt.getText());
            kontrolcü(l31, 0);
            kontrolcü(l32, 1);
            kontrolcü(l33, 2);
            kontrolcü(l34, 3);
            kontrolcü(l35, 4);
            kontrolcü(l36, 5);
        }else if(click==4){
            hboxborderchange(h3,h4);
            entered=dosyaceker.finder(txt.getText());
            kontrolcü(l41, 0);
            kontrolcü(l42, 1);
            kontrolcü(l43, 2);
            kontrolcü(l44, 3);
            kontrolcü(l45, 4);
            kontrolcü(l46, 5);
        }else if(click==5){
            hboxborderchange(h4,h5);
            entered=dosyaceker.finder(txt.getText());
            kontrolcü(l51, 0);
            kontrolcü(l52, 1);
            kontrolcü(l53, 2);
            kontrolcü(l54, 3);
            kontrolcü(l55, 4);
            kontrolcü(l56, 5);
        }
        if((click==5)&&entered!=chosen)                         // Losing Situation
        {
            Alert alert = new Alert(Alert.AlertType.NONE);
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("YOU LOOOOOOST");
            alert.setTitle("You Lose");
            alert.setContentText("You Lost This Game"+"\n Movie Name is = >"+dosyaceker.getEleman().get(chosen));
            alert.show();
        }else if((click<=5)&&(entered==chosen))                  //Winning Situation
        {
            Alert alert = new Alert(Alert.AlertType.NONE);
            alert.setAlertType(Alert.AlertType.CONFIRMATION);
            alert.setTitle("You Won");
            alert.setContentText("You found it!!! Congratulations !!"+"\nIf you Wanna Learn something about this Movie \nThere is the Link ==>"+dosyaceker.getEleman().get(chosen+6));
            alert.setHeaderText("YOU WOOOOOON");
            alert.show();
        }
    }
    public void setgreenn(Label lbl){           // to set labels green
        lbl.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
    }
    public void setredd(Label lbl){             // to set labels red
        lbl.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
    }
    public void kontrolcü(Label label,int  bit){
        label.setText(dosyaceker.getEleman().get(entered+bit));
        if(label.getText().equals(dosyaceker.getEleman().get(chosen+bit)))
            setgreenn(label);
        else
            setredd(label);}
    public void hboxborderchange(HBox eski,HBox yeni){
        eski.setBorder(new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.EMPTY)));
        yeni.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));  }
}