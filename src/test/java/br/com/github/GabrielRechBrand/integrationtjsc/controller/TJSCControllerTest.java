package br.com.github.GabrielRechBrand.integrationtjsc.controller;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashMap;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest
public class TJSCControllerTest {

    public static final String CONTROLLER_ENDPOINT = "/tjsc";
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void testGetEntesDeclaradosUnfiltered() throws Exception {
        mockMvc.perform(post(CONTROLLER_ENDPOINT.concat("/entes-declarados")))
                .andExpect(status().isOk());
    }

    @Test
    public void testGetEntesDeclaradosByName() throws Exception {
        HashMap<String, Object> filters = new HashMap<>();
        filters.put("nome", "ASSOCIAÇÃO ATLÉTICA BEIRA RIO");

        mockMvc.perform(post(CONTROLLER_ENDPOINT.concat("/entes-declarados"))
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(JSONObject.wrap(filters).toString()))
                .andExpect(status().isOk());
    }

    @Test
    public void testGetEntesDeclaradosByCodigo() throws Exception {
        HashMap<String, Object> filters = new HashMap<>();
        filters.put("codigoComarca", "1");

        mockMvc.perform(post(CONTROLLER_ENDPOINT.concat("/entes-declarados"))
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(JSONObject.wrap(filters).toString()))
                .andExpect(status().isOk());
    }


}
