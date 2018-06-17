package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class OrderParkController {

    @FXML
    private Button casualButton;

    @FXML
    private Button oneTimeButton;

    @FXML
    private Button subscriptionButton;
    
    @FXML
    private Button subscriptionSButton;
    
    @FXML
    private Text casual_price_text;

    @FXML
    private Text on_time_park_price;

    @FXML
    private Text subscription_price_text;


    @FXML
    void CasualButtonClick(MouseEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CasualParkingScene.fxml"));
    	BorderPane root1 = fxmlLoader.load();
    	Stage stage = new Stage();
    	stage.setScene(new Scene(root1));  
    	stage.show();

    }

    @FXML
    void OneParkingButtonClick(MouseEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("OneTimeParkingScene.fxml"));
    	BorderPane root1 = fxmlLoader.load();
    	Stage stage = new Stage();
    	stage.setScene(new Scene(root1));  
    	stage.show();

    }

    @FXML
    void SubscriptionButtonClick(MouseEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SubscriptionParkingScene.fxml"));
    	BorderPane root1 = fxmlLoader.load();
    	Stage stage = new Stage();
    	stage.setScene(new Scene(root1));  
    	stage.show();

    }
    
    @FXML
    void SubscriptionSButtonClick(MouseEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SubscriptionSParkingScene.fxml"));
    	BorderPane root1 = fxmlLoader.load();
    	Stage stage = new Stage();
    	stage.setScene(new Scene(root1));  
    	stage.show();

    }

}