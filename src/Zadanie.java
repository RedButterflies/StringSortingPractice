import java.util.ArrayList;
import java.util.List;

public class Zadanie {
    public static ArrayList<String>listaWyrazow= new ArrayList<>(List.of("cebula","jajko","pomidor","pomarancza"));
    public static void sortujWyrazy(List<String>lista)
    {
        lista.sort((wyraz1,wyraz2)->
        {
            if(wyraz1.length()<wyraz2.length())
            {
                return -1;
            }
            else if(wyraz1.length()==wyraz2.length())
            {
                return 0;
            }
            else
            {
                return 1;
            }
        });
    }

    public static void main(String[] args) {
        System.out.println(listaWyrazow);
        sortujWyrazy(listaWyrazow);
        System.out.println(listaWyrazow);
    }
}
