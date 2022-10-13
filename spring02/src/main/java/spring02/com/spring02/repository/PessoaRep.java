package spring02.com.spring02.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Repository;
import spring02.com.spring02.model.Pessoa;

import java.util.List;

@Repository
@Data
@AllArgsConstructor
public class PessoaRep {
    private List<Pessoa> pessoaList;

    public void save(Pessoa pessoa) {
        this.pessoaList.add(pessoa);
    }
}
