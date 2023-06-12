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
    private Label l1;
    @FXML
    private Label l2;
    @FXML
    private Label l3;
    @FXML
    private Label l4;
    @FXML
    private Label l5;
    @FXML
    private Label l6;

    @FXML
    private Label l21;
    @FXML
    private Label l22;
    @FXML
    private Label l23;
    @FXML
    private Label l24;
    @FXML
    private Label l25;
    @FXML
    private Label l26;

    @FXML
    private Label l31;
    @FXML
    private Label l32;
    @FXML
    private Label l33;
    @FXML
    private Label l34;
    @FXML
    private Label l35;
    @FXML
    private Label l36;

    @FXML
    private Label l41;
    @FXML
    private Label l42;
    @FXML
    private Label l43;
    @FXML
    private Label l44;
    @FXML
    private Label l45;
    @FXML
    private Label l46;

    @FXML
    private Label l51;
    @FXML
    private Label l52;
    @FXML
    private Label l53;
    @FXML
    private Label l54;
    @FXML
    private Label l55;
    @FXML
    private Label l56;
    @FXML
    private TextField txt;
    @FXML
    private HBox h1;
    @FXML
    private HBox h2;
    @FXML
    private HBox h3;
    @FXML
    private HBox h4;
    @FXML
    private HBox h5;

    int click =0;
    int chosen=0;
    int entered=0;

    dosyaceker dosyaceker;
    public HelloController() throws IOException {
        dosyaceker = new dosyaceker();
        chosen=dosyaceker.chooser();
    }

    @FXML
    protected void onGuessButtonClick() throws IOException {
        click++;
        if(click==1){
        entered=dosyaceker.finder(txt.getText());
        h1.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        l1.setText(dosyaceker.getEleman().get(entered));
        if(l1.getText().equals(dosyaceker.getEleman().get(chosen)))
            setgreenn(l1);
        else
            setredd(l1);
        l2.setText(dosyaceker.getEleman().get(entered+1));
            if(l2.getText().equals(dosyaceker.getEleman().get(chosen+1)))
                setgreenn(l2);
            else
                setredd(l2);
        l3.setText(dosyaceker.getEleman().get(entered+2));
            if(l3.getText().equals(dosyaceker.getEleman().get(chosen+2)))
                setgreenn(l3);
            else
                setredd(l3);
        l4.setText(dosyaceker.getEleman().get(entered+3));
            if(l4.getText().equals(dosyaceker.getEleman().get(chosen+3)))
                setgreenn(l4);
            else
                setredd(l4);
        l5.setText(dosyaceker.getEleman().get(entered+4));
            if(l5.getText().equals(dosyaceker.getEleman().get(chosen+4)))
                setgreenn(l5);
            else
                setredd(l5);
        l6.setText(dosyaceker.getEleman().get(entered+5));
            if(l6.getText().equals(dosyaceker.getEleman().get(chosen+5)))
                setgreenn(l6);
            else
                setredd(l6);
        }else if(click==2){
            h1.setBorder(new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.EMPTY)));
            h2.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            entered=dosyaceker.finder(txt.getText());

            l21.setText(dosyaceker.getEleman().get(entered));
            if(l21.getText().equals(dosyaceker.getEleman().get(chosen)))
                setgreenn(l21);
            else
                setredd(l21);
            l22.setText(dosyaceker.getEleman().get(entered+1));
            if(l22.getText().equals(dosyaceker.getEleman().get(chosen+1)))
                setgreenn(l22);
            else
                setredd(l22);
            l23.setText(dosyaceker.getEleman().get(entered+2));
            if(l23.getText().equals(dosyaceker.getEleman().get(chosen+2)))
                setgreenn(l23);
            else
                setredd(l23);
            l24.setText(dosyaceker.getEleman().get(entered+3));
            if(l24.getText().equals(dosyaceker.getEleman().get(chosen+3)))
                setgreenn(l24);
            else
                setredd(l24);
            l25.setText(dosyaceker.getEleman().get(entered+4));
            if(l25.getText().equals(dosyaceker.getEleman().get(chosen+4)))
                setgreenn(l25);
            else
                setredd(l25);
            l26.setText(dosyaceker.getEleman().get(entered+5));
            if(l26.getText().equals(dosyaceker.getEleman().get(chosen+5)))
                setgreenn(l26);
            else
                setredd(l26);
        }else if(click==3){
            h2.setBorder(new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.EMPTY)));
            h3.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            entered=dosyaceker.finder(txt.getText());

            l31.setText(dosyaceker.getEleman().get(entered));
            if(l31.getText().equals(dosyaceker.getEleman().get(chosen)))
                setgreenn(l31);
            else
                setredd(l31);
            l32.setText(dosyaceker.getEleman().get(entered+1));
            if(l32.getText().equals(dosyaceker.getEleman().get(chosen+1)))
                setgreenn(l32);
            else
                setredd(l32);
            l33.setText(dosyaceker.getEleman().get(entered+2));
            if(l33.getText().equals(dosyaceker.getEleman().get(chosen+2)))
                setgreenn(l33);
            else
                setredd(l33);
            l34.setText(dosyaceker.getEleman().get(entered+3));
            if(l34.getText().equals(dosyaceker.getEleman().get(chosen+3)))
                setgreenn(l34);
            else
                setredd(l34);
            l35.setText(dosyaceker.getEleman().get(entered+4));
            if(l35.getText().equals(dosyaceker.getEleman().get(chosen+4)))
                setgreenn(l35);
            else
                setredd(l35);
            l36.setText(dosyaceker.getEleman().get(entered+5));
            if(l36.getText().equals(dosyaceker.getEleman().get(chosen+5)))
                setgreenn(l36);
            else
                setredd(l36);
        }else if(click==4){
            h3.setBorder(new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.EMPTY)));
            h4.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            entered=dosyaceker.finder(txt.getText());

            l41.setText(dosyaceker.getEleman().get(entered));
            if(l41.getText().equals(dosyaceker.getEleman().get(chosen)))
                setgreenn(l41);
            else
                setredd(l41);
            l42.setText(dosyaceker.getEleman().get(entered+1));
            if(l42.getText().equals(dosyaceker.getEleman().get(chosen+1)))
                setgreenn(l42);
            else
                setredd(l42);
            l43.setText(dosyaceker.getEleman().get(entered+2));
            if(l43.getText().equals(dosyaceker.getEleman().get(chosen+2)))
                setgreenn(l43);
            else
                setredd(l43);
            l44.setText(dosyaceker.getEleman().get(entered+3));
            if(l44.getText().equals(dosyaceker.getEleman().get(chosen+3)))
                setgreenn(l44);
            else
                setredd(l44);
            l45.setText(dosyaceker.getEleman().get(entered+4));
            if(l45.getText().equals(dosyaceker.getEleman().get(chosen+4)))
                setgreenn(l45);
            else
                setredd(l45);
            l46.setText(dosyaceker.getEleman().get(entered+5));
            if(l46.getText().equals(dosyaceker.getEleman().get(chosen+5)))
                setgreenn(l46);
            else
                setredd(l46);
        }else if(click==5){
            h4.setBorder(new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.EMPTY)));
            h5.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            entered=dosyaceker.finder(txt.getText());

            l51.setText(dosyaceker.getEleman().get(entered));
            if(l51.getText().equals(dosyaceker.getEleman().get(chosen)))
                setgreenn(l51);
            else
                setredd(l51);
            l52.setText(dosyaceker.getEleman().get(entered+1));
            if(l52.getText().equals(dosyaceker.getEleman().get(chosen+1)))
                setgreenn(l52);
            else
                setredd(l52);
            l53.setText(dosyaceker.getEleman().get(entered+2));
            if(l53.getText().equals(dosyaceker.getEleman().get(chosen+2)))
                setgreenn(l53);
            else
                setredd(l53);
            l54.setText(dosyaceker.getEleman().get(entered+3));
            if(l54.getText().equals(dosyaceker.getEleman().get(chosen+3)))
                setgreenn(l54);
            else
                setredd(l54);
            l55.setText(dosyaceker.getEleman().get(entered+4));
            if(l55.getText().equals(dosyaceker.getEleman().get(chosen+4)))
                setgreenn(l55);
            else
                setredd(l55);
            l56.setText(dosyaceker.getEleman().get(entered+5));
            if(l56.getText().equals(dosyaceker.getEleman().get(chosen+5)))
                setgreenn(l56);
            else
                setredd(l56);
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
}