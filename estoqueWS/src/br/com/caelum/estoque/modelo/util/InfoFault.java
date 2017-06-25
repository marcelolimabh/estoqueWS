/**
 * 
 */
package br.com.caelum.estoque.modelo.util;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * @author marcelolimabh
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class InfoFault {
	
	private String msg;
	
	private Date dateError;
	
	
	public InfoFault(String msg, Date dateError){
		this.setMsg(msg);
		this.setDateError(dateError);
	}

	/**
	 * Construtor default para o JAX-B
	 */
	public InfoFault() {
		// TODO Auto-generated constructor stub
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Date getDateError() {
		return dateError;
	}

	public void setDateError(Date dateError) {
		this.dateError = dateError;
	}

}
