package Spring.spring02.com.spring02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Spring.spring02.com.spring02.model.Pessoa;
import Spring.spring02.com.spring02.repository.PessoaRep;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PessoaService {

    @Autowired
    private PessoaRep pessoaRepository;

    public void salvar(Pessoa pessoa) {
        pessoaRepository.save(pessoa);
    }

    public List<Pessoa> getRiskPerson() {
        return pessoaRepository.getPessoaList().stream().filter(p -> p.getIdade() > 60).collect(Collectors.toList());
    }

    public List<Pessoa> getAll() {
        return new ArrayList<>(pessoaRepository.getPessoaList());
    }
}
