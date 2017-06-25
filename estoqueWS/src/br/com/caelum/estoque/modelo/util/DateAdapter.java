/**
 * 
 */
package br.com.caelum.estoque.modelo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * @author marcelolimabh
 *
 */
public class DateAdapter extends XmlAdapter<String, Date> {
	
	String pattern = "dd/MM/yyyy";

	/**
	 * 
	 */
	public DateAdapter() {
		// TODO Auto-generated constructor stub
	}


	

	/* (non-Javadoc)
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
	 */
	@Override
	public String marshal(Date date) throws Exception {
		
		return new SimpleDateFormat(pattern).format(date);
	}

	@Override
	public Date unmarshal(String dataString) throws Exception {
		
		return new SimpleDateFormat(pattern).parse(dataString);
	}


}
