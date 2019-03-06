// Create a test class
public class MyCITest  {
     
  String version;
  String TestName;
    
    public MyCITest() {
        TestName = "CI Testing";
        version = "0.1";
    }
  
    public static void main(String[] args) {
        MyCITest myTestObj = new MyCITest(); 

        System.out.println("Hello - version " + myTestObj.version );
    }
  }
  