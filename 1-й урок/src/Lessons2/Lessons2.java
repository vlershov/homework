package Lessons2;

import java.util.Random;
import java.util.Scanner;

public class Lessons2 {
    public static void main(String[] args) {

        Zadacha1();
        Zadacha2();
        Zadacha3();
        Zadacha4();
        Zadacha5();
        Zadacha6();
        Zadacha7();

    }

    public static void Zadacha1(){
        int[] array = new int[10];
        String mas = new String();
        for (int i = 0; i < array.length; i++)
        {
            Random random = new Random();
            array[i] = random.nextInt(2);
            mas = mas + array[i] +" ";

        }
        System.out.println("На входе у нас массив:");
        System.out.println(mas);
        int[] rezult = Zamen(array);
        mas = "";
        for (int i = 0; i < rezult.length; i++)
        {
            mas = mas + rezult[i] +" ";
        }
        System.out.println("После замены мы получили:");
        System.out.println(mas);
    }

    public static int[] Zamen(int[] array){
        int[] arrayRezult = new int[array.length];
        for (int i = 0; i < arrayRezult.length; i++)
        {

            arrayRezult[i] = (array[i]==1) ? 0:1;
        }
        return arrayRezult;
    }

    public static void Zadacha2(){
        int[] array = new int[8];
        String mas = new String();
        int unk = 1;
        for (int i = 0; i < array.length; i++)
        {
            array[i] = unk;
            mas = mas + array[i] +" ";
            unk = unk + 3;

        }
        System.out.println("По втрой задаче мы получили результат:");
        System.out.println(mas);

    }

    public static void Zadacha3(){
        int[] array = new int[12];
        String mas = new String();
        int unk = 1;
        for (int i = 0; i < array.length; i++)
        {
            Random random = new Random();
            array[i] = random.nextInt(13);
            mas = mas + array[i] +" ";


        }
        System.out.println("По 3-й задаче мы получили входные параметры:");
        System.out.println(mas);
        int[] rezult = IteratorUmnogen(array);
        mas = "";
        for (int i = 0; i < rezult.length; i++)
        {
            mas = mas + rezult[i] +" ";
        }
        System.out.println("После замены мы получили:");
        System.out.println(mas);

    }

    public static int[] IteratorUmnogen(int[] array){
        int[] arrayRezult = new int[array.length];
        for (int i = 0; i < arrayRezult.length; i++)
        {

            arrayRezult[i] = (array[i]<6) ? array[i]*2:array[i];
        }
        return arrayRezult;
    }

    public static void Zadacha4(){
        int[] array = new int[10];
        String mas = new String();
        for (int i = 0; i < array.length; i++)
        {
            Random random = new Random();
            array[i] = random.nextInt(10);
            mas = mas + array[i] +" ";

        }
        System.out.println("На входе у нас массив:");
        System.out.println(mas);
        int rezultReturn = returnRezultCR(array,"Min");
        System.out.println("Минимальное значение:");
        System.out.println(rezultReturn);
        rezultReturn = returnRezultCR(array,"Max");
        System.out.println("Максимальное значение:");
        System.out.println(rezultReturn);
    }

    public static int returnRezultCR(int[] array,String MinMax){
        int arrayRezult =0;
        for (int i = 0; i < array.length; i++)
        {
            if (i==0 && arrayRezult ==0){
                arrayRezult = array[i];
            }else{
                arrayRezult = (MinMax == "Min") ? (array[i]<arrayRezult) ? array[i]:arrayRezult:(array[i]>arrayRezult) ? array[i]:arrayRezult;
            }

        }
        return arrayRezult;
    }

    public static void Zadacha5(){
        System.out.println("Введите размер массива:");
        Scanner input = new Scanner(System.in);
        int razmerArray = input.nextInt();
        int[][] array = new int[razmerArray][razmerArray];
        String mas = new String();
        int Kollstrok = 1;
        System.out.println("Результат 5-й задачи:");
        for (int i = 0; i < array.length; i++)
        {
            for (int y = 0; y < array.length; y++) {

                array[i][y] = (i == y) ?1:(y == array.length-Kollstrok)?1:0;
                mas = mas + array[i][y];

            }
            System.out.println(mas + "\t");
            Kollstrok = Kollstrok + 1;
            mas = "";
        }



    }

    public static void Zadacha6(){
        System.out.println("Введите размер одномерного массива задачи 6:");
        Scanner input = new Scanner(System.in);
        int[] array = new int[input.nextInt()];
        String mas = new String();
        int unk = 1;
        for (int i = 0; i < array.length; i++)
        {
            Random random = new Random();
            array[i] = random.nextInt(2);
            mas = mas + array[i] +" ";
        }
        System.out.println("Мы получили массив:");
        System.out.println(mas);
        System.out.println("Введите номер позии массива который считаем разделителем правой и левой части:");
        input = new Scanner(System.in);
        int Razdelit = input.nextInt();
        if (Razdelit>= array.length){
            System.out.println("результат 6 задачи: false");
        }else {
            boolean rezBul = ProverkaSumm(array, Razdelit);
            System.out.println("результат 6 задачи: "+rezBul);
        }

    }

    public static boolean ProverkaSumm(int[] array,int Razdelit){
        int summleft =0;
        int summRigft =0;
        for (int i = 0; i < array.length; i++)
        {
            if(i>Razdelit-1){
                summRigft = summRigft + array[i];
            }else{
                summleft = summleft + array[i];
            }

        }
        return (summRigft == summleft) ? true:false;
    }

    public static void Zadacha7(){
        System.out.println("Введите размер одномерного массива задачи 7:");
        Scanner input = new Scanner(System.in);
        int[] array = new int[input.nextInt()];
        int a = -10;
        int b = 100;
        String mas = new String();
        int unk = 1;
        for (int i = 0; i < array.length; i++)
        {
            array[i] = a + (int) (Math.random() * b);
            mas = mas + array[i] +" ";
        }
        System.out.println("Мы получили массив:");
        System.out.println(mas);
        System.out.println("Введите на сколько символов будет сдигаться массив:");
        input = new Scanner(System.in);
        int sdvig = input.nextInt()*-1;
        int[] rezult = new int[array.length];
        int[] rezultSdvig = SdvigArray(array,sdvig);
        mas = "";
        for (int i = 0; i < rezultSdvig.length; i++)
        {
            mas = mas + rezultSdvig[i] +" ";
        }
        System.out.println("Мы получили результат сдвига:");
        System.out.println(mas);
    }

    public static int[] SdvigArray(int[] array,int Razdelit){

        int SdvigIndex0, SdvigIndex1, buffer;

        int dlinaSdviga = (Razdelit<0)?Razdelit*-1:Razdelit;

            for (int i = 0; i < dlinarekuzs(dlinaSdviga, array.length); i++) {
                buffer = array[i];

                SdvigIndex0 = i;

                if (Razdelit > 0) {
                    while (true) {
                        SdvigIndex1 = SdvigIndex0 + Razdelit;
                        if (SdvigIndex1 >= array.length)
                            SdvigIndex1 = SdvigIndex1 - array.length;
                        if (SdvigIndex1 == i)
                            break;
                        array[SdvigIndex0] = array[SdvigIndex1];
                        SdvigIndex0 = SdvigIndex1;
                    }
                } else if (Razdelit < 0) {
                    while (true) {
                        SdvigIndex1 = SdvigIndex0 + Razdelit;
                        if (SdvigIndex1 < 0)
                            SdvigIndex1 = array.length + SdvigIndex1;
                        if (SdvigIndex1 == i)
                            break;

                        array[SdvigIndex0] = array[SdvigIndex1];
                        SdvigIndex0 = SdvigIndex1;
                    }
                }

                array[SdvigIndex0] = buffer;
            }

        return array;
    }

    public static int dlinarekuzs(int a, int b) {
        if (b == 0)
            return a;
        else
            return dlinarekuzs(b, a % b);
    }

}
