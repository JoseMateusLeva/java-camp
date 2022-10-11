package com.spring03.spring03.service;

import com.spring03.spring03.dto.VeiculoDTO;
import com.spring03.spring03.model.Veiculo;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IVeiculo {
    void save(Veiculo veiculo);

    List<VeiculoDTO> getAllVeiculo();

    List<VeiculoDTO> getAllByManufacturingDate(Date since, Date to);

    List<VeiculoDTO> getAllByPrice(double since, double to);

    Optional<Veiculo> getById(int id);
}
