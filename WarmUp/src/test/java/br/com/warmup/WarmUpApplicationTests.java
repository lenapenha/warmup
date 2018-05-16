package br.com.warmup;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = WarmUpApplication.class)
@AutoConfigureMockMvc
public class WarmUpApplicationTests {
	
	
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void deveRetornarStatusCreatedAoCriarUmLivro() throws Exception {
    	StringBuilder content = new StringBuilder();
        content.append("{\n")
                .append("\"titulo\" : \"Meu Livro\",\n")
                .append("\"preco\" : \2.5\n")
                .append("}");

        this.mockMvc.perform(post("/livros").content(content.toString())
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

    }

}
