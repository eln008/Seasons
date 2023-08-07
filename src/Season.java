import java.util.Scanner;

public class Season {



    public void findSeason(int monthNumber) {
       if (monthNumber >= 1 && monthNumber <= 12) {
           String season;
           switch (monthNumber) {
               case 12:
               case 1:
               case 2:
                   season = "зима";
                   break;
               case 3:
               case 4:
               case 5:
                   season = "весна";
                   break;
               case 6:
               case 7:
               case 8:
                   season = "лето";
                   break;
               default:
                   season = "осень";
                   break;
           }
           System.out.println("Сезон: " + season);
       } else {
           System.out.println("Введенное значение не является порядковым номером месяца.");
       }

   }
}

