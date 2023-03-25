package practicaOO2.ejercicio02_b;

import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONsimpleAdapter implements VoorheesExporter{
	
	
	private JSONObject exportar(Socio socio) {
		JSONObject p = new JSONObject();
		if(socio!=null) {
			p.put("Nombre", socio.getNombre());
			p.put("Legajo", socio.getLegajo());
			p.put("Email", socio.getEmail());
		}
		return p;
	}
	
	public String exportar(List<Socio> socios) {
		if(socios.isEmpty()) {
			return "[]";
		}
		JSONArray json = new JSONArray();
		socios.forEach(s -> {
			json.add(exportar(s));
		});
		return json.toString();
	}
	
}
