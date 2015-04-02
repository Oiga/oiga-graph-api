/**
 * 
 */
package mx.oiga.repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import mx.oiga.model.entities.Person;
import mx.oiga.repositories.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * @author jaime.renato
 *
 */
@Repository
public class PersonRepositoryJDBCImpl extends JdbcDaoSupport implements
		PersonRepository {

	@Autowired
	PersonRepositoryJDBCImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public List<Person> findAll() {
		List<Person> query = getJdbcTemplate().query(
				"MATCH (n:Person) RETURN n.name as name, n.from as from", new RowMapper<Person>(){

					@Override
					public Person mapRow(ResultSet rs, int num)
							throws SQLException {
						Person p = new Person();
						p.setName(rs.getString("name"));
						p.setFrom(rs.getString("from"));
						return p;
					}
					
				});
		
		return query;
	}
}
