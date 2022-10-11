package Spring.spring02.com.spring02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import Spring.spring02.com.spring02.dto.PessoaDTO;
import Spring.spring02.com.spring02.model.Pessoa;
import Spring.spring02.com.spring02.service.PessoaService;

import java.util.List;

@Controller
public class PessoaController {
    @Autowired
    private PessoaService service;

    @PostMapping("/pessoa/salvar")
    public ResponseEntity<Pessoa> save(@RequestBody Pessoa pessoa) {
        service.salvar(pessoa);
        return ResponseEntity.ok(pessoa);
    }

    @GetMapping("/pessoa/all")
    public ResponseEntity<List<PessoaDTO>> getAll() {
        return ResponseEntity.ok(PessoaDTO.convertListToDto(service.getAll()));
    }

    @GetMapping("/findRiskPerson")
    public ResponseEntity<List<PessoaDTO>> getRiskPerson() {
        return ResponseEntity.ok(PessoaDTO.convertListToDto(service.getRiskPerson()));
    }
}