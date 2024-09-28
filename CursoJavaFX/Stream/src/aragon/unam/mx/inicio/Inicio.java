package aragon.unam.mx.inicio;

import java.util.stream.Collectors;

import aragon.unam.mx.repositorio.impl.BaseDeDatosDAOImpl;
import aragon.unam.mx.repositorio.intf.BaseDeDatosDAO;

public class Inicio {
public static void main(String[] args) {
	BaseDeDatosDAO datos=new BaseDeDatosDAOImpl();
	String csv=datos.getEstudiantes("ico").stream()
			.map(alm->alm.getMatricula()+"; "+ (alm.getMaterias().stream()
					.map(mat->(mat.getNombre()+"; "+ mat.getCreditos()))
					.collect(Collectors.joining("; ")))+"; "+alm.getNombre())
			.collect(Collectors.joining("\n"));
			System.out.println(csv);
}
}