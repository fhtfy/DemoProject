package com.example.demo.controller;

import com.example.demo.entity.DemoPublisher;
import com.example.demo.service.ImportService;
import com.example.demo.service.ValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TestController {
    @Autowired
    private ImportService importService;

    @Autowired
    private ValueService valueService;

    @Autowired
    private DemoPublisher demoPublisher;

    @RequestMapping(value="/import_file", method= RequestMethod.POST)
    public String importFile(HttpServletRequest request, @RequestParam("file") MultipartFile file){
        return importService.readExcel(request,file);
    }

    @RequestMapping(value="/import_file_io", method= RequestMethod.POST)
    public String importFileIo(HttpServletRequest request, @RequestParam("file") MultipartFile file){
        return importService.readExcelIs(request,file);
    }

    @GetMapping(value="/getResource")
    public String getResource(){
        valueService.getResouce();
        return "SUCEESS";
    }

    @GetMapping(value="/publicMsg")
    public String publicMsg(){
        demoPublisher.publish("这是一条加密消息");
        return "SUCEESS";
    }
}
