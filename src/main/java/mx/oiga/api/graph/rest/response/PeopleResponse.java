/**
 * 
 */
package mx.oiga.api.graph.rest.response;

import java.util.ArrayList;
import java.util.List;

import mx.oiga.model.entities.Person;

/**
 * @author jaime.renato
 *
 */
public class PeopleResponse extends BaseResponse{
	
	private List<Person> response = new ArrayList<Person>();
	
	
	public List<Person> getResponse() {
		return response;
	}

	public void setResponse(List<Person> response) {
		this.response = response;
	}

}
