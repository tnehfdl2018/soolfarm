package itc.hoseo.soolfarm.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class StringDateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date rslt = null;
		
		try {
			rslt = sdf.parse(source);
		}catch(ParseException pe) {
			throw new RuntimeException(pe);
		}
		
		return rslt;
	}

}
