package com.hosmain;


import com.hosmain.manager.HMManager;

public class Main {

    public static void main(String[] args) {
        HMManager hmManager = new HMManager();
        hmManager.fillHosMain();
        hmManager.printHosMain();


//        for (int i = 0; i < hosMainList.size(); i++) {
//            System.out.println(hosMainList.get(i));
//        }
//        System.out.println("Single");
//        for (int i = 0; i < hosMainList.size(); i++) {
//            if (hosMainList.get(i).getId()==112) {
//                System.out.println(hosMainList.get(i));
//            }
//        }
//
//        System.out.println("update");
//        for (int i = 0; i < hosMainList.size(); i++) {
//            if (hosMainList.get(i).getId()==112) {
//                hosMainList.get(i).setHosName(" Girish");
//                hosMainList.get(i).setDocName("Ranga");
//                System.out.println(hosMainList.get(i));
//            }
//        }
//
//        System.out.println("Delete");
//        for (int i = 0; i < hosMainList.size(); i++) {
//            if (hosMainList.get(i).getId()==113) {
//                hosMainList.remove(i);
//            }
//        }
//
//        for (int i = 0; i < hosMainList.size(); i++) {
//            if (hosMainList.get(i).getId() != 113) {
//                System.out.println("Not found");
//                break;
//            }
//        }
//        for (int i = 0; i < hosMainList.size(); i++) {
//            System.out.println(hosMainList.get(i));
//        }

    }
}
