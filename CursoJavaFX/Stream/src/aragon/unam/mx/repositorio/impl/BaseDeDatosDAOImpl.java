package aragon.unam.mx.repositorio.impl;
import java.util.List; 
import aragon.unam.mx.modelo.Estudiante; 
import aragon.unam.mx.repositorio.intf.BaseDeDatosDAO; 
import aragon.unam.mx.repositorio.BaseDeDatos;

public class BaseDeDatosDAOImpl implements BaseDeDatosDAO {
	
	@Override 
	public List<Estudiante> getEstudiantes(String carrera) { 
		return BaseDeDatos.carreras.get(carrera); } 
	
	@Override 
	public Estudiante getEstudiante(String carrera, String matricula) { 
		return BaseDeDatos.carreras.get(carrera) 
				.stream().filter(est->est.getMatricula().equals(matricula)) 
				.findFirst() 
				.get(); }
}
