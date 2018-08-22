package com.alexserden;

import java.io.IOException;
import java.util.Arrays;

public class CollectionOfIntegers<Integer> {
     private int count=1;
    private int[] values;

    public CollectionOfIntegers() {
        values = new int[10];
        }

    public boolean add(int e) {

        for (int i = 0; i < count; i++) {
            values[i]+=e;                                                        //добавляем елемент в массив при каждом добавлении новом добавлении элмента плюсуем его с предведущим по условию задания
        }
        count++;                                                                   //переменная count нужна для того чтобы неучитывать незаполненые часть массива
        int[] temp = values;                                                     //создаем временный массив
        values = new int[values.length *(3/2)];                                     //создаем новый массив в 1.5 раза больше
        System.arraycopy(temp, 0, values, 0, temp.length);         // копируем все значения с временного массива temp с позиции 0 в массив values c 0 позиции
        return true;
    }


    public void delete(int index) {
        int a = getIndex(index);                                                // в переменную а получаем элемент по индексу
        for (int i = 0; i < count; i++) {                                       //используем нашу переменную count
           if(values[i]!=index) values[i]-=a;                                   // проходимся циклом по массиву и отнимаем от всех чисел массива а по условию задания
        }
        int[] temp = values;

        System.arraycopy(temp, 0, values, 0, index);
        int elementAfterIndex = temp.length - index - 1;
        System.arraycopy(temp, index + 1, values, index, elementAfterIndex);
        }


    public int getIndex(int index) {
        return values[index];
    }

    public int getValue(int value) throws IOException {

        for (int i = 0; i < values.length; i++) {
            if (values[i] == value)
                return i;
        }
       throw new IOException();
    }

    public int getMaxElement () {
        Arrays.sort(values);
        return values[values.length - 1];
    }
    public int getMinElement () {
        Arrays.sort(values);
        return values[0];
        }

    public int getMiddleSumElement () {
        return Arrays.stream(values).sum() / values.length;
    }
    public int[] array(){
        return values;
    }

}