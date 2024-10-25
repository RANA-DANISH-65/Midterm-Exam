public class Main{
    static{
        System.out.println("File Management System Initialized");
    }
    public static void main(String[] args) {
        Senior_Officer seniorOfficer = new Senior_Officer("Hassan", 5);
        Clerk clerk = new Clerk("Ali");
        File[] files = new File[3];
        files[0] = new GovernmentOrder("Finance", Priorty.URGENT, "Increase Budget for education");
        files[1] = new ProjectProposal("Health", Priorty.HIGH, 1500000.50, true);
        files[2] = new Notice("Education", Priorty.MEDIUM, "All schools reopen after vacations");
        for (int i = 0; i < files.length; i++) {
            seniorOfficer.assignFile(files[i],new Clerk("Ali"));
        }
        for (int i = 0; i < files.length; i++) {
            if (i == 0)
                clerk.processFile(files[i]);
            else
                seniorOfficer.processFile(files[i]);
        }
        File foundFile = seniorOfficer.findFile("FILE001");
        if (foundFile != null) {
            System.out.println("Found File:");
            System.out.println(foundFile);
        }
        System.out.println("File Details:");
       for (File file:files)
           System.out.println(file);
    }}