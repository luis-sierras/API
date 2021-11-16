package cat.itb.sldproject.apirest.sldproject.model.repositoris;

import cat.itb.sldproject.apirest.sldproject.model.entitats.Item;
import cat.itb.sldproject.apirest.sldproject.model.entitats.Lista;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoriItem extends JpaRepository<Item, Long > {
    //hu5 - todos items lista concreta
    //List<Item> findById_Lista(Lista id_Lista);
    //hu6 - item concreto lista concreta
    //Item findByidAndId_Lista(Long id, Lista idLista);

}
