package com.dylan;

import java.util.ArrayList;
import java.util.Scanner;

public class listArrayList {

    private ArrayList<String> myArrayList = new ArrayList<String>();

    public void addItem(String item) {
        myArrayList.add(item);
    }

    public ArrayList<String> getMyArrayList() {
        return myArrayList;
    }

    public void setMyArrayList(ArrayList<String> myArrayList) {
        this.myArrayList = myArrayList;
    }

    public void printMyList(){
        System.out.println("You have " + myArrayList.size() + " items in your list.");
        for (String myItem: myArrayList) {
            System.out.println(myItem);
        }
    }
}
