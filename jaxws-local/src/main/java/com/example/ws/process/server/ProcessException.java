package com.example.ws.process.server;

public class ProcessException extends Exception {

    private String customMessage;
    
    public ProcessException(String customMessage){
        super();
        this.customMessage=customMessage;
    }

    public String getCustomMessage() {
        return customMessage;
    }

    public void setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
    }
    
    
    
}
