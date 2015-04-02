package mx.oiga.api.graph.rest;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import mx.oiga.api.graph.rest.response.PeopleResponse;
import mx.oiga.api.graph.rest.response.BaseResponse;
import mx.oiga.model.entities.Person;
import mx.oiga.repositories.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("person")
public class PersonResource {
	
	@Autowired
	private PersonRepository repository;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public PeopleResponse getPeople(){
		PeopleResponse response = new PeopleResponse();
		List<Person> people = repository.findAll();
		for(Person p:people){
			response.getResponse().add(p);
		}
		response.getMeta().put("code", HttpServletResponse.SC_OK);
		return response;
	}
	
	@GET
	@Path("holaMundo")
	public String holaMundo(){
		return "Hola mundo";
	}
	
}
