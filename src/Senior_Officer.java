public class Senior_Officer extends Employee {
    private int fileCount=0;
    private int maxFiles;
    private Clerk[] clerks;
    private int clerkCounter=0;

    private File[] assignedFiles;

    public Senior_Officer(String name, int maxFiles) {
        super(name, "Senior Officer");
        this.maxFiles = maxFiles;
        assignedFiles=new File[maxFiles];
        clerks=new Clerk[10];
    }
    @Override
    public void assignFile(File file ,Clerk clerk){
        if(fileCount<maxFiles&&clerk!=null){
            clerks[clerkCounter++]=clerk;
            clerk.assignFile(file);
            assignedFiles[fileCount++]=file;
            System.out.println("Senior Officer "+getName()+" assigned file: "+file.getFileNumber());

        }else{
            System.out.println("Maximum file limit is Reached");
        }

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

        System.out.println("Senior Officer "+this.getName()+" processed File: "+file.getFileNumber());

    }
    public File findFile(String fileNumber){
        boolean isFound=false;
        File file=null;
        for (int i = 0; i < fileCount; i++) {
            if(assignedFiles[i].getFileNumber().equals(fileNumber))
            {isFound=true;
                System.out.println("File Found");
                file=assignedFiles[i];
                break;
            }
        }
        if(isFound){

            return file;
        }else{
            return null;
        }


    }


}
