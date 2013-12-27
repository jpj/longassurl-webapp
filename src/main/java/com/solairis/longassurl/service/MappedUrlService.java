/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.solairis.longassurl.service;

import com.solairis.longassurl.entity.MappedUrl;

/**
 *
 * @author joshjohnson
 */
public interface MappedUrlService {
    
    MappedUrl findOne(String key);
    
}
