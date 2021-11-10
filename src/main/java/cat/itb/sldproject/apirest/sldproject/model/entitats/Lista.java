package cat.itb.sldproject.apirest.sldproject.model.entitats;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Lista {
    @Id
    private String id;
    private String name;

    public String getId() {
        return id;
    }
}
