package OOP;

abstract  class ATAbstraction {
    abstract void generateReport();

    public void showReport() {
        System.out.println("Report is being generated...");
       
    }
    static class ExtendReport extends ATAbstraction{
        @Override
        void generateReport() {
            System.out.println("Extend Report Generated successfully..!");
        }
    }
public static void main(String[] args) {
    ATAbstraction report = new ExtendReport();
   
    report.showReport();
    report.generateReport();
    
} }

//hiding implemenation details and showing only what must be done
//Parent child relationship - create object parent(left, ref) = child(object type, right) 
