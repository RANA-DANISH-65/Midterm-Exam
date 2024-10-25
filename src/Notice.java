public class Notice extends File{
    private String purpose;

    public Notice(String department, Priorty priorty, String purpose) {
        super(department, priorty);
        this.purpose = purpose;
    }
    @Override
    public void processFile(){
        System.out.println("File Processing");
    }

    public String getPurpose() {
        return purpose;
    }

    @Override
    public String toString() {
       return String.format("%s | %s ",super.toString(),this.getPurpose());
}}
