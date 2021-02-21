package com.hosmain;

import java.util.ArrayList;
import java.util.List;

class HosMain{
    private String hosName;
    private String docName;
    private int id;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "HosMain{" +
                "hosName='" + hosName + '\'' +
                ", docName='" + docName + '\'' +
                ", id=" + id +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {
        List<HosMain> hosMainList = new ArrayList<>();
        HosMain hosMain = new HosMain();
        hosMain.setId(111);
        hosMain.setHosName("Vinayaka");
        hosMain.setDocName("Prakash");
        hosMainList.add(hosMain);

        HosMain hosMain1 = new HosMain();
        hosMain1.setId(112);
        hosMain1.setHosName("Kims");
        hosMain1.setDocName("Nagesh");
        hosMainList.add(hosMain1);

        HosMain hosMain2 = new HosMain();
        hosMain2.setId(113);
        hosMain2.setHosName("City");
        hosMain2.setDocName("Ragavan");
        hosMainList.add(hosMain2);

        for (int i = 0; i < hosMainList.size(); i++) {
            System.out.println(hosMainList.get(i));
        }
        System.out.println("Single");
        for (int i = 0; i < hosMainList.size(); i++) {
            if (hosMainList.get(i).getId()==112) {
                System.out.println(hosMainList.get(i));
            }
        }

        System.out.println("update");
        for (int i = 0; i < hosMainList.size(); i++) {
            if (hosMainList.get(i).getId()==112) {
                hosMainList.get(i).setHosName(" Girish");
                hosMainList.get(i).setDocName("Ranga");
                System.out.println(hosMainList.get(i));
            }
        }

        System.out.println("Delete");
        for (int i = 0; i < hosMainList.size(); i++) {
            if (hosMainList.get(i).getId()==113) {
                hosMainList.remove(i);
            }
        }

        for (int i = 0; i < hosMainList.size(); i++) {
            if (hosMainList.get(i).getId() != 113) {
                System.out.println("Not found");
                break;
            }
        }
        for (int i = 0; i < hosMainList.size(); i++) {
            System.out.println(hosMainList.get(i));
        }

    }
}
