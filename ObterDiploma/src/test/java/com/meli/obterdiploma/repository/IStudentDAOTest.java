package com.meli.obterdiploma.repository;

import com.meli.obterdiploma.model.StudentDTO;
import com.meli.obterdiploma.service.ObterDiplomaService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class IStudentDAOTest {

    @Mock
    private IStudentDAO studentDAO;

    @InjectMocks
    private ObterDiplomaService service;

    @Test
    void TestObterDiplomaService() {
        ObterDiplomaService teste = mock(ObterDiplomaService.class);
        when(teste.analyzeScores(anyLong())).thenReturn(new StudentDTO());

        Assert.assertEquals(teste.analyzeScores(anyLong()));
    }
}
