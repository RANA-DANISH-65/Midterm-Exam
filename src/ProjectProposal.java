public class ProjectProposal extends File{
    private boolean feasibilityChecked;
    private double budget;

    public ProjectProposal(String department, Priorty priorty, double budget, boolean feasibilityChecked) {
        super(department, priorty);
        this.feasibilityChecked = feasibilityChecked;
        this.budget = budget;
    }
    @Override
    public void processFile(){
        System.out.println("Process File");
    }

    public boolean isFeasibilityChecked() {
        return feasibilityChecked;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public String toString() {
        return String.format("%s | %f  |%s",super.toString(),this.getBudget(),this.feasibilityChecked);

        }
}
