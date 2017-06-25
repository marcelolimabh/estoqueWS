/**
 * 
 */
package br.com.caelum.estoque.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.ResponseWrapper;

import br.com.caelum.estoque.modelo.item.Filtro;
import br.com.caelum.estoque.modelo.item.Filtros;
import br.com.caelum.estoque.modelo.item.Item;
import br.com.caelum.estoque.modelo.item.ItemDao;
import br.com.caelum.estoque.modelo.item.ItemValidador;
import br.com.caelum.estoque.modelo.item.ListaItens;
import br.com.caelum.estoque.modelo.usuario.AuthorizationException;
import br.com.caelum.estoque.modelo.usuario.TokenDao;
import br.com.caelum.estoque.modelo.usuario.TokenUsuario;

/**
 * @author marcelolimabh
 *
 */
@WebService
public class EstoqueWS {

	private ItemDao dao = new ItemDao();

	@WebMethod(operationName="todosOsItens")
	@ResponseWrapper(localName="itens")
	@WebResult(name="itens")
    public ListaItens getItens(@WebParam(name="filtros")Filtros filtros) {
		
		List<Filtro> lista = filtros.getLista();
		List<Item> itens = dao.todosItens(lista);

        System.out.println("Chamando getItens()");
        return new ListaItens(itens);
    }
	
	@WebMethod(operationName="cadsdtrarItens")
	@WebResult(name="item")
	public Item saveItem(@WebParam(name="tokenUsuario", header=true) TokenUsuario token, @WebParam(name="item")Item item) throws AuthorizationException{
		
		
		System.out.println("Cadastrando item => Token: "+ token + "Item:" + item);
		boolean tokenValido = new TokenDao().ehValido(token);
		if(!tokenValido){
			 throw new AuthorizationException("Token Inválido");
		}
		
		new ItemValidador(item).validate();
		
		this.dao.cadastrar(item);
		
		return item;
		
	}

}
