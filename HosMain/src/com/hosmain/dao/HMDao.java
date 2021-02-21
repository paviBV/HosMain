package com.hosmain.dao;

import com.hosmain.datastore.HMDataStore;
import com.hosmain.entities.HosMain;

import java.util.List;

public class HMDao {
    HMDataStore hmDataStore = new HMDataStore();

    public  void fillHosMain(){
        hmDataStore.fillHosMain();
    }
    public List<HosMain> printHosMain(){
        return hmDataStore.printHosMain();
    }
}
