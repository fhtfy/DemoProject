package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.UUID;

@Service
public class ImportService {

    @Autowired
    private AsyncImportService asyncImportService;

    /**
     * 读取Excel
     *
     * @param file
     */
    public String readExcel(HttpServletRequest request,MultipartFile file){
        System.out.println("文件上传成功============文件名："+file.getOriginalFilename());
        System.out.println("文件上传成功============文件大小："+file.getSize());
        String fileName="";
        String filePath="";
        try {
            fileName = file.getOriginalFilename();
            filePath="E:/UploadFile/"+UUID.randomUUID().toString()+fileName;
            byte[] bytes = file.getBytes();
            BufferedOutputStream buffStream =
                    new BufferedOutputStream(new FileOutputStream(new File(filePath)));
            buffStream.write(bytes);
            buffStream.close();
            asyncImportService.readExcelFile(filePath);
            return "文件已成功上传并保存到服务器 " + fileName;
        } catch (Exception e) {
            return "文件上传失败 " + fileName + ": " + e.getMessage();
        }
    }

    /**
     * 读取Excel
     *
     * @param file
     */
    public String readExcelIs(HttpServletRequest request,MultipartFile file){
        System.out.println("文件上传成功============文件名："+file.getOriginalFilename());
        System.out.println("文件上传成功============文件大小："+file.getSize());

        try {
            InputStream is=file.getInputStream();
            asyncImportService.readExcelFileIs(is);
            return "文件已成功上传并保存到服务器 ";
        } catch (Exception e) {
            return "文件上传失败 ";
        }
    }
}
