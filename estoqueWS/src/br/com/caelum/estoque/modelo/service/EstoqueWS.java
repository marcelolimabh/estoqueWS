/**
 * 
 */
package br.com.caelum.estoque.modelo.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.caelum.estoque.modelo.item.Item;
import br.com.caelum.estoque.modelo.item.ItemDao;
import br.com.caelum.estoque.modelo.item.ListaItens;

/**
 * @author marcelolimabh
 *
 */
@WebService
public class EstoqueWS {

	private ItemDao dao = new ItemDao();

	@WebResult(name="itens")
	@WebMethod(operationName="allItens")
    public ListaItens getItens() {

        System.out.println("Chamando getItens()");
        return new ListaItens(dao.todosItens());
    }

}
