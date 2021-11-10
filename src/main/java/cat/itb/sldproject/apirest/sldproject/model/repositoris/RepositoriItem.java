package cat.itb.sldproject.apirest.sldproject.model.repositoris;

import cat.itb.sldproject.apirest.sldproject.model.entitats.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoriItem extends JpaRepository<Item, String > {

}
