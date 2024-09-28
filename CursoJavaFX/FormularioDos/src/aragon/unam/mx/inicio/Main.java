package aragon.unam.mx.inicio;
	
import javafx.application.Application;
import javafx.stage.Screen;
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
	}


	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("/aragon/unam/mx/fxml/Inicio.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("/aragon/unam/mx/css/application.css").toExternalForm());
			primaryStage.setX(Screen.getPrimary().getVisualBounds().getMaxX()+300);
			primaryStage.setScene(scene);
			primaryStage.show();
			String nombre=Thread.currentThread().getName();
			System.out.println("Start: "+ nombre);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
		@Override
	public void stop() throws Exception {
			String nombre=Thread.currentThread().getName();
			System.out.println("Stop: "+ nombre);
	}


	public static void main(String[] args) {
		 launch(args);
	}
}
