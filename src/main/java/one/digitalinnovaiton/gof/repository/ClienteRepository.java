package one.digitalinnovaiton.gof.repository;

import one.digitalinnovaiton.gof.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
