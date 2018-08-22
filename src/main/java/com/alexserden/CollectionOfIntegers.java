package com.alexserden;

import java.io.IOException;
import java.util.Arrays;

public class CollectionOfIntegers<Integer> {

    private int[] values;

    public CollectionOfIntegers() {
        values = new int[0];

    }

    public boolean add(int e) {
        for (int i = 0; i < values.length; i++) {                                //добавляем елемент в массив
            values[i]+=e;
        }
        int[] temp = values;                                                     //создаем временный массив
        values = new int[values.length + 1];                                     //создаем новый массив на 1 больше
        System.arraycopy(temp, 0, values, 0, temp.length);         // копируем все значения с временного массива temp с позиции 0 в массив values c 0 позиции
        values[values.length - 1] = e;                                             // добавляем елемент в конец списка в пустую ячейку

        return true;
    }


    public void delete(int index) {
        int a = getIndex(index);
        for (int i = 0; i < values.length; i++) {
           if(values[i]!=index) values[i]-=a;
        }
        int[] temp = values;
        values = new int[values.length - 1];
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