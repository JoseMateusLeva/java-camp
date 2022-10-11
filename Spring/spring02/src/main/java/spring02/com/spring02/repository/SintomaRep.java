package Spring.spring02.com.spring02.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Repository;
import Spring.spring02.com.spring02.model.Sintoma;

import java.util.List;

@Repository
@Data
@AllArgsConstructor
public class SintomaRep {
    private List<Sintoma> sintomaList;

    public void save(Sintoma sintoma) {
        this.sintomaList.add(sintoma);
    }
}
