package strategies;

public class StudentFineStrategy implements FineStrategy {
    @Override
    public double calculateFine(int daysOverdue) {
        return daysOverdue * 1.0; // $1 per day
    }
}
