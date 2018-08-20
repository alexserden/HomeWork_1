package com.alexserden;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    static CollectionOfIntegers<Integer> collection = new CollectionOfIntegers<>();

    public static void main(String[] args) {

        add();
       delete(1);
       max();
        min();
        middle();
       searchElement(0);
       getValue(-2);



    }

    public static void add() {
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        Arrays.stream(collection.array()).forEach(x -> System.out.println(x));
    }

    public static void delete(int index) {
        System.out.println("Удаление Елемента");
        collection.delete(index);
        Arrays.stream(collection.array()).forEach(x -> System.out.println(x));

    }

    public static void max() {
        System.out.println("Получение максимального числа " +"\n"+
                collection.getMaxElement());

    }

    public static void min() {
        System.out.println("Получение минимального числа" +"\n"+
                collection.getMinElement());

    }

    public static void middle() {
        System.out.println("Получение среднего арефметического числа " +"\n"+
                collection.getMiddleSumElement());
    }
     public static void searchElement(int index){
         System.out.println("Получение числа по индексу " +"\n"+
                 collection.getIndex(index));
     }
     public static void getValue(int value){
                try{
                    System.out.println("получение числа по значению "+"\n"+
                            collection.getValue(value));

                }catch(IOException e){
                    System.out.println("Данный массив не содержит эелемента с таким значением");
                }
         }

}
