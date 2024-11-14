import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> students = new HashMap<>();

        students.put("Alexey", new ArrayList<>() {{
            add(90);
            add(95);
            add(80);
        }});

        students.put("Damir", new ArrayList<>() {{
            add(96);
            add(90);
            add(87);
        }});

        students.put("Maksim", new ArrayList<>() {{
            add(83);
            add(90);
            add(89);
        }});

        //finding average
        int highestScore = 0;
        String topName = " ";
        for (String name : students.keySet()) {
            ArrayList<Integer> scores = students.get(name);
            int studentsHighest = findHighestScore(scores);
            if(studentsHighest > highestScore) {
                highestScore = studentsHighest;
                topName = name;
            }
            double sum = 0;
            for (int score : scores) {
                sum += score;
            }
            double average = sum / scores.size();
            System.out.println(name + ": " + average + " ");
        }
        System.out.println(topName + " " + highestScore);
    }

    public static int findHighestScore(ArrayList<Integer> scores) {
        int highest = 0;
        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
        }
        return highest;
    }
}