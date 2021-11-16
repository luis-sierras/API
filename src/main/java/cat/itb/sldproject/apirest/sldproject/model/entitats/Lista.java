package cat.itb.sldproject.apirest.sldproject.model.entitats;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Lista")
@NoArgsConstructor
@JsonIgnoreProperties(value={"handler","hibernateLazyInitializer", "fieldHandler", "items"})

public class Lista {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLista;
    private String listaName;
    @OneToMany(mappedBy = "lista", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Item> items = new ArrayList<>();

    public Lista(String listaName) {
        this.listaName = listaName;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Long getIdLista() {
        return idLista;
    }
}
