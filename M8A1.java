import java.io.*;
import java.text.DecimalFormat;

public class M8A1 {
    public static void main(String[] args) {

        String inputFile = "pay.csv";      // Input CSV file
        String outputFile = "output.csv";  // Output CSV file

        DecimalFormat df = new DecimalFormat("$0.00");  // Format weekly pay

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            // Write header row
            writer.write("EmpID,PayRate,HoursWorked,WeeklyPay");
            writer.newLine();

            String line = reader.readLine(); // read header
            line = reader.readLine();        // move to first data row

            while (line != null) {
                String[] parts = line.split(",");

                String empID = parts[0];
                double payRate = Double.parseDouble(parts[1]);
                double hoursWorked = Double.parseDouble(parts[2]);

                double weeklyPay;

                // Overtime calculation
                if (hoursWorked > 40) {
                    double overtimeHours = hoursWorked - 40;
                    weeklyPay = (40 * payRate) + (overtimeHours * payRate * 1.5);
                } else {
                    weeklyPay = hoursWorked * payRate;
                }

                // Format weekly pay
                String weeklyPayFormatted = df.format(weeklyPay);

                // Build output line
                String outputLine = empID + "," + payRate + "," + hoursWorked + "," + weeklyPayFormatted;

                writer.write(outputLine);
                writer.newLine();

                line = reader.readLine(); // next row
            }

            reader.close();
            writer.close();

            System.out.println("Processing complete. Output written to output.csv");

        } catch (IOException e) {
            System.out.println("Error reading or writing files.");
            e.printStackTrace();
        }
    }
}
