package com.educacionit.clase5;

/**
 * {@code AccessModifiers} contains examples about access level modifiers
 * <p>
 * Documentation: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
 *
 * @author Jonathan Manera
 */
public class AccessModifiers {

    /*
         public modifier is visible to all classes everywhere
     */

    public String worldAttribute;
    protected String superclassAttribute;


    /*
        protected modifier specifies that the member can be accessed within its own package, classes and subclasses
     */
    String packageAttribute;
    private String classAttribute;


     /*
        no modifier or 'package-private' specifies that the member can be accessed within its own package and classes
     */

    public void worldMethod() {
    }

    protected void superclassMethod() {
    }


    /*
        private specifies that the member can be accessed only within its own classes
     */

    void packageMethod() {
    }

    private void classMethod() {
    }

}
