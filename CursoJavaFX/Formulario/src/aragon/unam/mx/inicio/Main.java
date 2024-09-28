package aragon.unam.mx.inicio;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

public class Main extends Application {

	public Main() {
		String nombre=Thread.currentThread().getName();
		System.out.println("Constructor: "+ nombre);
	}
	
	@Override
	public void init() throws Exception {
		String nombre=Thread.currentThread().getName();
		System.out.println("Init: "+ nombre);
		// TODO Auto-generated method stub
		super.init();
	}
	
	@Override
	public void stop() throws Exception {
		String nombre=Thread.currentThread().getName();
		System.out.println("Stop: "+ nombre);
		// TODO Auto-generated method stub
		super.stop();
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("/aragon/unam/mx/fxml/Inicio.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/aragon/unam/mx/css/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			String nombre=Thread.currentThread().getName();
			System.out.println("Start: "+ nombre);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}