package helloworld;

import javafx.application.Application;
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.scene.control.Label;  
import javafx.scene.control.TextField;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;  

import javafx.scene.text.Font; 
import javafx.scene.text.FontPosture; 
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.geometry.Insets;
import javafx.geometry.Pos;



public class App extends Application {  
        
public static void main(String[] args) {  
launch(args);     
}  
  
@Override  
public void start(Stage primaryStage) throws Exception {  

    //Creatition of Labels
    Label matrix1=new Label("Enter Matrix 1 :  ");
    matrix1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12));
    Label matrix2 = new Label("Enter Matrix 2 :");  
    matrix2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12));
    TextField tf1 = new TextField();
   //Creation of TextFields
    TextField tf2=new TextField();  
    TextField tf3=new TextField();
    TextField tf4=new TextField();
    TextField tf5=new TextField();
    TextField tf6=new TextField();
    TextField tf7=new TextField();
    TextField tf8=new TextField();
    //Submit Button
    Button b = new Button("Submit");  
    b.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 10));
    //Reset Button
    Button b1 = new Button("Reset Values");  
    b1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 10));
    //Reset Everything Button
    Button b2 = new Button("Reset Everything");  
    b2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 10));
    //Creation of Text
    Text text1 = new Text();
    Text text2 = new Text();
    Text text3 = new Text();
    Text text4 = new Text();
    Text text5 = new Text();
    Text text6 = new Text();
    Text text7 = new Text();
    Text text8 = new Text();
    Text text9 = new Text();
    //Creatition of Style for Text
    text1.setFont(Font.font("poppins", FontWeight.BOLD, FontPosture.REGULAR, 15));
    text2.setFont(Font.font("poppins", FontWeight.BOLD, FontPosture.REGULAR, 10));
    text3.setFont(Font.font("poppins", FontWeight.BOLD, FontPosture.REGULAR, 10));
    text4.setFont(Font.font("poppins", FontWeight.BOLD, FontPosture.REGULAR, 15));
    text5.setFont(Font.font("poppins", FontWeight.BOLD, FontPosture.REGULAR, 10));
    text6.setFont(Font.font("poppins", FontWeight.BOLD, FontPosture.REGULAR, 15));
    text7.setFont(Font.font("poppins", FontWeight.BOLD, FontPosture.REGULAR, 15));
    text8.setFont(Font.font("poppins", FontWeight.BOLD, FontPosture.REGULAR, 15));
    text9.setFont(Font.font("poppins", FontWeight.BOLD, FontPosture.REGULAR, 15));
    //Creation of Borders
    final HBox pictureRegion = new HBox();
        

    //EventHandling using Submit Button 
    EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
        public void handle(ActionEvent e)
        {
        //Styling of BorderBox
    pictureRegion.setStyle("-fx-border-color: black;"+"-fx-border-width:2; "+"-fx-allignment:center-right;");
    
            //Texts 
            text1.setText("Strassen's Multiplication: ");
            text2.setText("\n P1 = a*(f-h)\n\n P2 = (a+b)*h \n\n P3 = (c+d)*e \n\n P4 = d*(g-e) \n\n P5 = (a+d)*(e+h) \n\n P6 = (b-d)*(g+h) \n\n P7 = (a-c)*(e+f) \n    ");
            text3.setText(" P1 = "+tf1.getText()+"*("+tf6.getText()+" - "+tf8.getText()+") \n\n P2 = ("+tf1.getText()+" + "+tf2.getText()+")*"+tf8.getText()+"\n\nP3 = ("+tf3.getText()+" + "+tf4.getText()+")*"+tf5.getText()+"\n\nP4 = "+tf4.getText()+"( "+tf7.getText()+" - "+tf5.getText()+")\n\nP5 = "+tf1.getText()+" + "+tf4.getText()+")*("+tf5.getText()+" + "+tf8.getText()+"\n\n P6 = ("+tf2.getText()+" - "+tf4.getText()+")*("+tf7.getText()+" + "+tf8.getText()+")\n\n P7 = ("+tf1.getText()+" - "+tf3.getText()+")*("+tf5.getText()+" + "+tf6.getText()+")\n");
            text4.setText("\n The Resultant Matrix:"); 
            text5.setText("P5 + P4 - P2 + P6\t\tP1+P2\n\nP3+P4\t\t\t\tP1+P5-P3-P7\n\n");

           //Results from texts 
            int p1 = Integer.parseInt(tf1.getText())*( Integer.parseInt(tf6.getText()) - Integer.parseInt(tf8.getText()) );
            int p2 = (Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText()) )*Integer.parseInt(tf8.getText());
            int p3 = (Integer.parseInt(tf3.getText()) + Integer.parseInt(tf4.getText()))*Integer.parseInt(tf5.getText());
            int p4 = Integer.parseInt(tf6.getText())*(Integer.parseInt(tf7.getText()) - Integer.parseInt(tf6.getText()));
            int p5 = (Integer.parseInt(tf1.getText()) + Integer.parseInt(tf4.getText())) *(Integer.parseInt(tf5.getText()) + Integer.parseInt(tf8.getText()));
            int p6 = (Integer.parseInt(tf2.getText()) - Integer.parseInt(tf4.getText()))*(Integer.parseInt(tf7.getText()) + Integer.parseInt(tf8.getText()));
            int p7 = (Integer.parseInt(tf1.getText()) - Integer.parseInt(tf3.getText()))*(Integer.parseInt(tf5.getText()) + Integer.parseInt(tf6.getText()));
              //evaluating Results  
            int res1 = p5 + p4 - p2 + p6;
            int res2 = p1 + p2;
            int res3 = p3 + p4;
            int res4 = p1 + p5 - p3 - p7;
            //Display Results
             text6.setText("\n\t"+String.valueOf(res1));
             text7.setText("\n\n"+String.valueOf(res2)+"\n");
             text8.setText("\t"+String.valueOf(res3));            
             text9.setText("\n"+String.valueOf(res4)+"  \n");

                    
        
        }
    };

    b.setOnAction(event);  
    //EventHandling using Reset Button
    EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() {
        public void handle(ActionEvent e)
        { 
            
            tf1.setText(null);
            tf2.setText(null);
            tf3.setText(null);
            tf4.setText(null);
            tf5.setText(null);
            tf6.setText(null);
            tf7.setText(null);
            tf8.setText(null);    
        }
    };
        b1.setOnAction(event1);
     //EventHandling using Reset Everything Button   
    b2.setOnAction(e->{
        tf1.setText(null);
        tf2.setText(null);
        tf3.setText(null);
        tf4.setText(null);
        tf5.setText(null);
        tf6.setText(null);
        tf7.setText(null);
        tf8.setText(null);

        text1.setText(null);
        text2.setText(null);
        text3.setText(null);
        text4.setText(null);
        text5.setText(null);
        text6.setText(null);
        text7.setText(null);
        text8.setText(null);
        text9.setText(null);
        

    });

            //Creation of GridPane
            GridPane root = new GridPane(); 
            //Creation of padding, vertical and horizontal Gaps
            root.setPadding(new Insets(10,10,10,10)); 
            root.setVgap(5);
            root.setHgap(5);
            //Setting Allignmnet
            root.setAlignment(Pos.TOP_CENTER);
            //Changing backGround Color
            root.setStyle("-fx-background-color: BEIGE;");
     
        //Adding labels,Buttons,TextFiels,Border and Result to the screen
        root.add(matrix1, 0, 0);
     root.add(tf1,2,0); 
     root.setVgap(5);
    root.add(tf2,3,0);  
    root.add(tf3,2,1);
    root.add(tf4,3,1);
    root.add(matrix2,0,2);
    root.add(tf5,2,2);
    root.add(tf6,3,2);
    root.add(tf7,2,3);
    root.add(tf8,3,3);
    root.add(b,2,4);
    root.add(b1,3,4);
    root.add(b2,3,12);
    root.add(text1,0,7);
    root.add(text2,0,8);
    root.add(text3,2,8);
    root.add(text4,0,10);
    root.add(text5,2,11);
    
    
    root.add(pictureRegion,3,5,3,5);
    root.add(text6,3,7);
    root.add(text7,4,7);
    root.add(text8,3,8);
    root.add(text9,4,8);

    //Creation of Scene
    Scene scene=new Scene(root,700,600);  
    primaryStage.setScene(scene);  
    primaryStage.setTitle("Strassen's Matrix Multipliaction Calculator");  
    primaryStage.show();  
}  
}  