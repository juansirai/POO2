package practicaOO2.ejercicio02_b;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONJacksonAdapter implements VoorheesExporter{
	
	
	public JSONJacksonAdapter() {};
	
	private String exportar(Socio socio)  {
	    ObjectMapper mapper = new ObjectMapper();
	    String socioJSON = null;
		try {
			socioJSON = mapper.writeValueAsString(socio);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    return socioJSON;
	}
	
	public String exportar(List<Socio>socios) {
		if (socios.isEmpty()) {
			return "[]";
		}
		String separator = System.lineSeparator();
		StringBuilder buffer = new StringBuilder("[" + separator);
		socios.forEach(socio -> {
			buffer.append(this.exportar(socio))
				.append(",")
				.append(separator);
		});
		// remueve la última coma y fin de línea
		buffer.setLength(buffer.length() - (separator.length() + 1));
		buffer.append(separator).append("]");
		return buffer.toString();
	}


}
