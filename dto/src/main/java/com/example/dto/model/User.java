package com.example.dto.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
    private boolean admin = false;
}
