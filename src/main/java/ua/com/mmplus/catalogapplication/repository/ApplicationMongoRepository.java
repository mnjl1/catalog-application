package ua.com.mmplus.catalogapplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.com.mmplus.catalogapplication.domain.model.Application;

@Repository
public interface ApplicationMongoRepository extends CrudRepository<Application, Long> {
	 
}
