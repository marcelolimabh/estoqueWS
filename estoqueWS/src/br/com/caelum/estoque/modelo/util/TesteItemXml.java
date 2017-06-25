package br.com.caelum.estoque.modelo.util;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import br.com.caelum.estoque.modelo.item.Item;

public class TesteItemXml {

	public TesteItemXml() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Item item = new Item.Builder().comCodigo("AAC").comNome("TESTE MARCECLO").comQuantidade(5).comTipo("teste").build();
		try {
			JAXBContext context = JAXBContext.newInstance(Item.class);
			Marshaller maeshaller = context.createMarshaller();
			maeshaller.marshal(item, new File("item.xml"));
			
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Item item2 = (Item) unmarshaller.unmarshal(new File("item.xml"));
			System.out.println(item2);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
