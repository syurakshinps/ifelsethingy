import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(Arrays.asList("яйца", "орехи", "пельмени", "баклажаны"));
/*        arrayList.add("яйца");
        arrayList.add("орехи");
        arrayList.add("пельмени");
        arrayList.add("баклажаны");*/


        for (String s : arrayList
        ) {
            if (s == "яйца") {
                System.out.println("не люблю " + s);
                //  break;
            } else {
                System.out.println(s + " вкусно");
            }
        }
        System.out.println("вот и поели");


    }
}
