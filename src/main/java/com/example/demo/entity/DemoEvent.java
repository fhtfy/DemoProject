package com.example.demo.entity;

import org.springframework.context.ApplicationEvent;

/**
 * 事件
 */
public class DemoEvent extends ApplicationEvent {
    private static final long serialVersionUID=1L;
    private String msg;

    public DemoEvent(Object source,String msg){
        super(source);
        this.msg=msg;
    }

    public String getMsg(){
        return msg;
    }

    public void setMsg(String msg){
        this.msg=msg;
    }
}
