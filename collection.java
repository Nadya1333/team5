package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class collection {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String>myArrayList = new ArrayList<String>();
        System.out.println("Введите целое число: ");
        String x = sc.nextLine();
        System.out.print("Введите элементы массива: ");
        while (!sc.hasNext("quit")) {
            if (sc.hasNextInt()) {
                String a=sc.nextLine();
                myArrayList.add(a);
            } else {
                System.out.println("Ошибка");
                break;
            }
        }
        System.out.println("Оригинальное состояние массива: "+ myArrayList);

        for(int i = 0; i < myArrayList.size(); i++){
            myArrayList.remove(x);
        }
        System.out.println("Итоговое состояние массива: "+ myArrayList);
        sc.close();
    }
}