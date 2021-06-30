import java.util.ArrayList;

public class Main {

    private static double classScoreSum;

    public static void main(String[] args) {

        /*adding data*/
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("Joao", new double[]{80, 50, 40, 20}, new double[]{75, 75}, new double[]{78.20, 77.20}));
        studentArrayList.add(new Student("Maria", new double[]{92, 96, 94, 90}, new double[]{90, 90}, new double[]{97.90, 98.72}));
        studentArrayList.add(new Student("Jose", new double[]{97, 82, 93, 90}, new double[]{98, 77}, new double[]{80, 80}));
        studentArrayList.add(new Student("Camila", new double[]{87, 72, 63,0}, new double[]{0, 87}, new double[]{8, 60}));

        ArrayList<Double> classStudentsFinalScoreList = new ArrayList<>();



        for (Student student : studentArrayList) {
            /*set assignment, test and lab average scores from each students*/
            student.setAssignmentsScoresAverage();
            student.setTestsScoresAverage();
            student.setLabsScoresAverage();
            /*set final scores and final letter grade from each students*/
            student.setFinalScore();
            student.setFinalLetterGrade();
            /*show student data on console*/
            System.out.println("Student name: " + student.getStudentName());
            System.out.println("Assignments average score: " + student.getAssignmentsScoresAverage());
            System.out.println("Tests average score: " + student.getTestsScoresAverage());
            System.out.println("Labs average score: " + student.getLabsScoresAverage());
            System.out.println("Final score: " + student.getFinalScore());
            System.out.println("Final grade: " + student.getFinalLetterGrade());
            System.out.println("------------------------------------------");
            classStudentsFinalScoreList.add(student.getFinalScore());
        }
        /*get average score and letter grade from class*/
        for (Double studentScore : classStudentsFinalScoreList) {
            classScoreSum += studentScore;
        }
        double classScoreAverage = classScoreSum / classStudentsFinalScoreList.size();
        /*show class data on console*/
        System.out.println("Class final score: " + String.format("%.2f", classScoreAverage));
        System.out.println("Class final grade: " + Rules.getGrade(classScoreAverage));
        System.out.println("------------------------------------------");
    }
}
