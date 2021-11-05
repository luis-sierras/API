package cat.itb.sldproject.apirest.sldproject.model.repositoris;


import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoriItems extends JpaRepository<AbstractReadWriteAccess.Item, String > {

}
