package strategies;

public class ProfessorFineStrategy implements FineStrategy {
    @Override
    public double calculateFine(int daysOverdue) {
        return daysOverdue * 0.5; // $0.5 per day
    }
}
