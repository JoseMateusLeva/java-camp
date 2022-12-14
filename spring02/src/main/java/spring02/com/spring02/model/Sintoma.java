package spring02.com.spring02.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sintoma {
    private String codigo;
    private String nome;
    private Gravidade nivelDeGravidade;
}
