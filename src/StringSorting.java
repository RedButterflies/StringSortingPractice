import java.util.ArrayList;
import java.util.List;

public class StringSorting {
    public static ArrayList<String>listOfStrings= new ArrayList<>(List.of("public","static","void","integer","math","operation","calculator"));
    public void sorted(List<String>list)
    {
        list.sort((string1,string2)->
        {
            if(string1.length()<string2.length())
            {
                return -1;
            }
            else if(string1.length()==string2.length())
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
        StringSorting sorting = new StringSorting();
        System.out.println(listOfStrings);
        sorting.sorted(listOfStrings);
        System.out.println(listOfStrings);
    }
}
