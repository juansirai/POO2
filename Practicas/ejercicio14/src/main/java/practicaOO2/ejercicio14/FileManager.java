package practicaOO2.ejercicio14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileManager {
	private List<FileOO2> archivos;
	
	public FileManager() {
		this.archivos = new ArrayList<FileOO2>();
	}
	
	public void agregarArchivo(FileOO2 a) {
		this.archivos.add(a);
	}
	
	public String pretyPrint() {
		return this.archivos.stream()
				.map(a -> a.pretyPrint())
				.collect(Collectors.joining("\n"));
	}
	
	public void configurarImpresion() {}; //TODO: preguntar como se haría

}
