package com.example.demo.service;

import com.example.demo.config.EIConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ValueService {

    @Autowired
    private EIConfig eiConfig;

    @Value(value="")
    private String title;

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public void getResouce(){
        eiConfig.outPutResource();
    }
}
