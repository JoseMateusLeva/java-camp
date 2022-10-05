package com.spring03.spring03.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Veiculo {
    private int id;
    private String brand;
    private String model;

    @JsonFormat(pattern = "YYYY-MM-dd")
    private Date manufacturingDate;

    private double numberOfKilometers;
    private int doors;
    private double price;
    private String currency;
    private int countOfOwners;
    private List<VeiculoService> services;

    public void addServices(VeiculoService service) {
        if (services == null) {
            services = new ArrayList<>();
        }
        services.add(service);
    }
}
