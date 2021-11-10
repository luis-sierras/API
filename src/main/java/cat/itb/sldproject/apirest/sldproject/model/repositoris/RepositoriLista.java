package cat.itb.sldproject.apirest.sldproject.model.repositoris;

import cat.itb.sldproject.apirest.sldproject.model.entitats.Lista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoriLista extends JpaRepository<Lista, Long > {

}
