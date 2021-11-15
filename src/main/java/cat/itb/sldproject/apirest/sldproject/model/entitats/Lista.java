package cat.itb.sldproject.apirest.sldproject.model.entitats;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table()
public class Lista {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_Lista;
    private String listaName;
    @OneToMany(mappedBy = "id_lista", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Item> items;

}
