package com.spring03.spring03.dto;

import com.spring03.spring03.model.Veiculo;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VeiculoDTO implements Serializable {
    private String brand;
    private String model;
//    private Date manufacturingDate;
//    private double numberOfKilometers;
//    private int doors;
//    private double price;
//    private String currency;
//    private int countOfOwners;

    public VeiculoDTO(Veiculo veiculo) {
        this.brand = veiculo.getBrand();
        this.model = veiculo.getModel();
//        this.manufacturingDate = veiculo.getManufacturingDate();
//        this.numberOfKilometers = veiculo.getNumberOfKilometers();
//        this.doors = veiculo.getDoors();
//        this.price = veiculo.getPrice();
//        this.currency = veiculo.getCurrency();
//        this.countOfOwners = veiculo.getCountOfOwners();
    }

    public static List<VeiculoDTO> convertDto(List<Veiculo> veiculos) {
        return veiculos.stream().map(VeiculoDTO::new).collect(Collectors.toList());
    }
}
