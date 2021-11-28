import java.util.ArrayList;
import java.util.Objects;

public class StringService {


    public static String[] sort(String[] as, boolean dir) throws StringArrayException {
        if ((as == null) || (as.length == 0))
            throw new StringArrayException("ссылка на исходный массив = null или он пуст");
        String temp;
        if (dir) {
            for (int i = 1; i < as.length; i++) {
                int j = i - 1;
                temp = as[i];
                while (j >= 0 && as[j].toLowerCase().charAt(0) >= temp.toLowerCase().charAt(0)) {
                    as[j + 1] = as[j];
                    j--;
                }
                as[j + 1] = temp;
            }
        } else {
            for (int i = 1; i < as.length; i++) {
                int j = i - 1;
                temp = as[i];
                while (j >= 0 && as[j].toLowerCase().charAt(0) < temp.toLowerCase().charAt(0)) {
                    as[j + 1] = as[j];
                    j--;
                }
                as[j + 1] = temp;
            }
        }
        return as;
    }


    public static char[] getCharStat (String str) {
        if (str==null) return null;
        if (str.trim().equals("")) return new char[0];
        ArrayList<Character> list = new ArrayList<>();

        for (int i=0; i<str.length(); i++) {
            if (!list.contains(str.charAt(i))) {
                list.add(str.charAt(i));
            }
        }

        Object[] temp = list.toArray();
        char[] massiveToOut = new char[temp.length];
        for (int i = 0; i < temp.length; i++) {
            massiveToOut[i] = (char) temp[i];
        }
        return massiveToOut;

    }

}

