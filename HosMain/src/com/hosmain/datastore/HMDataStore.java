package com.hosmain.datastore;

import com.hosmain.entities.HosMain;

import java.util.ArrayList;
import java.util.List;

public class HMDataStore {

    List<HosMain> hosMainList = new ArrayList<>();

    public void setHosMain(int id, String hosName, String docName) {
        HosMain hosMain = new HosMain();
        hosMain.setId(id);
        hosMain.setHosName(hosName);
        hosMain.setDocName(docName);
        hosMainList.add(hosMain);
    }

    public void fillHosMain(){
        setHosMain(101,"KMC Hospital", "Dr.Manish");
        setHosMain(102, "Narayana Hrudayalaya Hospital","Dr.Gopal");
        setHosMain(103,"Kims Hospital","Dr.Mithun");
        setHosMain(104, "Global Hospital", "Dr. Satish");
    }
    public List<HosMain> printHosMain(){
        return hosMainList;
    }

}
