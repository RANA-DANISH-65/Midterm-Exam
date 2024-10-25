public class Clerk extends Employee {
    File[] file;
    private int fileCouter;

    public Clerk(String name) {
        super(name, "Clerk");
    }

    public void assignFile(File file){
//        System.out.println("Assigning File");
    }

    public void assignFile(File file,Clerk clerk){
        System.out.println("Assigned File");
    }
    @Override
    public void processFile(File file){
        file.setStatus(Status.IN_PROGRESS);
        if(file instanceof GovernmentOrder){
            System.out.println("Government Order is being Processed: "+file.getFileNumber());
        }else if(file instanceof Notice){
            System.out.println("Notice is being Processed: "+file.getFileNumber());
        }else if(file instanceof ProjectProposal){
            System.out.println("Project Proposal is Being Processed: "+file.getFileNumber());
        }
        System.out.println("Clerk "+this.getName()+" processed File: "+file.getFileNumber());
    }
}
