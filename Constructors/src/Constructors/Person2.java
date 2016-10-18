package constructors;

import java.util.*;

public class Person2 {
    private String firstname;
    private String lastname;
    private Calendar birthday;
    
    public Person2()
    {
    firstname = " ";
    lastname = " ";
    birthday = new GregorianCalendar();
    }        
    
    public Person2(String firstname, String lastname)
    {
    this.firstname = firstname;
    this.lastname = lastname;
    this.birthday = new GregorianCalendar();
    }
    
    public Person2(String firstname, String lastname, Calendar birthday)
    {
    this.firstname = firstname;
    this.lastname = lastname;
    this.birthday = birthday;
    }
    
    public String fullname()
    {
    return firstname + " " + lastname;
    }
     public int age(Calendar today)
    {
    return today.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
    }
}
