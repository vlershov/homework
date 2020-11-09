package Lessons4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Sotrudniki {

    List myList = new ArrayList();
    private int tabNomber = 0;

    void SotrudnikiAdd(String FIO, String Dolgnost, String Telefon, double Zarplata, int Vozrast){
        HashMap someCollection = new HashMap();
        someCollection.put("FIO",FIO);
        someCollection.put("tabNomber",++tabNomber);
        someCollection.put("Dolgnost",Dolgnost);
        someCollection.put("Telefon",Telefon);
        someCollection.put("Zarplata",Zarplata);
        someCollection.put("Vozrast",Vozrast);
        this.myList.add(someCollection);
    }

    public List getInformationsAboutPersonal(){
        return this.myList;
    }

    public String getInformationsAboutAvrePole(String namePole, int pozition){
        HashMap someCollection = (HashMap) this.myList.get(pozition);
        return someCollection.get(namePole).toString();
    }

    public void SetNewZarplat(int pozition, double Zarplata){
        HashMap someCollection = (HashMap) this.myList.get(pozition);
        someCollection.put("Zarplata",Zarplata);
    }

}

