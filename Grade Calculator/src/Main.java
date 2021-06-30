import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static double classScoreSum;

    public static void main(String[] args) {

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("Joao", new double[]{80, 50, 40, 20}, new double[]{75, 75}, new double[]{78.20, 77.20}));
        studentArrayList.add(new Student("Maria", new double[]{92, 96, 94, 90}, new double[]{90, 90}, new double[]{97.90, 98.72}));
        studentArrayList.add(new Student("Jose", new double[]{97, 82, 93, 90}, new double[]{98, 77}, new double[]{80, 80}));
        studentArrayList.add(new Student("Camila", new double[]{87, 72, 63,0}, new double[]{0, 87}, new double[]{8, 60}));

        ArrayList<Double> classStudentsFinalScoreList = new ArrayList<>();

        for (Student student : studentArrayList) {
            student.setFinalScore();
            student.setFinalGrade();
            System.out.println("Student name: " + student.getStudentName());
            System.out.println("Assignments average score: " + Arrays.stream(student.getAssignmentsScores()).sum() / student.getAssignmentsScores().length);
            System.out.println("Tests average score: " + Arrays.stream(student.getTestsScores()).sum() / student.getTestsScores().length);
            System.out.println("Labs average score: " + Arrays.stream(student.getLabsScores()).sum() / student.getLabsScores().length);
            System.out.println("Final score: " + student.getFinalScore());
            System.out.println("Final grade: " + student.getFinalGrade());
            System.out.println("------------------------------------------");
            classStudentsFinalScoreList.add(student.getFinalScore());
        }
        for (Double studentScore : classStudentsFinalScoreList) {
            classScoreSum += studentScore;
        }
        double classScoreAverage = classScoreSum / classStudentsFinalScoreList.size();
        System.out.println("Class final score: " + String.format("%.2f", classScoreAverage));
        System.out.println("Class final grade: " + Rules.getGrade(classScoreAverage));
        System.out.println("------------------------------------------");
    }
}
