public class Main {
    public static void main(String[] args) {


        String[] excArray1 = null;
        String[] excArray2 = new String[0];
        String[] defArray = {"Петр", "Катя", "Олег", "Иван", "Алина", "Ян", "Алёна"};
        String def = "Псжоомвофывйжж";

        try {
            String[] sortArray = StringService.sort(defArray, true);
            for (String word : sortArray) {
                System.out.print(word + " ");
            }
            System.out.println();
            sortArray = StringService.sort(defArray, false);
            for (String word : sortArray) {
                System.out.print(word + " ");
            }

        } catch (StringArrayException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        System.out.println(StringService.getCharStat(def));
    }
}
