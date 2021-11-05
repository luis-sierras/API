package cat.itb.sldproject.apirest.sldproject.model.repositoris;

import cat.itb.sldproject.apirest.sldproject.model.entitats.Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoriItems extends JpaRepository<Items, String > {

}
