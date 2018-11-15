package com.example.demo.service.conditional;

public class LinuxListService implements ListService{

    @Override
    public String showListCmd() {
        return "You should try 'ls'!";
    }
}
