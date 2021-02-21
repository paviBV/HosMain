package com.hosmain.entities;

public class HosMain {
    private int id;
    private String hosName;
    private String docName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHosName() {
        return hosName;
    }

    public void setHosName(String hosName) {
        this.hosName = hosName;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    @Override
    public String toString() {
        return "HosMain{" +
                "id=" + id +
                ", hosName='" + hosName + '\'' +
                ", docName='" + docName + '\'' +
                '}';
    }
}
