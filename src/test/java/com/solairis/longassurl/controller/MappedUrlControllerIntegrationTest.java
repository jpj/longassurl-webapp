/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.solairis.longassurl.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

/**
 *
 * @author joshjohnson
 */
@ContextConfiguration("classpath:spring-config.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class MappedUrlControllerIntegrationTest {
    
    private MockMvc mockMvc;
    @Autowired
    private MappedUrlController mappedUrlController;
    
    @Before
    public void setUp() {
        this.mockMvc = standaloneSetup(this.mappedUrlController).build();
    }
    
    @Test
    public void verifyRequestReturnsGoogleDotCom() throws Exception {
        this.mockMvc.perform(get("/mappedurl/whatever"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("url").value("http://google.com"))
                .andExpect(jsonPath("key").value("whatever"));
    }
    
}
