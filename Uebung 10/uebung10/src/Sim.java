public class Sim implements Vampirism{
    private String Firstname = "";
    private String Lastname = "";
    private boolean Sex = true;
    //true = female
    //false = male

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }
    
    public boolean getSex() {
        return Sex;
    }
    public void setSex(boolean sex) {
        Sex = sex;
    }

    @Override
    public void Thirst(Object type) {
        //Bite and Drink
    }
}
