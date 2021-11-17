package cat.itb.sldproject.apirest.sldproject.model.entitats;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Lista")
@RequiredArgsConstructor
@JsonIgnoreProperties(value={"handler","hibernateLazyInitializer", "fieldHandler", "items"})
public class Lista {
    @Id
    @GeneratedValue
    private Long idLista;
    private String listaName;
    @OneToMany(mappedBy = "lista", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Item> items = new ArrayList<>();

    public Long getIdLista() {
        return idLista;
    }

    public void setListaName(String listaName) {
        this.listaName = listaName;
    }
}
