import java.util.Arrays;

public class Student {

    String studentName;
    double[] assignmentsScores;
    double[] testsScores;
    double[] labsScores;
    double finalScores;
    String finalGrade;

    public Student(String studentName, double[] assignmentsScores, double[] testsScores, double[] labsScores) throws IllegalArgumentException {
        this.studentName = studentName;
        if (Rules.isCorrectTotalOfGradesProvided(assignmentsScores.length,testsScores.length,labsScores.length)){
            this.assignmentsScores = assignmentsScores;
            this.testsScores = testsScores;
            this.labsScores = labsScores;
        }else {
            throw new IllegalStateException("ERROR: Check the total of grades provided for assignments, tests and lab-works.");
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public double[] getAssignmentsScores() {
        return assignmentsScores;
    }

    public double[] getTestsScores() {
        return testsScores;
    }

    public double[] getLabsScores() {
        return labsScores;
    }

    public void setFinalScore() {
        this.finalScores =
                (Arrays.stream(getAssignmentsScores()).sum() / getAssignmentsScores().length) * 0.10
                        + (Arrays.stream(getTestsScores()).sum() / getTestsScores().length) * 0.70
                        + (Arrays.stream(getLabsScores()).sum() / getLabsScores().length) * 0.20;
    }

    public double getFinalScore(){
        return finalScores;
    }

    public void setFinalGrade() {
        this.finalGrade = Rules.getGrade(getFinalScore());
    }

    public String getFinalGrade() {
        return finalGrade;
    }
}
