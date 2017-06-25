/**
 * 
 */
package br.com.caelum.estoque.ws;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author marcelolimabh
 *
 */
@WebService
public class RelatorioServiceWS {

	/**
	 * 
	 */
	
	
	public RelatorioServiceWS() {
		// TODO Auto-generated constructor stub
	}
	
	@Oneway
	@WebMethod(operationName="enviarRelatorio")
	public void gerarRelatorio(){
		
		System.out.println("enviando relatorio!");
		
	}

}
