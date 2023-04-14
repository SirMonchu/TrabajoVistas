package DAM.Programacion.jxml.ProyectoGame1;

import java.io.IOException;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainController {
	private ArrayList<User> usuarios = new ArrayList<User>();

	User u1 = new User("Paco", "ABC123");
    User u2 = new User("Admin", "admin");
	
    @FXML
    private Button LoginButton;

    @FXML
    private Label login_text;

    @FXML
    private TextField passwordField;

    @FXML
    private TextField usernameField;

    @FXML
    private Text ErrorText;

    @FXML
    private Text username_text;

    @FXML
    private Text password_text;

    @FXML
    private ToggleButton LightToggler;

    @FXML
    private AnchorPane Background;

    @FXML
    private void btnMainValidate() throws IOException {
        if (u1.getUsername().equals(usernameField.getText()) && u1.getPassword().equals(passwordField.getText())) {
        	FXMLLoader loader = new FXMLLoader(getClass().getResource("Perfil.fxml"));
            Parent root = loader.load();
            ProfileController profileController = loader.getController();
            profileController.setName(usernameField.getText());
            Stage currentStage = (Stage) usernameField.getScene().getWindow();
            currentStage.close();
            Scene secondaryScene = new Scene(root, 640, 480);
            Stage secondaryStage = new Stage();
            secondaryStage.setScene(secondaryScene);
            secondaryStage.setTitle("Perfil de usuario");
            secondaryStage.show();
            return;
        } else if (u2.getUsername().equals(usernameField.getText()) && u2.getPassword().equals(passwordField.getText())) {
        	FXMLLoader loader = new FXMLLoader(getClass().getResource("Perfil.fxml"));
            Parent root = loader.load();
            ProfileController profileController = loader.getController();
            profileController.setName(usernameField.getText());
            Stage currentStage = (Stage) usernameField.getScene().getWindow();
            currentStage.close();
            Scene secondaryScene = new Scene(root, 640, 480);
            Stage secondaryStage = new Stage();
            secondaryStage.setScene(secondaryScene);
            secondaryStage.setTitle("Perfil de Administrador");
            secondaryStage.show();
            return;
        } else {
        	ErrorText.setOpacity(1);
        }
    }

    @FXML
    private void ToggleLight() throws IOException {
        if (LightToggler.getText().equals("Light Mode")) {
            LightToggler.setText("Dark Mode");
            login_text.setTextFill(javafx.scene.paint.Color.BLACK);
            username_text.setFill(javafx.scene.paint.Color.BLACK);
            password_text.setFill(javafx.scene.paint.Color.BLACK);
            Background.setStyle("-fx-background-color: white");
        } else {
            LightToggler.setText("Light Mode");
            login_text.setTextFill(javafx.scene.paint.Color.WHITE);
            username_text.setFill(javafx.scene.paint.Color.WHITE);
            password_text.setFill(javafx.scene.paint.Color.WHITE);
            Background.setStyle("-fx-background-color: black");
        }

    }
    public void addUser(String username, String password) {
        User newUser = new User(username, password);
        usuarios.add(newUser);
    }
}
