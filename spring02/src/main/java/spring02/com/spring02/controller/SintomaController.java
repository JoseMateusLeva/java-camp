package spring02.com.spring02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring02.com.spring02.dto.SintomaDTO;
import spring02.com.spring02.model.Pessoa;
import spring02.com.spring02.model.Sintoma;
import spring02.com.spring02.service.SintomaService;

import java.util.List;
import java.util.Optional;

@RestController
public class SintomaController {

    @Autowired
    private SintomaService service;

    @PostMapping("/sintoma/salvar")
    public ResponseEntity<Sintoma> save(@RequestBody Sintoma sintoma) {
        service.salvar(sintoma);
        return ResponseEntity.ok(sintoma);
    }

    @GetMapping("/findSymptom")
    public ResponseEntity<List<Sintoma>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/findSymptom/{name}")
    public ResponseEntity<SintomaDTO> getSintomaNome(@PathVariable String name) {
        Optional<Sintoma> sintoma = service.getSintomaNome(name);

        return sintoma.map(value -> new ResponseEntity<>(SintomaDTO.convertToDto(value), HttpStatus.ACCEPTED))
                .orElseGet(() -> new ResponseEntity("Este sintoma Não foi encontrado.", HttpStatus.BAD_REQUEST));
    }
}
