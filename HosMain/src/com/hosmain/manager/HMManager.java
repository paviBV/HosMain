package com.hosmain.manager;

import com.hosmain.dao.HMDao;
import com.hosmain.entities.HosMain;

import java.util.List;

public class HMManager {
    HMDao hmDao = new HMDao();
    List<HosMain> list = hmDao.printHosMain();

    public void fillHosMain(){
        hmDao.fillHosMain();
    }

    public void printHosMain(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
