import java.util.ArrayList;
import java.util.List;

public class StringSortingpart2 {
    public void sorted(List<String> listOfStrings)
    {
        listOfStrings.sort((s1,s2)->
        {
            if(s1.length()<s2.length())
            {
                return -1;
            }
            else if(s1.length()==s2.length())
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
        ArrayList<String>flower= new ArrayList<>(List.of("roza","stokrotka","forsycja","akacja","drzewoKwitnacejWisni"));
        StringSortingpart2 robot = new StringSortingpart2();
        System.out.println(flower);
        robot.sorted(flower);
        System.out.println(flower);

    }
}
