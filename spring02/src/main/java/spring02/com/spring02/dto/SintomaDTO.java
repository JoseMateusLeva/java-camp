package spring02.com.spring02.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import spring02.com.spring02.model.Gravidade;
import spring02.com.spring02.model.Sintoma;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class SintomaDTO {
    private String nome;
    private Gravidade gravidade;

    public static SintomaDTO convertToDto(Sintoma sintoma) {
        return new SintomaDTO(sintoma.getNome(), sintoma.getNivelDeGravidade());
    }
}