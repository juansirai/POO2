package practicaOO2.ejercicio05;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
	
	private boolean tieneElementos() {
		return this.contenido.size()>0;
	}

	@Override
	public Archivo archivoMasGrande() {
		Archivo result = null;
		if(this.tieneElementos()) {
			List<Archivo> sorted = this.contenido.stream()
								.map(c -> c.archivoMasGrande()).collect(Collectors.toList())
					    	    .stream().sorted((a1, a2) -> Integer.compare(a2.archivoMasGrande().getTamanio(), a1.archivoMasGrande().getTamanio()))
					    	    .collect(Collectors.toList());
		
			result = sorted.get(0);
		}
		return result;
	}

	@Override
	public Archivo archivoMasNuevo() {
		Archivo result = null;
		if(this.tieneElementos()) {
			List<Archivo> sorted =  this.contenido.stream()
				                .map(c -> c.archivoMasGrande()).collect(Collectors.toList())
				                .stream().sorted((a1, a2) -> a2.getFecha().compareTo(a1.getFecha()))
				                .collect(Collectors.toList());
			result = sorted.get(0);
		}
		return result;
	}
}
