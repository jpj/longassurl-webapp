/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.solairis.longassurl.service.impl;

import com.solairis.longassurl.entity.MappedUrl;
import com.solairis.longassurl.service.MappedUrlService;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author joshjohnson
 */
@ContextConfiguration(locations = "classpath:spring-config.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class MappedUrlServiceAlwaysReturnsGoogleDotComTest {
    
    @Autowired
    private MappedUrlService mappedUrlService;
    
    @Test
    public void verifyThatGoogleDotComIsReturned() {
        MappedUrl mappedUrl = this.mappedUrlService.findOne("whatev");
        assertThat("We expected", mappedUrl.getUrl(), is("http://google.com"));
    }
}
