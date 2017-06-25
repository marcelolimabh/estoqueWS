package br.com.caelum.estoque.ws;

import javax.xml.ws.Endpoint;

/**
 * 
 * @author marcelolimabh
 *
 */

public class PublicaEstoqueWS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EstoqueWS implementacaoWS = new EstoqueWS();
		RelatorioServiceWS relatorioWS = new RelatorioServiceWS();
		String URL = "http://localhost:8080/estoqueWS";
		String URL_RELATORIO = "http://localhost:8080/relatorioWS";

		
		System.out.println("Estoque WS rodadndo: " + URL);
		
		Endpoint.publish(URL, implementacaoWS);
		System.out.println("Relatorio Rodando : " + URL_RELATORIO);
		Endpoint.publish(URL_RELATORIO, relatorioWS);
		
		
		

	}

}
