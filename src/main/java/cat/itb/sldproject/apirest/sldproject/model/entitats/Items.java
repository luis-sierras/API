package cat.itb.sldproject.apirest.sldproject.model.entitats;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class Items {
    @Id
    private String id;
    private String Item;
    private boolean hecho;
    private long orden;

    public String getId() {
        return id;
    }
}
