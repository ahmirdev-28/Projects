import javax.swing.JOptionPane;

public class Runner {

    public static void main(String[] args) {

        int questions = 0;
        int missed = 0;

        try {

            String input;

            input = JOptionPane.showInputDialog("How many questions are on the exam?");
            questions = Integer.parseInt(input);

            input = JOptionPane.showInputDialog("How many questions did the student miss?");
            missed = Integer.parseInt(input);

            if (questions <= 0) {
                throw new ArithmeticException("Questions must be more than 0.");
            }

            if (missed < 0 || missed > questions) {
                throw new IllegalArgumentException("Missed questions can't be negative or more than total.");
            }

            Exam exam = new Exam(questions, missed);

            String message = "Each question is worth " + exam.getPointsEach() + " points.\n";
            message += "Score: " + exam.getScore() + "\n";
            message += "Grade: " + exam.getGrade();

            JOptionPane.showMessageDialog(null, message);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter numbers only.");

        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        System.exit(0);
    }
}