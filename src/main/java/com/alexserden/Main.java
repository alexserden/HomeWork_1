package com.alexserden;

import java.util.Arrays;

public class Main {
    static CollectionOfIntegers<Integer> collection = new CollectionOfIntegers<>();

    public static void main(String[] args) {

        add();
        delete(1);
        max();
        min();
        middle();
        searchElement(2);


    }

    public static void add() {
        collection.add(11);
        collection.add(22);
        collection.add(33);
        collection.add(44);
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


}
