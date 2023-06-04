package practicaOO2.ejercicio13;

import java.io.IOException;
import java.io.StringWriter;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class FormatterJson extends Formatter{
	static JSONObject jo = new JSONObject();

	@Override
	public String format(LogRecord record) {	
		jo.put("message", record.getMessage());
		jo.put("level", record.getLevel());
	    return jo.toJSONString();
	}

}
