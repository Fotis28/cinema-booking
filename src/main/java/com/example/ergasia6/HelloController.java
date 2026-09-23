package com.example.ergasia6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import javafx.stage.Stage;

import java.io.IOException;
import java.util.*;


public class HelloController {

    @FXML
    private Button ButtonTime;//Κουμπι ωρας
    @FXML
    private Button ButtonTime1;//Κουμπι ωρας
    @FXML
    private Button ButtonTime2;//Κουμπι ωρας
    @FXML
    private Button ButtonTime3;//Κουμπι ωρας
    @FXML
    private Button ButtonTime4;//Κουμπι ωρας
    @FXML
    private Button ButtonTime5;//Κουμπι ωρας
    @FXML
    private Button ButtonDays;//Κουμπι μερας
    @FXML
    private Button ButtonDays1;//Κουμπι μερας
    @FXML
    private Button ButtonDays2;//Κουμπι μερας
    @FXML
    private Button ButtonDays3;//Κουμπι μερας
    @FXML
    private Button ButtonDays4;//Κουμπι μερας
    @FXML
    private Button ButtonDays5;//Κουμπι μερας
    @FXML
    private Button ButtonDays6;//Κουμπι μερας
    @FXML
    private Label hintLabel;
    //Grip Pane 1 4x10
    @FXML
    private Button ButtonSeat1_0_0;//Κουμπι θεσεις
    @FXML
    private Button ButtonSeat1_0_1;
    @FXML
    private Button ButtonSeat1_0_2;
    @FXML
    private Button ButtonSeat1_0_3;

    @FXML
    private Button ButtonSeat1_1_0;
    @FXML
    private Button ButtonSeat1_1_1;
    @FXML
    private Button ButtonSeat1_1_2;
    @FXML
    private Button ButtonSeat1_1_3;

    @FXML
    private Button ButtonSeat1_2_0;
    @FXML
    private Button ButtonSeat1_2_1;
    @FXML
    private Button ButtonSeat1_2_2;
    @FXML
    private Button ButtonSeat1_2_3;

    @FXML
    private Button ButtonSeat1_3_0;
    @FXML
    private Button ButtonSeat1_3_1;
    @FXML
    private Button ButtonSeat1_3_2;
    @FXML
    private Button ButtonSeat1_3_3;

    @FXML
    private Button ButtonSeat1_4_0;
    @FXML
    private Button ButtonSeat1_4_1;
    @FXML
    private Button ButtonSeat1_4_2;
    @FXML
    private Button ButtonSeat1_4_3;

    @FXML
    private Button ButtonSeat1_5_0;
    @FXML
    private Button ButtonSeat1_5_1;
    @FXML
    private Button ButtonSeat1_5_2;
    @FXML
    private Button ButtonSeat1_5_3;

    @FXML
    private Button ButtonSeat1_6_0;
    @FXML
    private Button ButtonSeat1_6_1;
    @FXML
    private Button ButtonSeat1_6_2;
    @FXML
    private Button ButtonSeat1_6_3;

    @FXML
    private Button ButtonSeat1_7_0;
    @FXML
    private Button ButtonSeat1_7_1;
    @FXML
    private Button ButtonSeat1_7_2;
    @FXML
    private Button ButtonSeat1_7_3;

    @FXML
    private Button ButtonSeat1_8_0;
    @FXML
    private Button ButtonSeat1_8_1;
    @FXML
    private Button ButtonSeat1_8_2;
    @FXML
    private Button ButtonSeat1_8_3;

    @FXML
    private Button ButtonSeat1_9_0;
    @FXML
    private Button ButtonSeat1_9_1;
    @FXML
    private Button ButtonSeat1_9_2;
    @FXML
    private Button ButtonSeat1_9_3;

    @FXML
    private Button ButtonSeat2_0_0;
    @FXML
    private Button ButtonSeat2_0_1;
    @FXML
    private Button ButtonSeat2_0_2;
    @FXML
    private Button ButtonSeat2_0_3;
    @FXML
    private Button ButtonSeat2_0_4;
    @FXML
    private Button ButtonSeat2_0_5;
    @FXML
    private Button ButtonSeat2_0_6;

    @FXML
    private Button ButtonSeat2_1_0;
    @FXML
    private Button ButtonSeat2_1_1;
    @FXML
    private Button ButtonSeat2_1_2;
    @FXML
    private Button ButtonSeat2_1_3;
    @FXML
    private Button ButtonSeat2_1_4;
    @FXML
    private Button ButtonSeat2_1_5;
    @FXML
    private Button ButtonSeat2_1_6;

    @FXML
    private Button ButtonSeat2_2_0;
    @FXML
    private Button ButtonSeat2_2_1;
    @FXML
    private Button ButtonSeat2_2_2;
    @FXML
    private Button ButtonSeat2_2_3;
    @FXML
    private Button ButtonSeat2_2_4;
    @FXML
    private Button ButtonSeat2_2_5;
    @FXML
    private Button ButtonSeat2_2_6;

    @FXML
    private Button ButtonSeat2_3_0;
    @FXML
    private Button ButtonSeat2_3_1;
    @FXML
    private Button ButtonSeat2_3_2;
    @FXML
    private Button ButtonSeat2_3_3;
    @FXML
    private Button ButtonSeat2_3_4;
    @FXML
    private Button ButtonSeat2_3_5;
    @FXML
    private Button ButtonSeat2_3_6;

    @FXML
    private Button ButtonSeat2_4_0;
    @FXML
    private Button ButtonSeat2_4_1;
    @FXML
    private Button ButtonSeat2_4_2;
    @FXML
    private Button ButtonSeat2_4_3;
    @FXML
    private Button ButtonSeat2_4_4;
    @FXML
    private Button ButtonSeat2_4_5;
    @FXML
    private Button ButtonSeat2_4_6;

    @FXML
    private Button ButtonSeat2_5_0;
    @FXML
    private Button ButtonSeat2_5_1;
    @FXML
    private Button ButtonSeat2_5_2;
    @FXML
    private Button ButtonSeat2_5_3;
    @FXML
    private Button ButtonSeat2_5_4;
    @FXML
    private Button ButtonSeat2_5_5;
    @FXML
    private Button ButtonSeat2_5_6;

    @FXML
    private Button ButtonSeat2_6_0;
    @FXML
    private Button ButtonSeat2_6_1;
    @FXML
    private Button ButtonSeat2_6_2;
    @FXML
    private Button ButtonSeat2_6_3;
    @FXML
    private Button ButtonSeat2_6_4;
    @FXML
    private Button ButtonSeat2_6_5;
    @FXML
    private Button ButtonSeat2_6_6;

    @FXML
    private Button ButtonSeat2_7_0;
    @FXML
    private Button ButtonSeat2_7_1;
    @FXML
    private Button ButtonSeat2_7_2;
    @FXML
    private Button ButtonSeat2_7_3;
    @FXML
    private Button ButtonSeat2_7_4;
    @FXML
    private Button ButtonSeat2_7_5;
    @FXML
    private Button ButtonSeat2_7_6;

    @FXML
    private Button ButtonSeat2_8_0;
    @FXML
    private Button ButtonSeat2_8_1;
    @FXML
    private Button ButtonSeat2_8_2;
    @FXML
    private Button ButtonSeat2_8_3;
    @FXML
    private Button ButtonSeat2_8_4;
    @FXML
    private Button ButtonSeat2_8_5;
    @FXML
    private Button ButtonSeat2_8_6;

    @FXML
    private Button ButtonSeat3_0_0;//Κουμπι θεσεις
    @FXML
    private Button ButtonSeat3_0_1;
    @FXML
    private Button ButtonSeat3_0_2;
    @FXML
    private Button ButtonSeat3_0_3;

    @FXML
    private Button ButtonSeat3_1_0;
    @FXML
    private Button ButtonSeat3_1_1;
    @FXML
    private Button ButtonSeat3_1_2;
    @FXML
    private Button ButtonSeat3_1_3;

    @FXML
    private Button ButtonSeat3_2_0;
    @FXML
    private Button ButtonSeat3_2_1;
    @FXML
    private Button ButtonSeat3_2_2;
    @FXML
    private Button ButtonSeat3_2_3;

    @FXML
    private Button ButtonSeat3_3_0;
    @FXML
    private Button ButtonSeat3_3_1;
    @FXML
    private Button ButtonSeat3_3_2;
    @FXML
    private Button ButtonSeat3_3_3;

    @FXML
    private Button ButtonSeat3_4_0;
    @FXML
    private Button ButtonSeat3_4_1;
    @FXML
    private Button ButtonSeat3_4_2;
    @FXML
    private Button ButtonSeat3_4_3;

    @FXML
    private Button ButtonSeat3_5_0;
    @FXML
    private Button ButtonSeat3_5_1;
    @FXML
    private Button ButtonSeat3_5_2;
    @FXML
    private Button ButtonSeat3_5_3;

    @FXML
    private Button ButtonSeat3_6_0;
    @FXML
    private Button ButtonSeat3_6_1;
    @FXML
    private Button ButtonSeat3_6_2;
    @FXML
    private Button ButtonSeat3_6_3;

    @FXML
    private Button ButtonSeat3_7_0;
    @FXML
    private Button ButtonSeat3_7_1;
    @FXML
    private Button ButtonSeat3_7_2;
    @FXML
    private Button ButtonSeat3_7_3;

    @FXML
    private Button ButtonSeat3_8_0;
    @FXML
    private Button ButtonSeat3_8_1;
    @FXML
    private Button ButtonSeat3_8_2;
    @FXML
    private Button ButtonSeat3_8_3;

    @FXML
    private Button ButtonSeat3_9_0;
    @FXML
    private Button ButtonSeat3_9_1;
    @FXML
    private Button ButtonSeat3_9_2;
    @FXML
    private Button ButtonSeat3_9_3;















    @FXML
    private ImageView ImageMoviePhoto;

    @FXML
    private Button switchSceneButton;


    @FXML
    private Label TimeMovie;

    @FXML
    private Label TitelMovie;

    @FXML
    private Label DataMovie;
    @FXML
    private Label DataMovie1;
    @FXML
    private Label DataMovie2;


    @FXML
    private Button MyButtonNextScene;

    @FXML
    private Label MovieDescription;



    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;

    private Set<Button> selectedSeats2 = new HashSet<>(); // Αποθηκεύει τις επιλεγμένες θέσεις

    private Button activeButtonTime = null; // Κρατάει το ενεργό κουμπί
    private Button activeButtonDays = null; // Κρατάει το ενεργό κουμπί

    private boolean flagTimeFound = false; // Κρατάει τον κουμπί που βρέθηκε

    private List<Button> buttonsTime = new ArrayList<>(); // Λίστα με όλα τα κουμπιά
    private List<Button> buttonsDays = new ArrayList<>(); // Λίστα με όλα τα κουμπιά
    Image onImage = new Image(getClass().getResourceAsStream("/com/example/ergasia6/img/ChooseSeats.png"));
    Image offImage = new Image(getClass().getResourceAsStream("/com/example/ergasia6/img/green.png"));
    ImageView imageSeat= new ImageView(onImage);
    ImageView imageSeatOff = new ImageView(offImage);

    private int imageMovie ;

    private boolean  flagImage;

    @FXML
    private ImageView buttonImageView;

    private final Image defaultImage = new Image(getClass().getResource("/com/example/ergasia6/img/ButtonScene1.png").toExternalForm());
    private final Image hoverImage = new Image(getClass().getResource("/com/example/ergasia6/img/ButtonScene2.png").toExternalForm());



    double width = 20;  // Το πλάτος της εικόνας
    double height = 24; // Το ύψος της εικόνας





    private final Image closeSeat = new Image(getClass().getResourceAsStream("/com/example/ergasia6/img/Reserve_Seat.png"));
    private final ImageView closeSeatImage = new ImageView(closeSeat);

    private int MovieImageFromScene2;

    List<Button> matchedButtons = new ArrayList<>();

    private Set<Button> selectedButtons = new HashSet<>();
    // Δημιουργούμε τα ImageView και ορίζουμε το μέγεθός τους
    private final Set<Button> activeButtons = new HashSet<>();
    private final Set<Button> allButtons = new HashSet<>();

    private Set<Button> selectedSeats;
    private Button selectedTimeButton;
    private Button selectedDayButton;
    private Button ClickedButtonTime ;
    private Button ClickedButtonDay ;
    private Button selectedButtonsDaysBack;
    private boolean flagTimeBack= false;
    private boolean flagDayFound=false;
    @FXML
    private ImageView buttonImageViewBack;


    @FXML
    public void initialize() {
        // Προσθήκη κουμπιών στη λίστα
        //Λίστα για την ωρα
        buttonsTime.add(ButtonTime);
        buttonsTime.add(ButtonTime1);
        buttonsTime.add(ButtonTime2);
        buttonsTime.add(ButtonTime3);
        buttonsTime.add(ButtonTime4);
        buttonsTime.add(ButtonTime5);

        //Λίστα για την ημερα
        buttonsDays.add(ButtonDays);
        buttonsDays.add(ButtonDays1);
        buttonsDays.add(ButtonDays2);
        buttonsDays.add(ButtonDays3);
        buttonsDays.add(ButtonDays4);
        buttonsDays.add(ButtonDays5);
        buttonsDays.add(ButtonDays6);

        allButtons.add(ButtonSeat1_0_0);
        allButtons.add(ButtonSeat1_0_1);
        allButtons.add(ButtonSeat1_0_2);
        allButtons.add(ButtonSeat1_0_3);
        allButtons.add(ButtonSeat1_1_0);
        allButtons.add(ButtonSeat1_1_1);
        allButtons.add(ButtonSeat1_1_2);
        allButtons.add(ButtonSeat1_1_3);
        allButtons.add(ButtonSeat1_2_0);
        allButtons.add(ButtonSeat1_2_1);
        allButtons.add(ButtonSeat1_2_2);
        allButtons.add(ButtonSeat1_2_3);
        allButtons.add(ButtonSeat1_3_0);
        allButtons.add(ButtonSeat1_3_1);
        allButtons.add(ButtonSeat1_3_2);
        allButtons.add(ButtonSeat1_3_3);
        allButtons.add(ButtonSeat1_4_0);
        allButtons.add(ButtonSeat1_4_1);
        allButtons.add(ButtonSeat1_4_2);
        allButtons.add(ButtonSeat1_4_3);
        allButtons.add(ButtonSeat1_5_0);
        allButtons.add(ButtonSeat1_5_1);
        allButtons.add(ButtonSeat1_5_2);
        allButtons.add(ButtonSeat1_5_3);
        allButtons.add(ButtonSeat1_6_0);
        allButtons.add(ButtonSeat1_6_1);
        allButtons.add(ButtonSeat1_6_2);
        allButtons.add(ButtonSeat1_6_3);
        allButtons.add(ButtonSeat1_7_0);
        allButtons.add(ButtonSeat1_7_1);
        allButtons.add(ButtonSeat1_7_2);
        allButtons.add(ButtonSeat1_7_3);
        allButtons.add(ButtonSeat1_8_0);
        allButtons.add(ButtonSeat1_8_1);
        allButtons.add(ButtonSeat1_8_2);
        allButtons.add(ButtonSeat1_8_3);
        allButtons.add(ButtonSeat1_9_0);
        allButtons.add(ButtonSeat1_9_1);
        allButtons.add(ButtonSeat1_9_2);
        allButtons.add(ButtonSeat1_9_3);


        allButtons.add(ButtonSeat2_0_0);
        allButtons.add(ButtonSeat2_0_1);
        allButtons.add(ButtonSeat2_0_2);
        allButtons.add(ButtonSeat2_0_3);
        allButtons.add(ButtonSeat2_0_4);
        allButtons.add(ButtonSeat2_0_5);
        allButtons.add(ButtonSeat2_0_6);
        allButtons.add(ButtonSeat2_1_0);
        allButtons.add(ButtonSeat2_1_1);
        allButtons.add(ButtonSeat2_1_2);
        allButtons.add(ButtonSeat2_1_3);
        allButtons.add(ButtonSeat2_1_4);
        allButtons.add(ButtonSeat2_1_5);
        allButtons.add(ButtonSeat2_1_6);


        allButtons.add(ButtonSeat2_2_0);
        allButtons.add(ButtonSeat2_2_1);
        allButtons.add(ButtonSeat2_2_2);
        allButtons.add(ButtonSeat2_2_3);
        allButtons.add(ButtonSeat2_2_4);
        allButtons.add(ButtonSeat2_2_5);
        allButtons.add(ButtonSeat2_2_6);


        allButtons.add(ButtonSeat2_3_0);
        allButtons.add(ButtonSeat2_3_1);
        allButtons.add(ButtonSeat2_3_2);
        allButtons.add(ButtonSeat2_3_3);
        allButtons.add(ButtonSeat2_3_4);
        allButtons.add(ButtonSeat2_3_5);
        allButtons.add(ButtonSeat2_3_6);


        allButtons.add(ButtonSeat2_4_0);
        allButtons.add(ButtonSeat2_4_1);
        allButtons.add(ButtonSeat2_4_2);
        allButtons.add(ButtonSeat2_4_3);
        allButtons.add(ButtonSeat2_4_4);
        allButtons.add(ButtonSeat2_4_5);
        allButtons.add(ButtonSeat2_4_6);


        allButtons.add(ButtonSeat2_5_0);
        allButtons.add(ButtonSeat2_5_1);
        allButtons.add(ButtonSeat2_5_2);
        allButtons.add(ButtonSeat2_5_3);
        allButtons.add(ButtonSeat2_5_4);
        allButtons.add(ButtonSeat2_5_5);
        allButtons.add(ButtonSeat2_5_6);


        allButtons.add(ButtonSeat2_6_0);
        allButtons.add(ButtonSeat2_6_1);
        allButtons.add(ButtonSeat2_6_2);
        allButtons.add(ButtonSeat2_6_3);
        allButtons.add(ButtonSeat2_6_4);
        allButtons.add(ButtonSeat2_6_5);
        allButtons.add(ButtonSeat2_6_6);


        allButtons.add(ButtonSeat2_7_0);
        allButtons.add(ButtonSeat2_7_1);
        allButtons.add(ButtonSeat2_7_2);
        allButtons.add(ButtonSeat2_7_3);
        allButtons.add(ButtonSeat2_7_4);
        allButtons.add(ButtonSeat2_7_5);
        allButtons.add(ButtonSeat2_7_6);


        allButtons.add(ButtonSeat2_8_0);
        allButtons.add(ButtonSeat2_8_1);
        allButtons.add(ButtonSeat2_8_2);
        allButtons.add(ButtonSeat2_8_3);
        allButtons.add(ButtonSeat2_8_4);
        allButtons.add(ButtonSeat2_8_5);
        allButtons.add(ButtonSeat2_8_6);


        allButtons.add(ButtonSeat3_0_0);
        allButtons.add(ButtonSeat3_0_1);
        allButtons.add(ButtonSeat3_0_2);
        allButtons.add(ButtonSeat3_0_3);

        allButtons.add(ButtonSeat3_1_0);
        allButtons.add(ButtonSeat3_1_1);
        allButtons.add(ButtonSeat3_1_2);
        allButtons.add(ButtonSeat3_1_3);

        allButtons.add(ButtonSeat3_2_0);
        allButtons.add(ButtonSeat3_2_1);
        allButtons.add(ButtonSeat3_2_2);
        allButtons.add(ButtonSeat3_2_3);

        allButtons.add(ButtonSeat3_3_0);
        allButtons.add(ButtonSeat3_3_1);
        allButtons.add(ButtonSeat3_3_2);
        allButtons.add(ButtonSeat3_3_3);

        allButtons.add(ButtonSeat3_4_0);
        allButtons.add(ButtonSeat3_4_1);
        allButtons.add(ButtonSeat3_4_2);
        allButtons.add(ButtonSeat3_4_3);

        allButtons.add(ButtonSeat3_5_0);
        allButtons.add(ButtonSeat3_5_1);
        allButtons.add(ButtonSeat3_5_2);
        allButtons.add(ButtonSeat3_5_3);

        allButtons.add(ButtonSeat3_6_0);
        allButtons.add(ButtonSeat3_6_1);
        allButtons.add(ButtonSeat3_6_2);
        allButtons.add(ButtonSeat3_6_3);

        allButtons.add(ButtonSeat3_7_0);
        allButtons.add(ButtonSeat3_7_1);
        allButtons.add(ButtonSeat3_7_2);
        allButtons.add(ButtonSeat3_7_3);

        allButtons.add(ButtonSeat3_8_0);
        allButtons.add(ButtonSeat3_8_1);
        allButtons.add(ButtonSeat3_8_2);
        allButtons.add(ButtonSeat3_8_3);

        allButtons.add(ButtonSeat3_9_0);
        allButtons.add(ButtonSeat3_9_1);
        allButtons.add(ButtonSeat3_9_2);
        allButtons.add(ButtonSeat3_9_3);









        imageSeat.setFitWidth(width);  // Ορίζουμε το πλάτος της εικόνας
        imageSeat.setFitHeight(height); // Ορίζουμε το ύψος της εικόνας


        imageSeatOff.setFitWidth(width);  // Ορίζουμε το πλάτος της εικόνας
        imageSeatOff.setFitHeight(height);

       if (buttonImageView.getImage() == null) {
            buttonImageView.setImage(defaultImage);
        }

        switchSceneButton.setDisable(true);

       // Προσθήκη listeners για ενεργοποίηση του κουμπιού όταν γίνουν επιλογές

        checkIfReadyToEnableButton();

    }

    public void setImageMoviePhoto()
    {
        int TimeMovieSecond=0;
        String Director=null;
        String Stars=null;
        String Genre=null;
        String Title=null;
        StringBuilder sb = new StringBuilder();
        Image image=null;
        switch (imageMovie) {
            case 1:
                image = new Image(getClass().getResourceAsStream("/com/example/ergasia6/img/movie_placeholder.png"));
                TimeMovieSecond=95;
                Director="Mia Konstantis";
                Stars="Leo Brandt, Sofia Marek, Aiden Cole";
                Genre="Comedy, Family, Drama";
                Title="Paper Lanterns";
                sb.append("When the family bakery is about to close for good, three siblings enter the city lantern festival");
                sb.append("\n");
                sb.append("with one recipe they cannot agree on, a deadline they cannot move, and a father who refuses");
                sb.append("\n");
                sb.append("to admit that he needs any help at all.");
                break;
            case 2:
                image = new Image(getClass().getResourceAsStream("/com/example/ergasia6/img/movie_placeholder.png"));
                TimeMovieSecond=118;
                Director="Ravi Menon";
                Stars="Dana Whitfield, Peter Ailey, Noor Haddad";
                Genre="Sci-fi, Thriller, Mystery";
                Title="The Last Signal";
                sb.append("A radio astronomer records a message from deep space that repeats her own voice back to her,");
                sb.append("\n");
                sb.append("three seconds before she speaks. To find out who is listening, she has to keep talking,");
                sb.append("\n");
                sb.append("even after the answers stop making sense.");
                break;
            case 3:
                image = new Image(getClass().getResourceAsStream("/com/example/ergasia6/img/movie_placeholder.png"));
                TimeMovieSecond=102;
                Director="Elena Vasquez";
                Stars="Marcus Hale, Ingrid Solberg, Tomas Reyes";
                Genre="Drama, Mystery";
                Title="Silent Harbor";
                sb.append("A lighthouse keeper on a forgotten island pulls ashore a boat that should not exist,");
                sb.append("\n");
                sb.append("with a logbook written in his own handwriting. As winter closes the sea route for months,");
                sb.append("\n");
                sb.append("the questions it brought with it are harder to survive than the storms.");
                break;
            case 4:
                image = new Image(getClass().getResourceAsStream("/com/example/ergasia6/img/movie_placeholder.png"));
                TimeMovieSecond=128;
                Director="Kwame Osei";
                Stars="Renn Takeda, Clara Duval, Idris Bako";
                Genre="Action, Adventure, Survival";
                Title="Ashfall";
                sb.append("An eruption cuts a small island off from the mainland and turns the sky to ash.");
                sb.append("\n");
                sb.append("A rescue pilot with one working helicopter has a single window of clear air to bring out");
                sb.append("\n");
                sb.append("the crew of a research station that everyone else has already written off.");
                break;
        }
        if (ImageMoviePhoto != null) {
            ImageMoviePhoto.setImage(image);
            if (imageMovie == 2)
            {
                ImageMoviePhoto.setFitWidth(564);
                ImageMoviePhoto.setFitHeight(743);
            }
            else
            {
                ImageMoviePhoto.setFitWidth(629);
                ImageMoviePhoto.setFitHeight(743);
            }
        }

        TimeMovie.setText(TimeMovieSecond +" Minutes");
        TitelMovie.setText(Title);
        DataMovie.setText(Director);
        DataMovie1.setText(Stars);
        DataMovie2.setText(Genre);
        MovieDescription.setText(sb.toString());




    }



    public void setMovieImageAndLabels(int MovieImage)
    {
        this.imageMovie=MovieImage;

    }

    public void updateSelectedSeats() {
        if (activeButtonTime != null && activeButtonDays != null && activeButtonTime.equals(selectedTimeButton) && activeButtonDays.equals(selectedDayButton)) {
            for (Button seat : selectedSeats) {
                seat.setDisable(true);
                // Set the specific image for the seat
                ImageView seatImage = new ImageView(closeSeat);
                seatImage.setFitWidth(24);
                seatImage.setFitHeight(height);
                seat.setGraphic(seatImage);
            }
        }

    }




    @FXML
    public void SwitchToScene0(ActionEvent event) throws IOException {

        // Φορτώνουμε τη σκηνή 0
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/ergasia6/SceneMovies.fxml"));
        Parent root = loader.load();
        SceneMovies sceneMovies = loader.getController();
        sceneMovies.setSelectedSeats(selectedButtons,selectedButtonsDaysBack,flagTimeBack,selectedTimeButton);
        sceneMovies.setMoviePhotoFromScene2(MovieImageFromScene2);

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    // Safety guard: the button stays disabled until a day, a time and at least
    // one seat are selected, so these checks are not expected to fire.
    @FXML
    public void SwitchToScene2(ActionEvent event) throws IOException {
        // Έλεγχος αν έχει επιλεγεί ώρα και ημέρα
        if (activeButtonTime == null) {
            new Alert(Alert.AlertType.WARNING, "Δεν έχει επιλεγεί ώρα.").showAndWait();
            return;
        }

        if (activeButtonDays == null) {
            new Alert(Alert.AlertType.WARNING, "Δεν έχει επιλεγεί ημέρα.").showAndWait();
            return;
        }

        // Έλεγχος αν έχει επιλεγεί τουλάχιστον μια θέση
        if (activeButtons.isEmpty()) {
            new Alert(Alert.AlertType.WARNING, "Δεν έχει επιλεγεί καμία θέση.").showAndWait();
            return;
        }


        // Φορτώνουμε τη σκηνή 2
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/ergasia6/Ergasia.fxml"));
        Parent root = loader.load();

        // Παίρνουμε τον controller της σκηνής 2
        Scene2Controller scene2Controller = loader.getController();

        // Μεταβιβάζουμε τις ενεργές θέσεις και τις θέσεις στο Scene2Controller
        scene2Controller.setActiveButtonsSize(activeButtons.size());
        scene2Controller.setSelectedButtons(activeButtons);
        scene2Controller.setSelectedButtonDay(ClickedButtonDay);
        scene2Controller.setSelectedButtonsTime(ClickedButtonTime);
        scene2Controller.setMovieImage(imageMovie);





        // Μετάβαση στη σκηνή 2
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



    @FXML
    public void ButtonTimeStill(ActionEvent event)throws IOException
    {
        Button clickedButton = (Button) event.getSource();



        if (activeButtonTime == null || activeButtonTime.equals(clickedButton)) {
            // Ενεργοποίηση/Απενεργοποίηση του κουμπιού
            if (activeButtonTime == null) {
                clickedButton.setStyle("-fx-background-color: #07F8A3");



                disableOtherButtons(clickedButton);
                activeButtonTime = clickedButton;
            } else {
                clickedButton.setStyle("-fx-background-color: #333333");



                enableAllButtons();
                activeButtonTime = null; // Καμία ενεργή επιλογή
            }
        }
        ClickedButtonTime=clickedButton;





        if(flagTimeBack) {
            updateButtonsSeat(event);
            CheckImagesMovies();

            if (flagDayFound && flagTimeFound && flagImage){
                SetTheSeats2();
                flagDayFound=false;
                flagTimeFound=false;
                activeButtons.clear();
            } else {
                SetTheSeats2Default();
            }
        }
        checkIfReadyToEnableButton();
    }


    public  void SetSelectedButtonsAndTime(Set<Button> selectedSeats2,Button selectedButtonDays, boolean flag ,Button activeButtonTime2)throws IOException
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/ergasia6/Ergasia.fxml"));
        Parent root = loader.load();


        Scene2Controller scene2Controller = loader.getController();

        this.selectedButtons=selectedSeats2;
        this.selectedButtonsDaysBack=selectedButtonDays;
        this.flagTimeBack=flag;
        activeButtonDays = null;
        selectedSeats = selectedSeats2;
        this.selectedTimeButton = activeButtonTime2;
        selectedDayButton = selectedButtonDays;



    }



    public void updateButtonsSeat(ActionEvent event) {

        Button clickedButton = (Button) event.getSource();
        SetTheSeats2Default();
        if (selectedButtonsDaysBack == null || selectedButtons == null || activeButtonTime == null) {
            return;
        }
          for (Button selectedButtons : selectedButtons) {
              for (Button allButton : allButtons) {
                 if((activeButtonDays.getId().equals(selectedButtonsDaysBack.getId()))&&(selectedButtons.getId().equals(allButton.getId()))) {
                     //if (selectedButtons.getId().equals(allButton.getId())) { // Σύγκριση IDs

                     matchedButtons.add(allButton);
                         flagDayFound=true;
                          // Πρόσθεσε στη λίστα τις αντιστοιχίες
                        /* ImageView closeSeatImage = new ImageView(closeSeat);
                         // Αλλαγή της εικόνας
                         // Χρησιμοποιούμε τη νέα εικόνα
                         closeSeatImage.setFitWidth(24); // Ορίζουμε πλάτος
                         closeSeatImage.setFitHeight(height); // Ορίζουμε ύψος
                         allButton.setGraphic(closeSeatImage); // Ρυθμίζουμε το νέο γραφικό στο κουμπί

                         // Απενεργοποίηση του κουμπιού
                         allButton.setDisable(true);*/
                     //
                 }
                  if((activeButtonTime.getId().equals(selectedTimeButton.getId())))
                 {
                     flagTimeFound=true;


                 }

              }


          }



        if (matchedButtons.isEmpty()) {
        } else {

            for (Button matched : matchedButtons) {

            }
        }
    }

     private void SetTheSeats2()
     {
         for(Button  matchedButtons: matchedButtons) {
             ImageView closeSeatImage = new ImageView(closeSeat);
             // Αλλαγή της εικόνας
             // Χρησιμοποιούμε τη νέα εικόνα
             closeSeatImage.setFitWidth(24);
             closeSeatImage.setFitHeight(height);
             matchedButtons.setGraphic(closeSeatImage);
             matchedButtons.setDisable(true);
         }
     }
    private void SetTheSeats2Default()
    {
        for(Button  matchedButtons: matchedButtons) {
            ImageView closeSeatImage = new ImageView(offImage);
            // Αλλαγή της εικόνας
            // Χρησιμοποιούμε τη νέα εικόνα
            closeSeatImage.setFitWidth(24);
            closeSeatImage.setFitHeight(height);
            matchedButtons.setGraphic(closeSeatImage);
            matchedButtons.setDisable(false);
        }
    }

    private void disableOtherButtons(Button exception) {
        for (Button button : buttonsTime) {
            if (!button.equals(exception)) {
                button.setDisable(true);
            }
        }

    }

    private void enableAllButtons() {
        for (Button button : buttonsTime) {
            button.setDisable(false);
        }
    }


    @FXML
    public void ButtonDaysStill(ActionEvent event)
    {
        Button clickedButton = (Button) event.getSource();
        if (activeButtonDays == null || activeButtonDays.equals(clickedButton)) {
            // Ενεργοποίηση/Απενεργοποίηση του κουμπιού
            if (activeButtonDays == null) {
                clickedButton.setStyle("-fx-background-color: #07F8A3");
                disableOtherButtonsDays(clickedButton);
                activeButtonDays = clickedButton;
            } else {
                clickedButton.setStyle("-fx-background-color: #333333");
                enableAllButtonsDays();
                activeButtonDays = null; // Καμία ενεργή επιλογή
            }
        }
        ClickedButtonDay=clickedButton;
         if(flagTimeBack)
        {
            updateButtonsSeat(event);
            CheckImagesMovies();
          if(flagDayFound && flagTimeFound && flagImage)
          {
              SetTheSeats2();
              flagDayFound=false;
              flagTimeFound=false;
           }
          else
          {
              SetTheSeats2Default();
          }

         }





        checkIfReadyToEnableButton();
        updateSelectedSeats();
    }

  public void CheckImagesMovies()
  {
      if(imageMovie==MovieImageFromScene2)
      flagImage=true;

  }

  public void setMoviePhotoFromScene2(int MovieImageFromScene2)
    {
        this.MovieImageFromScene2=MovieImageFromScene2;
    }



    private void disableOtherButtonsDays(Button exception) {
        for (Button button : buttonsDays) {
            if (!button.equals(exception)) {
                button.setDisable(true);
            }
        }

    }

    private void enableAllButtonsDays() {
        for (Button button : buttonsDays) {
            button.setDisable(false);
        }
    }


    @FXML
    public void ButtonSeat(ActionEvent event) {


        Button clickedButton = (Button) event.getSource();

        ImageView currentImageView = (ImageView) clickedButton.getGraphic();

        if (currentImageView == null) {
            return;
        }

        if (activeButtons.contains(clickedButton)) {
            // Απενεργοποιούμε το κουμπί αν είναι ήδη ενεργό
            currentImageView.setImage(offImage);
            activeButtons.remove(clickedButton);


        } else {
            // Ενεργοποιούμε το κουμπί αν δεν είναι ενεργό
            currentImageView.setImage(onImage);
            activeButtons.add(clickedButton);


        }



        checkIfReadyToEnableButton();
    }

    @FXML
    public void ButtonSceneChange(MouseEvent event) {
        buttonImageView.setImage(hoverImage);
        // Εικόνα για hover
    }

    @FXML
    public void ResetButtonImage(MouseEvent event) {
        buttonImageView.setImage(defaultImage);
        // Επαναφορά στην αρχική εικόνα
    }

    @FXML
    public void ButtonSceneChange0(MouseEvent event) {
        buttonImageViewBack.setImage(hoverImage);
        // Εικόνα για hover
    }

    @FXML
    public void ResetButtonImage0(MouseEvent event) {
        buttonImageViewBack.setImage(defaultImage);
        // Επαναφορά στην αρχική εικόνα
    }


    private void checkIfReadyToEnableButton() {
        // Ενεργοποίηση του κουμπιού μόνο όταν πληρούνται οι προϋποθέσεις

        boolean ready = activeButtonTime != null && activeButtonDays != null && !activeButtons.isEmpty();
        switchSceneButton.setDisable(!ready);

        if (ready) {
            hintLabel.setText("");
        } else if (activeButtonDays == null) {
            hintLabel.setText("Επιλέξτε ημέρα");
        } else if (activeButtonTime == null) {
            hintLabel.setText("Επιλέξτε ώρα");
        } else {
            hintLabel.setText("Επιλέξτε τουλάχιστον μία θέση");
        }
    }




}
