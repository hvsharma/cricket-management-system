package com.harsh.cms.model;

public class Response {

    private String ID;
    private Exception exception;
    private String responseMessage;

    @Override
    public String toString() {
        return "Response{" +
                "ID='" + ID + '\'' +
                ", exception=" + exception +
                ", responseMessage='" + responseMessage + '\'' +
                '}';
    }

    public Response() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
