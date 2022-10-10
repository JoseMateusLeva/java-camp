package com.meli.obterdiploma.exception;

import com.meli.obterdiploma.model.ErrorDTO;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

@Getter
public class ObterDiplomaException extends RuntimeException {
    private final ErrorDTO errorDTO;
    private final HttpStatus status;

    public ObterDiplomaException(String message, HttpStatus status) {
        this.errorDTO = new ErrorDTO(this.getClass().getSimpleName(), message);
        this.status = status;
    }
}
