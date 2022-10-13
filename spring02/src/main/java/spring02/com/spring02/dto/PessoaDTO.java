package spring02.com.spring02.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import spring02.com.spring02.model.Pessoa;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDTO {
    private String nome;
    private String sobrenome;

    public static PessoaDTO convertToDto(Pessoa pessoa) {
        return new PessoaDTO(pessoa.getNome(), pessoa.getSobreNome());
    }

    public static List<PessoaDTO> convertListToDto(List<Pessoa> pessoaList) {
        return pessoaList.stream()
                .map(p -> new PessoaDTO(p.getNome(), p.getSobreNome()))
                .collect(Collectors.toList());
    }
}