package practicaOO2.ejercicio05;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Directorio extends FileSystem{
	private List<FileSystem> contenido;
	
	
	public Directorio(String nombre, LocalDate fecha) {
		super(nombre, fecha);
		this.tamanio = 32;
		this.contenido = new ArrayList<FileSystem>();
	}
	
	
	public List<FileSystem> getContenido(){
		return this.contenido;
	}
	
	public void agregar(FileSystem f) {
		this.contenido.add(f);
	}

	@Override
	public int tamanioTotalOcupado() {
		
		return this.getTamanio() + this.contenido.stream()
									.mapToInt(c -> c.tamanioTotalOcupado()).sum();
	}

	@Override
	public Archivo archivoMasGrande() {
		List<Archivo> sorted = this.contenido.stream()
					    	    .map(c -> c.archivoMasGrande()).collect(Collectors.toList())
					    	    .stream().sorted((a1, a2) -> Integer.compare(a2.archivoMasGrande().getTamanio(), a1.archivoMasGrande().getTamanio()))
					    	    .collect(Collectors.toList());
		Archivo result = sorted.get(0);
		return null;
	}

	@Override
	public Archivo archivoMasNuevo() {
		// TODO Auto-generated method stub
		return null;
	}
}
