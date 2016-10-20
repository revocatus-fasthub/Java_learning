package objectclass;

class MyClass {
    public String value;
    
    public MyClass(String value)
    {
    this.value = value;
    System.out.println("A MyClass object was created with value: " + value);
    }
    
    public void MyMethod()
    {
    System.out.println("A MyMethod was called on MyClass object with value: " + value);
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj == null)
            return false;
        
        if(!(obj instanceof MyClass))
            return false;
        return value.equals(((MyClass)obj).value);
    }
    

}
