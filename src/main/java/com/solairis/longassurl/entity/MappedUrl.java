/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.solairis.longassurl.entity;

import java.util.Date;

/**
 *
 * @author joshjohnson
 */
public class MappedUrl {
    
    private final Date created;
    private final String key;
    private final String url;

    public MappedUrl(Date created, String key, String url) {
        this.created = created;
        this.key = key;
        this.url = url;
    }

    public Date getCreated() {
        return created;
    }

    public String getKey() {
        return key;
    }

    public String getUrl() {
        return url;
    }
    
}
