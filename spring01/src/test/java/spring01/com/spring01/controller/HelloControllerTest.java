package spring01.com.spring01.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static spring01.com.spring01.model.RomanNumber.toRoman;


@SpringBootTest
@AutoConfigureMockMvc
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper mapper;

    @Test
    void getRoman_returnRomanNumber_whenIsTrue() throws Exception {
        int number = 1;

        String romanNumber = toRoman(1);

        // deserialize response in mockMvc
        ResultActions resultActions = mockMvc.perform(get("/spring1/roman/{number}", number))
                .andDo(print())
                .andExpect(status().isOk());

        MvcResult result = resultActions.andReturn();
        String contentAsString = result.getResponse().getContentAsString();

        // SomeCustomResponse response = objectMapper.readValue(contentAsString, SomeCustomResponse.class);
        //

        resultActions.andExpect(status().isOk());
        assertThat(contentAsString).hasToString(romanNumber);
    }

    @Test
    void getRoman_returnRomanNumber_whenValueIsInvalid() throws Exception {
        String numberInvalid = "UM";

        ResultActions resultActions = mockMvc.perform(get("/spring1/roman/{number}", numberInvalid))
                .andDo(print())
                .andExpect(status().isBadRequest());
    }
}