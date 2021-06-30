import java.util.Arrays;

public class Student {

    String studentName;
    double[] assignmentsScores;
    double[] testsScores;
    double[] labsScores;
    double finalScore;
    String finalLetterGrade;
    double assignmentsScoresAverage;
    double testsScoresAverage;
    double labsScoresAverage;

    public Student(String studentName, double[] assignmentsScores, double[] testsScores, double[] labsScores) throws IllegalArgumentException {
        this.studentName = studentName;
        if (Rules.isCorrectTotalOfGradesProvided(assignmentsScores.length, testsScores.length, labsScores.length)) {
            this.assignmentsScores = assignmentsScores;
            this.testsScores = testsScores;
            this.labsScores = labsScores;
        } else {
            throw new IllegalStateException("ERROR: Check total of grades provided for assignments, tests and lab-works.");
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

    public void setAssignmentsScoresAverage() {
        this.assignmentsScoresAverage = Rules.getAverage(getAssignmentsScores());
    }

    public double getAssignmentsScoresAverage() {
        return assignmentsScoresAverage;
    }

    public void setTestsScoresAverage() {
        this.testsScoresAverage = Rules.getAverage(getTestsScores());
    }

    public double getTestsScoresAverage() {
        return testsScoresAverage;
    }

    public void setLabsScoresAverage() {
        this.labsScoresAverage = Rules.getAverage(getLabsScores());
    }

    public double getLabsScoresAverage() {
        return labsScoresAverage;
    }

    public void setFinalScore() {
        this.finalScore =
                (Arrays.stream(getAssignmentsScores()).sum() / getAssignmentsScores().length) * 0.10
                        + (Arrays.stream(getTestsScores()).sum() / getTestsScores().length) * 0.70
                        + (Arrays.stream(getLabsScores()).sum() / getLabsScores().length) * 0.20;
    }

    public double getFinalScore() {
        return finalScore;
    }

    public void setFinalLetterGrade() {
        this.finalLetterGrade = Rules.getGrade(getFinalScore());
    }

    public String getFinalLetterGrade() {
        return finalLetterGrade;
    }
}
