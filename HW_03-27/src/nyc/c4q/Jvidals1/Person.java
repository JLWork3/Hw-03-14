package nyc.c4q.Jvidals1;

/**
 * Created by s3a on 3/23/15.
 * Janneisy Vidals
 * 2.1 Accesscode
 * HW Excercises
 * Description:
 * Due March 27, 2015.
 */
public class Person
{


    private String name;
    private String phoneNumber;
    private String city;


    //    public void Person(){
    //
    //
    //    }
    public Person(String name)
    {
        this.name = name;


    }

    public String getCity()
    {
        return city;


    }

    public void setCity(String city)
    {
        this.city = city;


    }

    public String getPhoneNumber()
    {
        return phoneNumber;


    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;


    }

    public String getName()
    {
        return name;


    }

    public void setName(String name)
    {
        this.name = name;
    }
    // Write a function called checkSameCity which accepts as input two Person instances
    // and checks if they live in the same city. The function should return a boolean value

    public static Boolean checkSameCity(Person personA, Person personB)
    {

        if((personA.getCity().equals(personB.getCity())))
        {
            return true;  //.equals to compare two string objects

        }
        else
        {
            return false;
        }

    }


    public static Person registerChild(Person parent)
    {
        Person child = new Person("Abc");
        child.setPhoneNumber(parent.getPhoneNumber());
        child.setCity(parent.getCity());
        return child;
    }

    public static void main(String[] args) {



    }

}



