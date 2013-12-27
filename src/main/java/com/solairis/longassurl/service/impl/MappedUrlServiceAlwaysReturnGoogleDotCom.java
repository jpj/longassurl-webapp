/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.solairis.longassurl.service.impl;

import com.solairis.longassurl.entity.MappedUrl;
import com.solairis.longassurl.service.MappedUrlService;
import java.util.Date;

/**
 *
 * @author joshjohnson
 */
public class MappedUrlServiceAlwaysReturnGoogleDotCom implements MappedUrlService {

    @Override
    public MappedUrl findOne(String key) {
        return new MappedUrl(new Date(), key, "http://google.com");
    }
    
}
