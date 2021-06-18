import java.util.ArrayList;
import java.util.Arrays;

public class FinalExam {
    public static void main(String[] args) {
        FinalExam finalExam = new FinalExam();
        last_Gpa_AI(new String[]{ "Dan 3.9", "Lil 2.8", "  Ty  3.6  ", "Ed 2.84", "Dee 1.70" } );
    }

    public static void last_Gpa_AI(String[] usc ) {
        ArrayList<String> students = new ArrayList<>();
        for (int i = 0; i < usc.length; i++) {
            if (usc[i].contains("3.")) {
                students.add(usc[i]);
            }
        }
        String lastStudent = students.get(students.size() - 1);
        lastStudent = lastStudent.replaceAll("[^a-zA-Z]", "");
        System.out.println("Last student with GPA 3.00 or higher: " + lastStudent);
    }




    public void cities() {
        ArrayList<String> city = new ArrayList<>();
        city.add("Lake Forest");
        city.add("Tustin");
        city.add("Costa Mesa");
        city.add("Orange");
        city.add("San Jose");
        city.add("Anaheim");

        // create array multiwordCities with no null elements
        int count = 0;
        for(int i = 0; i < city.size(); i++) {
            if (city.get(i).contains(" ")) {
                count++;
            }
        }
        String[] multiwordCities = new String[count];


        for(int i = 0; i < city.size(); i++) {
            if (city.get(i).contains(" ")) {
                multiwordCities[i] = city.get(i);
                city.remove(i);
            }
        }

        System.out.println("City list: ");
        for(int i = 0; i < city.size(); i++) {
            System.out.println(city.get(i));
        }

        System.out.print("\nMulti word City List: ");
        System.out.println(Arrays.toString(multiwordCities));
    }
}
