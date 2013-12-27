/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.solairis.longassurl.controller;

import com.solairis.longassurl.entity.MappedUrl;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author joshjohnson
 */
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MappedUrlControllerTest {
    
    @Autowired
    private MappedUrlController mappedUrlController;
    
    @Test
    public void verifyFindOneAlwaysReturnsGoogleDotCom() {
        MappedUrl mappedUrl = this.mappedUrlController.findOne("whatever");
        Assert.assertThat(mappedUrl.getUrl(), CoreMatchers.is("http://google.com"));
    }
    
}
