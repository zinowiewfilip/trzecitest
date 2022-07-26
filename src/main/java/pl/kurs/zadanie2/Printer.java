package pl.kurs.zadanie2;

import java.time.DayOfWeek;
import java.util.List;

public class Printer {
    int firstCounter;
    int secondCounter;
    int thirdCounter;
    int fourthCounter;
    int fifthCounter;
    int sixthCounter;
    int seventhCounter;
    public void getFilesCreated(List<FileDate> fileDateList)
    {
        //przy użyciu enuma DayOfWeek program nie działal.
        for (int i = 0; i < fileDateList.size(); i++) {
            if(fileDateList.get(i).getFileTime().equals("poniedziałek")){
                firstCounter += 1;
            }
            else if(fileDateList.get(i).getFileTime().equals("wtorek")){
                secondCounter += 1;
            }
            else if(fileDateList.get(i).getFileTime().equals("środa")){
                thirdCounter += 1;
            }
            else if(fileDateList.get(i).getFileTime().equals("czwartek")){
                fourthCounter += 1;
            }
            else if(fileDateList.get(i).getFileTime().equals("piątek")){
                fifthCounter += 1;
            }
            else if(fileDateList.get(i).getFileTime().equals("sobota")){
                sixthCounter += 1;
            }
            else{
                seventhCounter +=1;
            }
        }
    }
    public void printNumberOfFilesCreated(){
        System.out.println("Poniedziałek: " +firstCounter);
        System.out.println("Wtroek: " +secondCounter);
        System.out.println("Sroda: " +thirdCounter);
        System.out.println("Czwartek: " +fourthCounter);
        System.out.println("Piątek: " +fifthCounter);
        System.out.println("Sobota: " +sixthCounter);
        System.out.println("Niedziela: " +seventhCounter);
    }
}
