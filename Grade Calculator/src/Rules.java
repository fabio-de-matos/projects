import java.util.Arrays;

public class Rules {

    public static String getGrade (double average){
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "E";
        }
    }

    public static boolean isCorrectTotalOfGradesProvided(int assignmentsScoresLength, int testsScoresLength, int labsScoresLength) {
        if(assignmentsScoresLength ==4 && testsScoresLength==2 && labsScoresLength==2){
            return true;
        }else {
            return false;
        }
    }
}
