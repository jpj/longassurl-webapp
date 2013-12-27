/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.solairis.longassurl.controller;

import com.solairis.longassurl.entity.MappedUrl;
import com.solairis.longassurl.service.MappedUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author joshjohnson
 */
@Controller
@RequestMapping("/mappedurl")
public class MappedUrlController {
    
    private final MappedUrlService mappedUrlService;

    @Autowired
    public MappedUrlController(MappedUrlService mappedUrlService) {
        this.mappedUrlService = mappedUrlService;
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public MappedUrl findOne(@PathVariable("id") String key) {
        return this.mappedUrlService.findOne(key);
    }
    
}
