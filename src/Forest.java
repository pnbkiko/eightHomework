import java.util.ArrayList;
import java.util.Objects;

public class Forest {
    private ArrayList<MountainHare> hares;
    private static String season = "";

    public Forest(ArrayList<MountainHare> hares) {
        this.hares = hares;

    }

    public static void setSeason(String newSeason) {
        season = newSeason;
        if (Objects.equals(season, "зима")){
            MountainHare.color = "белый";
        }
        else {
            MountainHare.color = "серо-рыжий";
        }
    }
    public void printHares(){
        for (MountainHare here: hares){
            System.out.println(here);
        }
    }
    // объявите недостающие переменные и добавьте конструктор

    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков

    // добавьте метод printHares()

}