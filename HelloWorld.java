/**
 * Created by SelvarajS on 7/8/2016.
 */
public class HelloWorld {
    private void printMethod(String name){
        System.out.println("Welcome "+name);

    }
    public static void main(String args[]){
        HelloWorld hw = new HelloWorld();
        hw.printMethod("Sankar Test");
    }
}
