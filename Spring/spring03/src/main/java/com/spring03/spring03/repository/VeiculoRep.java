package com.spring03.spring03.repository;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.spring03.spring03.dto.VeiculoDTO;
import com.spring03.spring03.model.Veiculo;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

@Repository
public class VeiculoRep {
    private final String veiculoDataBase = "src/main/resources/veiculos.json";
    ObjectMapper mapper = new ObjectMapper();

    public Optional<Veiculo> getById(int id) {
        return getAll().stream().filter(v -> v.getId() == id).findFirst();
    }

    public List<Veiculo> getByPrice(double since, double to) {
        return getAll().stream().filter(v -> v.getPrice() >= since && v.getPrice() <= to).collect(Collectors.toList());
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public List<Veiculo> getByManufacturingDate(Date since, Date to) {

        return null;
    }

    public void saveVeiculo(Veiculo novoVeiculo) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

        List<Veiculo> veiculos = getAll();

        veiculos = new ArrayList<>(veiculos);

        veiculos.add(novoVeiculo);

        try {
            writer.writeValue(new File(veiculoDataBase), veiculos);
        } catch (Exception ex) {
            System.out.println("Erro ao gravar o arquivo.");
        }
    }

    public List<Veiculo> getAll() {
        List<Veiculo> veiculos = null;
        try {
            veiculos = Arrays.asList(mapper.readValue(new File(veiculoDataBase), Veiculo[].class));
        } catch (Exception ex) {

        }
        return veiculos;
    }
}
