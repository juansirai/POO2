package practicaOO2.ejercicio13;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class FormatterUpper extends Formatter{

	@Override
	public String format(LogRecord record) {
		// TODO Auto-generated method stub
		return super.formatMessage(record).toUpperCase();
	}

}
