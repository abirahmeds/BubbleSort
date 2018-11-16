package com.company;

public class Main {

    public static void main(String[] args)
    {
        int[] arr = fillArray(10);
        String arrString = "";
        for(int i = 0; i < arr.length; i++)
        {
            arrString += arr[i] + " ";
        }
        System.out.println(arrString);
        bubbleSort(arr);
        arrString = "";
        for(int i = 0; i < arr.length; i++)
        {
            arrString += arr[i] + " ";
        }
        System.out.println(arrString);
    }

    public static int[] fillArray(int count)
    {
        int[] intArr = new int[count];
        for(int i = 0; i < count; i++)
        {
            int randInt = 1 +(int) (Math.random() * (9999 + 1));
            intArr[i] = randInt;
        }
        return intArr;
    }
    public static void bubbleSort(int[] arr)
    {
        int swap = 1;
        while (swap != 0)
        {
            swap = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap++;
                }
            }
        }
    }
}
