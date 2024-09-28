package aragon.unam.mx.repositorio;
import java.util.ArrayList; 
import java.util.HashMap; 
import java.util.List; 
import java.util.Map; 
import aragon.unam.mx.modelo.Estudiante; 
import aragon.unam.mx.modelo.Materia;

public class BaseDeDatos {
	public static Map<String,List<Estudiante>> carreras=new HashMap<>(); 
	static { 
		List<Estudiante> estudiantes=new ArrayList<>(); 
		Estudiante est=new Estudiante("123","Rosa",20); 
		est.setMaterias(new Materia("Cálculo",9),new Materia("Programación",10), 
				new Materia("Lógica",10)); 
		
		estudiantes.add(est); est=new Estudiante("124","Tomas",22); 
		est.setMaterias(new Materia("Programación",10), 
				new Materia("Lógica",10)); 
		
		estudiantes.add(est); 
		carreras.put("ico",estudiantes); 
		
		////////////////////////////////// 
		estudiantes=new ArrayList<>(); 
		est=new Estudiante("125","Mario",20); 
		est.setMaterias(new Materia("Cálculo",9),new Materia("Circuitos Lógicos",10), 
				new Materia("Lógica de Autómatas",10)); 
		
		estudiantes.add(est); est=new Estudiante("126","Esmeralda",22); 
		est.setMaterias(new Materia("Circuitos Lógicos",10), 
				new Materia("Lógica de Autómatas",10)); 
		
		estudiantes.add(est); 
		carreras.put("ime", estudiantes); }
	}