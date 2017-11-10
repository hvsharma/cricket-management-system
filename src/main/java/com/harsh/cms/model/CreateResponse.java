package com.harsh.cms.model;

public class CreateResponse extends Response{

    private boolean created;

    public CreateResponse() {
    }

    @Override
    public String toString() {
        return "CreateResponse{" +
                "created=" + created +
                "} " + super.toString();
    }

    public boolean isCreated() {
        return created;
    }

    public void setCreated(boolean created) {
        this.created = created;
    }
}
