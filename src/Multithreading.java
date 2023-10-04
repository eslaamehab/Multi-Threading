
class Multithreading extends Thread {

    syscalls system;
    String choice;
    Multithreading(String choice) {
        this.choice = choice;
    }

    public void run() {

        try {
            switch(this.choice){
                case "read":
                   syscalls.readfile(syscalls.input("Read from a file, enter the name of the file"));
                    break;
                case "write":
                   syscalls.writeFile(syscalls.input("Enter file name"), syscalls.input("enter the data"));
                    break;
                case "print300":
                    syscalls.print300();
                    break;
                case "print500":
                    syscalls.print500to1000();
                    break;
                case "count":
                   syscalls.count(Integer.parseInt(syscalls.input("enter number  ")),Integer.parseInt(syscalls.input("enter number")));
                    break;

            }
        }
        catch (Exception e) {
            // Throwing an exception 
            System.out.println("Exception is caught");
        }
    }
}