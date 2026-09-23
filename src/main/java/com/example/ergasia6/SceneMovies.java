package com.example.ergasia6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;


import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;


import java.util.HashSet;
import java.util.Set;

public class SceneMovies
{
    @FXML
    private Button ButtonMovie1;
    @FXML
    private Button ButtonMovie2;
    @FXML
    private Button ButtonMovie3;
    @FXML
    private Button ButtonMovie4;

    @FXML
    private Label Movie1_text;
    @FXML
    private Label Movie2_text;
    @FXML
    private Label Movie3_text;
    @FXML
    private Label Movie4_text;



    private Set<Label> selectedLabels = new HashSet<>();


     Image MovieImage= new Image(getClass().getResourceAsStream("/com/example/ergasia6/img/movie_placeholder.png"));
     Image MovieImage2= new Image(getClass().getResourceAsStream("/com/example/ergasia6/img/movie_placeholder.png"));
    Image MovieImage3= new Image(getClass().getResourceAsStream("/com/example/ergasia6/img/movie_placeholder.png"));
    Image MovieImage4= new Image(getClass().getResourceAsStream("/com/example/ergasia6/img/movie_placeholder.png"));

    private Set<Button> selectedButtons = new HashSet<>();
    private Button selectedButtonsDay;
    private boolean flag =false;
    private Button selectedButtonsTime;
    private int MovieImageFromScene2;

    public void initialize()
    {
       selectedLabels.add(Movie1_text);
       selectedLabels.add(Movie2_text);
       selectedLabels.add(Movie3_text);
       selectedLabels.add(Movie4_text);

        Movie1_text.setAlignment(Pos.CENTER);
        Movie2_text.setAlignment(Pos.CENTER);
        Movie3_text.setAlignment(Pos.CENTER);
        Movie4_text.setAlignment(Pos.CENTER);
    }


    public void selectMovie(ActionEvent event) throws IOException {

        Button button = (Button) event.getSource();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/ergasia6/hello-view.fxml"));
        Parent root = loader.load();
        HelloController helloController = loader.getController();



        if(event.getSource() == ButtonMovie1)
        {

            helloController.setMovieImageAndLabels(1) ;
        }
        else if(event.getSource() == ButtonMovie2)
        {
            helloController.setMovieImageAndLabels(2);
        }
        else if(event.getSource() == ButtonMovie3)
        {
            helloController.setMovieImageAndLabels(3);
        }
        else if(event.getSource() == ButtonMovie4)
        {
            helloController.setMovieImageAndLabels(4);


        }
        helloController.setImageMoviePhoto();
        if(flag)
        {
            helloController.SetSelectedButtonsAndTime(selectedButtons,selectedButtonsDay,flag,selectedButtonsTime);
            helloController.setMoviePhotoFromScene2(MovieImageFromScene2);
        }

        Scene scene = new Scene(root);

        // Μετάβαση στη σκηνή 1
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();



    }

    public void setSelectedSeats(Set<Button> selectedSeats2,Button selectedButtonDays, boolean flag ,Button activeButtonTime2)throws IOException
    {
       this.selectedButtons=selectedSeats2;
       this.selectedButtonsDay=selectedButtonDays;
       this.flag=flag;
       this.selectedButtonsTime = activeButtonTime2;
    }
    public void setMoviePhotoFromScene2(int MovieImage2)
    {
        this.MovieImageFromScene2=MovieImage2;
    }

    }

