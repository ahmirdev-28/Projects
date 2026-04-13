public class Assessment {
    private int score;  // Numeric score

    public void setScore(int s) {
        this.score = s;
    }

    public int getScore() {
        return this.score;
    }

    public char getGrade() {
        char letterGrade;

        switch (this.score / 10) {
            case 10:
            case 9:
                letterGrade = 'A';
                break;
            case 8:
                letterGrade = 'B';
                break;
            case 7:
                letterGrade = 'C';
                break;
            case 6:
                letterGrade = 'D';
                break;
            default:
                letterGrade = 'F';
                break;
        }

        return letterGrade;
    }
}