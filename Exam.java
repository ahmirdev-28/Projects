public class Exam extends Assessment {

    // Number of questions on the exam
    private int totalQuestions;

    // Number of questions missed by the student
    private int missedQuestions;

    // Points each question is worth
    private double pointsEach;

    /**
     * Constructor initializes exam data and calculates score.
     *
     * @param questions total number of questions on the exam
     * @param missed number of questions missed by the student
     */
    public Exam(int questions, int missed) {

        this.totalQuestions = questions;
        this.missedQuestions = missed;

        // Each question has equal weight toward 100 points
        this.pointsEach = 100.0 / totalQuestions;

        // Calculate final numeric score
        double calculatedScore = 100.0 - (missedQuestions * pointsEach);

        // Store score in parent class (Assessment)
        setScore((int) Math.round(calculatedScore));
    }

    /**
     * Returns how many points each question is worth.
     */
    public double getPointsEach() {
        return pointsEach;
    }
}