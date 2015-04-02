/**
 * 
 */
package mx.oiga.repositories;

import java.util.List;

import mx.oiga.model.entities.Person;


/**
 * @author jaime.renato
 *
 */
public interface PersonRepository {

	/**
	 * @return
	 */
	List<Person> findAll();

}
