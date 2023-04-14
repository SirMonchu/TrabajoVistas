package DAM.Programacion.jxml.ProyectoGame1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ProfileController extends MainController {
	
	@FXML
	private AnchorPane Background1;
	
	@FXML
	private Text hello_text;
	
	@FXML
	private Text name_id;
	
    @FXML
    private ToggleButton LightToggler1;
    
    @FXML
    private TextField change_username_field;
    
    @FXML
    private TextField change_password_field;
    
    @FXML
    private TextField addUsernameField;
    
    @FXML
    private TextField addUserpassField;
	
    @FXML
    private Text username_text1;

    @FXML
    private Text password_text1;
    
    @FXML
    private Text usernameAddText;

    @FXML
    private Text passwordAddText;
    
    @FXML
    private Button LogOut_Button;
    
    @FXML
    private Text succeschangename;

    @FXML
    private Text succeschangepass;
    
    @FXML
    private Button ok1;
    
    @FXML
    private Button ok2;
    
    @FXML
    private Button editMode;
    
    @FXML
    private Button addUser;
    
    @FXML
    private Button deleteUser;
    
    @FXML
    private Button editUser;
    
    @FXML
    private Button acceptAdd;

	public void setName(String name) {
	    name_id.setText(name);
	}
	
	public void setPermisons() {
		if (name_id.getText().equals("Admin")) {
			editMode.setDisable(false);
			editMode.setOpacity(1);
		} else {
			editMode.setDisable(true);
			editMode.setOpacity(0);
		}
	}

	@FXML
	private void EditMode() throws IOException {
		if (editMode.getText().equals("Terminar")) {
			editMode.setText("Modo Gestion");
			username_text1.setOpacity(1);
			password_text1.setOpacity(1);
			change_username_field.setOpacity(1);
			change_password_field.setOpacity(1);
			change_username_field.setDisable(false);
			change_password_field.setDisable(false);
			ok1.setOpacity(1);
			ok2.setOpacity(1);
			ok1.setDisable(false);
			ok2.setDisable(false);
		} else {
			editMode.setText("Terminar");
			username_text1.setOpacity(0);
			password_text1.setOpacity(0);
			change_username_field.setOpacity(0);
			change_password_field.setOpacity(0);
			change_username_field.setDisable(true);
			change_password_field.setDisable(true);
			ok1.setOpacity(0);
			ok2.setOpacity(0);
			ok1.setDisable(true);
			ok2.setDisable(true);
			addUser.setDisable(false);
			addUser.setOpacity(1);
			deleteUser.setDisable(false);
			deleteUser.setOpacity(1);
			editUser.setDisable(false);
			editUser.setOpacity(1);
		}
	}
	
	@FXML
	private void ChangeUsername() throws IOException {
		String newname = change_username_field.getText();
		u1.setUsername(newname);
		if (u1.getUsername().equals(newname)) {
			succeschangename.setOpacity(1);
			name_id.setText(newname);
		}
	}
	
	@FXML
	private void ChangePassword() throws IOException {
		String newpass = change_password_field.getText();
		u1.setPassword(newpass);
		if (u1.getPassword().equals(newpass)) {
			succeschangepass.setOpacity(1);
		}
	}
	
	@FXML
	private void backToMain() throws IOException {
	    Stage currentStage = (Stage) LogOut_Button.getScene().getWindow();
	    currentStage.close();
	    FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
	    Parent root = loader.load();
	    Scene secondaryScene = new Scene(root, 640, 480);
	    Stage secondaryStage = new Stage();
	    secondaryStage.setScene(secondaryScene);
	    secondaryStage.setTitle("Perfil de usuario");
	    secondaryStage.show();
	}

	
    @FXML
    private void ToggleLight() throws IOException {
        if (LightToggler1.getText().equals("Light Mode")) {
            LightToggler1.setText("Dark Mode");
            hello_text.setFill(javafx.scene.paint.Color.BLACK);
            username_text1.setFill(javafx.scene.paint.Color.BLACK);
            password_text1.setFill(javafx.scene.paint.Color.BLACK);
            name_id.setFill(javafx.scene.paint.Color.BLACK);
            Background1.setStyle("-fx-background-color: white");
        } else {
        	LightToggler1.setText("Light Mode");
            hello_text.setFill(javafx.scene.paint.Color.WHITE);
            name_id.setFill(javafx.scene.paint.Color.WHITE);
            username_text1.setFill(javafx.scene.paint.Color.WHITE);
            password_text1.setFill(javafx.scene.paint.Color.WHITE);
            Background1.setStyle("-fx-background-color: black");
            usernameAddText.setFill(javafx.scene.paint.Color.WHITE);
            passwordAddText.setFill(javafx.scene.paint.Color.WHITE);
        }

    }
    
    @FXML
    private void addUser() throws IOException {
    	addUser.setOpacity(0);
    	deleteUser.setOpacity(0);
    	editUser.setOpacity(0);
    	addUser.setDisable(true);
    	deleteUser.setDisable(true);
    	editUser.setDisable(true);
    	addUsernameField.setOpacity(1);
    	addUserpassField.setOpacity(1);
    	addUsernameField.setDisable(false);
    	addUserpassField.setDisable(false);
		usernameAddText.setOpacity(1);
		passwordAddText.setOpacity(1);
		acceptAdd.setOpacity(1);
    }
    
    @FXML
    private void UserAdd() throws IOException {
    	 String username = addUsernameField.getText();
    	 String password = addUserpassField.getText();
    	 MainController mainController = new MainController();
    	 mainController.addUser(username, password);
    }
    
    @FXML
    private void deleteUser() throws IOException {
    	
    }
    
    @FXML
    private void editUser() throws IOException {
    	
    }
}
