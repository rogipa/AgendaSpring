package br.edu.ifba.agendaspring.resources;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifba.agendaspring.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria c = new Categoria(1,"Clientes Vips");
		Categoria c1 = new Categoria(2, "Clientes ativos");
		
		List<Categoria> lista = new ArrayList<Categoria>();
		lista.add(c);
		lista.add(c1);
		return lista;
		
	}

}
