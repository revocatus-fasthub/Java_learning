package gettingobjectoriented;

import java.util.*;

public class Person {
    public String firstname;
    public String lastname;
    public Calendar birthday;
    
    public String fullname()
    {
    return firstname + " " + lastname;
    }
     public int age(Calendar today)
    {
    return today.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
    }
}
