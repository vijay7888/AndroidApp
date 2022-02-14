import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;


import static java.lang.System.*;


public class arRayre {

   static WebDriver driver;
    String name;
    int age ;
    static String place = "Shimoga";

           arRayre(String name, int age){
            this.name = name;
            this.age = age;
            out.println(name + age+ place);
        }
    public static void main(String[] args) {

               arRayre ab = new arRayre( "vijay", 25);

               try {

               }

               catch (IndexOutOfBoundsException exception){

        }
               finally {
                  driver.close();
               }
}


}
