package br.com.todospodemprogramar.app.repository;
import org.springframework.data.repository.CrudRepository;

import br.com.todospodemprogramar.app.model.User;
/**
 * Created by Natalia Rosa on 08/07/19.
 */
public interface UserRepository extends CrudRepository<User, Integer> {	
	
	public User findByUsernameAndPassword(String username, String password);
	
	public User findByUsername(String username);
}
