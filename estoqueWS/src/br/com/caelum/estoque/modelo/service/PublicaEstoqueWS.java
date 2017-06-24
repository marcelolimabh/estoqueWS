package br.com.caelum.estoque.modelo.service;

import javax.xml.ws.Endpoint;

/**
 * 
 * @author marcelolimabh
 *
 */

public class PublicaEstoqueWS {

	public static void main(String[] args) {
		
		EstoqueWS implementacaoWS = new EstoqueWS();
		String URL = "http://localhost:8080/estoqueWS";
		
		System.out.println("Estoque WS rodadndo: " + URL);
		
		Endpoint.publish(URL, implementacaoWS);

	}

}
