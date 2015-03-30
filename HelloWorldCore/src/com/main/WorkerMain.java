package com.main;


public class WorkerMain {

    public static void main(String[] args) throws InterruptedException {

      for(int i=0;i<2000;i++){
          System.out.println("Running worker main-"+i);
          Thread.sleep(1000);
      }
      
      System.out.println("All tasks completed");

    }

}
