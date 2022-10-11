package com.spring03.spring03.service;

import com.spring03.spring03.dto.VeiculoDTO;
import com.spring03.spring03.model.Veiculo;
import com.spring03.spring03.repository.VeiculoRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService implements IVeiculo {
    @Autowired
    private VeiculoRep repo;

    @Override
    public void save(Veiculo veiculo) {
        repo.saveVeiculo(veiculo);
    }

    @Override
    public List<VeiculoDTO> getAllVeiculo() {
        return VeiculoDTO.convertDto(repo.getAll());
    }

    @Override
    public List<VeiculoDTO> getAllByManufacturingDate(Date since, Date to) {
        return VeiculoDTO.convertDto(repo.getByManufacturingDate(since, to));
    }

    @Override
    public List<VeiculoDTO> getAllByPrice(double since, double to) {
        return VeiculoDTO.convertDto(repo.getByPrice(since, to));
    }

    @Override
    public Optional<Veiculo> getById(int id) {
        return repo.getById(id);
    }
}
