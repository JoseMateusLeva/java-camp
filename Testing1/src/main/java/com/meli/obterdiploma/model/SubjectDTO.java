package com.meli.obterdiploma.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
public class SubjectDTO {
    @NotBlank(message = "O nome do assunto não pode ficar vazio.")
    @Pattern(regexp = "[A-Z][a-záàâãéèêíïóôõöúçñ]+", message = "O nome do assunto deve começar com letra maiúscula.")
    @Size(max = 30, message = "O comprimento do nome não pode exceder 50 caracteres.")
    String name;

    @NotNull(message = "A nota não pode estar vazia.")
    @DecimalMin(value = "0.0", message = "A nota mínima é de 0,0.")
    @DecimalMax(value = "10.0", message = "A nota máxima é de 10,0.")
    Double score;
}
