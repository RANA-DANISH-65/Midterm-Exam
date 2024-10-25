public class GovernmentOrder extends File {
    private String description;

    public GovernmentOrder(String department, Priorty priorty, String description) {
        super(department, priorty);
        this.description = description;
    }
    @Override
    public void processFile(){
        System.out.println("Processing File");
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return String.format("%s  |%s",super.toString(),getDescription()

        );}
}
