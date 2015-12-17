package useOfSuper;

/**
 * Created by Shahida Lucky on 11/29/2015.
 */
    public class Child extends Father{

        public Child(){
            super("Aqsa");
        }
        public String getProfession(){

            return super.profession;
        }
        public void appearanceOfChild(){
            super.appearance();
            System.out.println("Daughter looks like her father");
        }

    }

