

import java.time.LocalDate;

public abstract class File {
 private String department;
 private static int fileCounter=1;
 private LocalDate creationDate;
 private Priorty priorty;
 private String fileNumber;
 private Status status;

    public File(String department, Priorty priorty) {
        this.department = department;
        this.priorty = priorty;
        creationDate=LocalDate.now();
        this.fileNumber= String.format("FILE%03d",fileCounter++);
    }

    public Status getStatus() {
        return status;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Priorty getPriorty() {
        return priorty;
    }

    public String getDepartment() {
        return department;
    }

    public String getFileNumber() {
        return fileNumber;
    }
    public abstract void processFile();

    @Override
    public String toString() {
        return String.format("%s  |  %s  |%s  | %s  | %s  ",fileNumber,department,priorty,creationDate,status

        );
    }
}
