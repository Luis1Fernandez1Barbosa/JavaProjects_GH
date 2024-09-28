package aragon.unam.mx.controlador;

import java.net.URL;
import java.util.ResourceBundle;

import aragon.unam.mx.modelo.Persona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.css.PseudoClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.util.Callback;
import javafx.util.converter.FloatStringConverter;

public class TablaGUIController implements Initializable {
	private ObservableList<Persona> datos = FXCollections.observableArrayList();

	@FXML
	private Button btnAlmacenar;

	@FXML
	private TableColumn<Persona, String> tbcAccion;

	@FXML
	private TableColumn<Persona, String> tbcNombre;

	@FXML
	private TableColumn<Persona, Float> tbcSalario;

	@FXML
	private TableView<Persona> tbwTabla;

	@FXML
	private TextField txtSalario;

	@FXML
	private TextField txtNombre;

	@FXML
	void accionAlmacenar(ActionEvent event) {
		Persona captura = new Persona();
		captura.nombreProperty().set(txtNombre.getText());
		captura.salarioProperty().set(Float.parseFloat(txtSalario.getText()));
		datos.add(captura);
		this.limpiar();
	}

	private void limpiar() {
		this.txtNombre.clear();
		this.txtSalario.clear();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		this.tbcNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
		this.tbcNombre.setCellFactory(TextFieldTableCell.forTableColumn());
		this.tbcNombre.setOnEditCommit(t -> {
			((Persona) t.getTableView().getItems().get(t.getTablePosition().getRow())).nombreProperty()
					.set(t.getNewValue());
		});

		this.tbcSalario.setCellValueFactory(new PropertyValueFactory<>("salario"));
		this.tbcSalario.setCellFactory(TextFieldTableCell.forTableColumn(new FloatStringConverter()));
		this.tbcSalario.setOnEditCommit(t -> {			
			((Persona) t.getTableView().getItems().get(t.getTablePosition().getRow())).salarioProperty()
					.set(t.getNewValue());			
			this.tbwTabla.refresh();
		});
		this.tbwTabla.setRowFactory(tv -> {
		
			TableRow<Persona> row = new TableRow<>();
			row.itemProperty().addListener((obs, entradaAnterior, entradaActual) -> {
				if (entradaActual != null) {
					row.pseudoClassStateChanged(PseudoClass.getPseudoClass("selected-row"),
							entradaActual.salarioProperty().get() <= 0.0f);
				}
			});
			return row;
		});
		
		Callback<TableColumn<Persona, String>, TableCell<Persona, String>> celda = (
				TableColumn<Persona, String> parametros) -> {
			final TableCell<Persona, String> cel = new TableCell<Persona, String>() {

				@Override
				protected void updateItem(String arg0, boolean arg1) {
					// TODO Auto-generated method stub
					super.updateItem(arg0, arg1);
					if (arg1) {
						setGraphic(null);
						setText(null);
					} else {
						Image img=new Image(getClass().getResourceAsStream("/aragon/unam/mx/recursos/boton.jpg"));
						Button button = new Button();
						button.setGraphic(new ImageView(img));						
						button.setOnMouseClicked((MouseEvent evento) -> {							
							int fila=tbwTabla.getSelectionModel().getSelectedIndex();
							if(fila!=-1) {
								datos.remove(fila);
							}
							
						});
						
						HBox hbox = new HBox(button);
						hbox.setStyle("-fx-alignment:center");
						HBox.setMargin(button, new Insets(2, 2, 0, 3));						
						setGraphic(hbox);
						setText(null);
					}
				}

			};
			return cel;
		};

		this.tbcAccion.setCellFactory(celda);
		this.tbwTabla.setItems(datos);
	}
	
	
}
