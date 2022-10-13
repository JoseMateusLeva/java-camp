package spring02.com.spring02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring02.com.spring02.model.Sintoma;
import spring02.com.spring02.repository.SintomaRep;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SintomaService {

    @Autowired
    private SintomaRep sintomaRepository;

    public void salvar(Sintoma sintoma) {
        sintomaRepository.save(sintoma);
    }

    public List<Sintoma> getAll() {
        return new ArrayList<>(sintomaRepository.getSintomaList());
    }

    public Optional<Sintoma> getSintomaNome(String name) {
        return sintomaRepository.getSintomaList().stream().filter(s -> s.getNome().equals(name)).findFirst();
    }
}
