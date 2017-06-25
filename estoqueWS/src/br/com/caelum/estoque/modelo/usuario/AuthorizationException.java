/**
 * 
 */
package br.com.caelum.estoque.modelo.usuario;

import java.util.Date;

import javax.xml.ws.WebFault;

import br.com.caelum.estoque.modelo.util.InfoFault;

/**
 * @author marcelolimabh
 *
 */
@WebFault(name="AuthorizationFault")
public class AuthorizationException extends Exception {
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public AuthorizationException(String msg) {
		super(msg);
	}
	
	
	public InfoFault getFaultInfo(){
		
		return new InfoFault("Token Inválido", new Date());
		
	}
	
	


}
