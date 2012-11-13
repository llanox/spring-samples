package co.com.movilventas.restful.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import co.com.movilventas.model.Client;



@Controller
@RequestMapping(value = "/clients")
public class ClientController {
	
	
	@RequestMapping(value = "/vendor/{login}", method = RequestMethod.GET)
	public @ResponseBody
	List<Client> getAllElements(@PathVariable String login) {
		

		
		List<Client> listaClients = new ArrayList<Client>();
		Client client= new Client();
		client.setName("JuanGa");
		client.setMobile("312345786");
		listaClients.add(client);

		return listaClients;
	}

}

