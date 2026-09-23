package com.example.ergasia6;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;


import java.util.HashSet;
import java.util.Set;

public class Scene2Controller
{   @FXML
    private ImageView buttonImageViewBack;
    /*@FXML
    private Button MYbuttonBackScene;
*/

    private Scene scene;
    private Parent root;
    private Set<Button> selectedButtons = new HashSet<>();

    private final Image defaultImage = new Image(getClass().getResource("/com/example/ergasia6/img/ButtonScene1.png").toExternalForm());
    private final Image hoverImage = new Image(getClass().getResource("/com/example/ergasia6/img/ButtonScene2.png").toExternalForm());


    @FXML
    private TextField nameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField emailField;

    @FXML
    private Label Director;
    @FXML
    private Label Stars;
    @FXML
    private Label Genre;
    @FXML
    private ImageView TitleImage;

    private int imageMovieCode=0;


    public void setMovieImage(int MovieImage)
    {
        this.imageMovieCode=MovieImage;
        setImageMoviePhoto(imageMovieCode);

    }



    public void setImageMoviePhoto(int imageMovie)
    {

        String Director1=null;
        String Stars1=null;
        String Genre1=null;


        Image image=null;
        switch (imageMovie) {
            case 1:
                image = new Image(getClass().getResourceAsStream("/com/example/ergasia6/img/movie_placeholder.png"));

                Director1="Mia Konstantis";
                Stars1="Leo Brandt, Sofia Marek, Aiden Cole";
                Genre1="Comedy, Family, Drama";

                break;
            case 2:
                image = new Image(getClass().getResourceAsStream("/com/example/ergasia6/img/movie_placeholder.png"));

                Director1="Ravi Menon";
                Stars1="Dana Whitfield, Peter Ailey, Noor Haddad";
                Genre1="Sci-fi, Thriller, Mystery";

                break;
            case 3:
                image = new Image(getClass().getResourceAsStream("/com/example/ergasia6/img/movie_placeholder.png"));

                Director1="Elena Vasquez";
                Stars1="Marcus Hale, Ingrid Solberg, Tomas Reyes";
                Genre1="Drama, Mystery";


                break;
            case 4:
                image = new Image(getClass().getResourceAsStream("/com/example/ergasia6/img/movie_placeholder.png"));

                Director1="Kwame Osei";
                Stars1="Renn Takeda, Clara Duval, Idris Bako";
                Genre1="Action, Adventure, Survival";

                break;
        }
        if (TitleImage != null) {
            TitleImage.setImage(image);
            if (imageMovie == 1)
            {
                TitleImage.setFitWidth(390);
                TitleImage.setFitHeight(564);
            }
            else {

                TitleImage.setFitWidth(438.05);
                TitleImage.setFitHeight(554);
                }
        }



        Director.setText(Director1);
        Stars.setText(Stars1);
        Genre.setText(Genre1);




    }



    @FXML
    private ImageView validationImage;

    private Button selectedButtonsTime;
    private final Image successImage = new Image(getClass().getResource("/com/example/ergasia6/img/successImage.png").toExternalForm());
    private final Image errorImage = new Image(getClass().getResource("/com/example/ergasia6/img/ErrorImage.png").toExternalForm());





   private boolean flag = true;




    private int activeButtonsSize;
    private Button selectedButtonsDay;

    public void setActiveButtonsSize(int size) {
        this.activeButtonsSize = size;

        if (activeButtonsLabel != null) {
            activeButtonsLabel.setText("8€ x " + activeButtonsSize+"="+activeButtonsSize*8+"€");
        }
    }



    @FXML
    private Label activeButtonsLabel; // Label από το FXML



    @FXML
 public void initialize()
 {
     buttonImageViewBack.setImage(hoverImage);
     buttonImageViewBack.setFitWidth(605.0);
     buttonImageViewBack.setFitHeight(97.0);

 }

    @FXML
    public void ButtonSceneChangeBack(MouseEvent event) {
        buttonImageViewBack.setImage(defaultImage);
        // Εικόνα για hover
    }

    @FXML
    private void validateInput() {
        String name = nameField.getText().trim();
        String lastName = lastNameField.getText().trim();
        String email = emailField.getText().trim();

        // Validate name
        if (!isValidName(name)) {
            validationImage.setImage(errorImage); // Show error image
            //showAlert("Error", "Invalid Name. Name must be alphabetic and up to 25 characters.");
            return;
        }

        // Validate last name
        if (!isValidName(lastName)) {
            validationImage.setImage(errorImage); // Show error image
            //showAlert("Error", "Invalid Last Name! Last Name must be alphabetic and up to 25 characters.");
            return;
        }

        // Validate email
        if (!isValidEmail(email)) {
            validationImage.setImage(errorImage); // Show error image
            //showAlert("Error", "Invalid Email! Please use a valid email address ending in '@gmail.com', '@yahoo.com', etc.");
            return;
        }


        validationImage.setImage(successImage); // Show success image

    }



    private boolean isValidName(String input) {
        return input.matches("[\\p{L} '-]{1,25}");
    }

    private boolean isValidEmail(String email) {
        return email.matches("^[\\w.+-]+@[\\w-]+\\.[a-zA-Z]{2,}$");
    }





    public void setSelectedButtons(Set<Button> selectedButtons) {
        this.selectedButtons = selectedButtons;
    }





    @FXML
    public void ResetButtonImageBack(MouseEvent event) {
        buttonImageViewBack.setImage(hoverImage);
        // Επαναφορά στην αρχική εικόνα
    }
    @FXML
    public void SwitchToScene1(ActionEvent event) throws IOException {
        // Φορτώνουμε τη σκηνή 1 και παίρνουμε τον controller
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/ergasia6/hello-view.fxml"));
        Parent root = loader.load(); // Φορτώνουμε το root στοιχείο
        Scene scene = new Scene(root);
        HelloController helloController = loader.getController();
        helloController.setMovieImageAndLabels(imageMovieCode);
        helloController.setImageMoviePhoto();// Αποκτούμε τον controller της σκηνής 1

        // Στέλνουμε τις επιλεγμένες θέσεις από τη σκηνή 2 πίσω στη σκηνή 1
        //helloController.updateButtonsSeat();

        // Μετάβαση στη σκηνή 1
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void resetFields() {
        // Καθαρίζει τα TextField
        nameField.clear();
        lastNameField.clear();
        emailField.clear();

        /*// Αφαιρεί την εικόνα από το ImageView
        validationImage.setImage(null);*/
    }

    @FXML
    public void onContinueButtonClick(ActionEvent event) throws IOException {
        validateInput();

        if (validationImage.getImage() == errorImage) {
            return;
        }

        PauseTransition pause = new PauseTransition(Duration.seconds(5)); // Προαιρετική καθυστέρηση
        pause.setOnFinished(e -> {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/ergasia6/hello-view.fxml"));
                Parent root = loader.load();
                HelloController helloController = loader.getController();

                // Ενημέρωση των επιλεγμένων κουμπιών στην σκηνή 1

                helloController.SetSelectedButtonsAndTime(selectedButtons, selectedButtonsDay, flag,selectedButtonsTime);
                helloController.setMovieImageAndLabels(imageMovieCode);
                helloController.setMoviePhotoFromScene2(imageMovieCode);
                helloController.setImageMoviePhoto();


                // Επιστροφή στη σκηνή 1
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        pause.play();

    }
    public Set<Button> getSelectedButtons() {
        return selectedButtons; // Επιστρέφει το σύνολο των κουμπιών που παραμένουν ενεργά
    }

    public void setSelectedButtonDay(Button clickedButtonDay) {
        this.selectedButtonsDay = clickedButtonDay;

    }

    public void setSelectedButtonsTime(Button clickedButtonTime) {
        this.selectedButtonsTime = clickedButtonTime;
    }
}
