package useOfSuper;

/**
 * Created by Shahida Lucky on 11/29/2015.
 */
public class Father {
    String lastName;
    String profession = "Supervisor";

    public Father(String lastName){
        this.lastName = lastName;
        System.out.println(lastName);
    }

    public void appearance(){
        System.out.println("mid size height");
    }

}
