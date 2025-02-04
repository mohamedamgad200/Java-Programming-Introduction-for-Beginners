package streams.streamswithobjects;

public class Employee {
    private int id;
    private String firstName;
    private int yearOfService;

    public Employee(int id, String firstName, int yearOfService) {
        this.id = id;
        this.firstName = firstName;
        this.yearOfService = yearOfService;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public int getYerarOfService()
    {
        return yearOfService;
    }
    public void setgetYerarOfService(int yearOfService)
    {
        this.yearOfService=yearOfService;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
}
