package com.spring03.spring03.controller;

import com.spring03.spring03.dto.VeiculoDTO;
import com.spring03.spring03.model.Veiculo;
import com.spring03.spring03.service.IVeiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class VeiculoControler {

    @Autowired
    private IVeiculo service;

    @GetMapping("v1/api/veiculos/{id}")
    public ResponseEntity<Optional<Veiculo>> get(@PathVariable int id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }

    @GetMapping(path = "v1/api/veiculos/prices")
    public ResponseEntity<List<VeiculoDTO>> getAllByPrice(@RequestParam double since, @RequestParam double to) {
        return new ResponseEntity<>(service.getAllByPrice(since, to), HttpStatus.OK);
    }

    @GetMapping(path = "v1/api/veiculos/dates")
    public ResponseEntity<List<VeiculoDTO>> getByManufacturingDate(@RequestParam Date since, @RequestParam Date to) {
        return new ResponseEntity<>(service.getAllByManufacturingDate(since, to), HttpStatus.OK);
    }

    @PostMapping("v1/api/veiculos/")
    @ResponseStatus(value = HttpStatus.CREATED, reason = "Veiculo registrado")
    public void add(@RequestBody Veiculo veiculo) {
        service.save(veiculo);
    }

    @GetMapping("v1/api/veiculos/")
    public ResponseEntity<List<VeiculoDTO>> getAll() {
        return new ResponseEntity<>(service.getAllVeiculo(), HttpStatus.OK);
    }
}
