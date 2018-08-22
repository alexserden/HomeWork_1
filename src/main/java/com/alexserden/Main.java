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
       searchElement(1);
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
        try {
            System.out.println("Удаление Елемента");
            collection.delete(index);
            Arrays.stream(collection.array()).forEach(x -> System.out.println(x));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Несуществует елемента по данному индексу");
        }


    }

    public static void max() {
        try {
            System.out.println("Получение максимального числа " +"\n"+
                    collection.getMaxElement());

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Массив не содержит елементов");
        }

    }

    public static void min() {
        try{
        System.out.println("Получение минимального числа" +"\n"+
                collection.getMinElement());
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Массив не содержит елементов");

    }

    }

    public static void middle() {
        try {
            System.out.println("Получение среднего арефметического числа " +"\n"+
                    collection.getMiddleSumElement());
        }catch (Exception e) {
            System.out.println("Массив не содержит елементов");

        }

    }
     public static void searchElement(int index){
         try {
             System.out.println("Получение числа по индексу " + "\n" +
                     collection.getIndex(index));
         }catch (ArrayIndexOutOfBoundsException e){
             System.out.println("Число по такому индексу не существует");
         }
     }
     public static void getValue(int value){
                try{
                    System.out.println("получение числа по значению "+"\n"+
                            collection.getValue(value));

                }catch(IOException e){
                    System.out.println("Данный массив не содержит эелемента с таким значением");
                }catch (ArrayIndexOutOfBoundsException a){
                    System.out.println("Элементы в массиве отсутствуют");
                }
         }

}
