package aragon.unam.mx.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Labeled;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

public class FormularioController extends BaseController implements Initializable {
	private String mensajes = "";
	@FXML
	private ToggleGroup grupoSexo;
	@FXML
	private ToggleGroup regimen;
	@FXML
	private ComboBox<String> cbbEstado;
	@FXML
	private DatePicker dtpFechaNacimiento;
	@FXML
	private ComboBox<String> cbbGradoEstudio;
	@FXML
	private ComboBox<String> cbbNacionalidad;
	@FXML
	private ComboBox<String> cbbPaisNacimiento;
	@FXML
	private ComboBox<Integer> cbbPlazoMeses;
	@FXML
	private RadioButton rdbAsalariado;
	@FXML
	private RadioButton rbdFamiliares;
	@FXML
	private RadioButton rdbFeminino;
	@FXML
	private RadioButton rdbHipotecada;
	@FXML
	private RadioButton rbdHonorarios;
	@FXML
	private RadioButton rdbMasculino;
	@FXML
	private RadioButton rbdPropia;
	@FXML
	private RadioButton rbdRentada;
	@FXML
	private DatePicker dtpFechaSolicitud;
	@FXML
	private TextField txtAnosResidencia;
	@FXML
	private TextField txtApellidoMaterno;
	@FXML
	private TextField txtApellidoPaterno;
	@FXML
	private TextField txtCP;
	@FXML
	private TextField txtCURP;
	@FXML
	private TextField txtCiudad;
	@FXML
	private TextField txtColMunDem;
	@FXML
	private TextField txtColonia;
	@FXML
	private TextField txtDomicilio;
	@FXML
	private TextField txtMontoSolicitar;
	@FXML
	private TextField txtNombre;
	@FXML
	private TextField txtNumCliente;
	@FXML
	private TextField txtNumFolio;
	@FXML
	private TextField txtNumTrabajador;
	@FXML
	private TextField txtRFC;
	@FXML
	private TextField txtTelefonoCasa;
	@FXML
	private TextField txtTelefonoCelular;
	@FXML
	private ToggleGroup propiedad;
	@FXML
	private RadioButton rdbCasado;
	@FXML
	private RadioButton rdbDivorciado;
	@FXML
	private RadioButton rdbFamiliares;
	@FXML
	private RadioButton rdbHonorarios;
	@FXML
	private RadioButton rdbPropia;
	@FXML
	private RadioButton rdbRentada;
	@FXML
	private RadioButton rdbSeparacionBienes;
	@FXML
	private RadioButton rdbSociedadConyugal;
	@FXML
	private RadioButton rdbSoltero;
	@FXML
	private RadioButton rdbUnionLibre;
	@FXML
	private Button btnVerificar;

	@FXML
	void accionVerificar(ActionEvent event) {
		if (this.verificar() && verificacion) {
			System.out.println("Valido");
		} else {
			this.mensajes += "Ningun campo debe estar en rojo";
			this.ventanaEmergente("Datos no validos", "Por favor valida la informaci�n,", mensajes);
			this.mensajes = "";
		}
	}

	@SuppressWarnings("unused")

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.cbbPlazoMeses.getItems().addAll(12, 18, 24, 32);
		this.cbbPaisNacimiento.getItems().addAll("M�xico", "Canada", "Estados Unidos");
		this.cbbNacionalidad.getItems().addAll("Mexicana", "Canadiense", "Estadounidense");
		this.cbbGradoEstudio.getItems().addAll("Primaria", "Secundaria", "Nivel Medio Superior", "Nivel Superior");
		this.cbbEstado.getItems().addAll("Aguascalientes", "Baja California", "Baja California Sur", "Campeche","Ciudad de M�xico","Coahuila","Colima", "Chiapas", 
				"Chihuahua", "Durango", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Estado de M�xico", "Michoac�n", "Morelos", "Nayarit", "Nuevo Le�n", "Oaxaca", 
				"Puebla", "Quer�taro", "Quintana Roo", "San Luis Potos�", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucat�n", "Zacatecas");

		// verificando cada campo
		this.verificarEntrada(txtNumFolio, TipoError.FOLIO); 
		
		// Un detector de cambios para rastrear la selecci�n en el grupo
		this.grupoSexo.selectedToggleProperty()
				.addListener((ObservableValue<? extends Toggle> observable, Toggle oldBtn, Toggle newBtn) -> {
					String etiqueta = "";
					if (newBtn != null) {
						etiqueta = ((Labeled) newBtn).getText();
						System.out.println(etiqueta);
					}
				});
	}

	private boolean verificar() {
		boolean valido = true;
		if (this.txtNumFolio.getText() == null || this.txtNumFolio.getText().trim().isEmpty()) {
			valido = false;
			this.mensajes += "N�mero de folio no valido\n";
		}
		if (this.cbbPlazoMeses.getSelectionModel().getSelectedIndex() == -1) {
			valido = false;
			this.mensajes += "Seleccione un plazo\n";
		}
		if (!this.rdbFeminino.isSelected() && !this.rdbMasculino.isSelected()) {
			valido = false;
			this.mensajes += "Seleccione un sexo\n";
		}
		if (this.rdbHonorarios==null && !this.rdbHonorarios.isSelected()) {
			valido = false;
			this.mensajes += "Seleccione un r�gimen\n";
		}
		return valido;
	}
}
