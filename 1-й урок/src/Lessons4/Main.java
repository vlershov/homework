package Lessons4;

import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Sotrudniki sotrudniki = new Sotrudniki();
        sotrudniki.SotrudnikiAdd("Иванов Иван Иванович","Генеральный директро","555-55-55",150000.00,52);
        sotrudniki.SotrudnikiAdd("Петров Иван Иванович","Зместитель генерального директро","444-44-44",120000.00,48);
        sotrudniki.SotrudnikiAdd("Иванова Ирина Александровна","Офис менеджер","333-33-33",50000.00,25);
        sotrudniki.SotrudnikiAdd("Сидоров Иван Иванович","Инженер","222-22-22",90000.00,32);
        sotrudniki.SotrudnikiAdd("Слесарев Иван Иванович","Слесарь 5 категории","111-11-11",70000.00,28);

        System.out.println(sotrudniki.getInformationsAboutAvrePole("FIO",2));
        System.out.println(sotrudniki.getInformationsAboutAvrePole("tabNomber",0));
        System.out.println(sotrudniki.getInformationsAboutAvrePole("Telefon",0));
        System.out.println(sotrudniki.getInformationsAboutAvrePole("Dolgnost",0));
        System.out.println(sotrudniki.getInformationsAboutAvrePole("Zarplata",4));
        System.out.println(sotrudniki.getInformationsAboutAvrePole("Vozrast",4));

        //Получаем инфрмацию о сотрудниках старше 40
        System.out.println("Получаем инфрмацию о сотрудниках старше 40");
        List DannieWork = sotrudniki.getInformationsAboutPersonal();
        for (int i = 0; i < 5; i++) {
            HashMap LocalDannie = (java.util.HashMap) DannieWork.get(i);

            if ( (int) LocalDannie.get("Vozrast")> 40){
                System.out.println(LocalDannie);
            }
        }
        //

        //Увеличение зарплаты сотрудникам старше 45 на 5000
        System.out.println("Увеличение зарплаты сотрудникам старше 45 на 5000");
        DannieWork = sotrudniki.getInformationsAboutPersonal();
        for (int i = 0; i < 5; i++) {
            HashMap LocalDannie = (java.util.HashMap) DannieWork.get(i);

            if ( (int) LocalDannie.get("Vozrast")> 45){
                System.out.println("Текущая зарплата сотрудкника:" + LocalDannie.get("FIO") + " составляет:" + LocalDannie.get("Zarplata"));
                sotrudniki.SetNewZarplat(i,(double) LocalDannie.get("Zarplata")+5000.00);
            }
        }
        System.out.println("Теперь давайте посмотрим на результат");
        DannieWork = sotrudniki.getInformationsAboutPersonal();
        for (int i = 0; i < 5; i++) {
            HashMap LocalDannie = (java.util.HashMap) DannieWork.get(i);

            if ( (int) LocalDannie.get("Vozrast")> 45){
                System.out.println("Новая зарплата сотрудкника:" + LocalDannie.get("FIO") + " составляет:" + LocalDannie.get("Zarplata"));
            }
        }
        //
    }

}
