package ComparableVSComparator;

public class Employee implements Comparable<Employee> {
    private String name;
    private int id;
    private int phone;

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getPhone(){
        return phone;
    }
    Employee(String name,int id, int phone){
        this.id=id;
        this.name=name;
        this.phone=phone;
    }

    public String toString(){
        return "id: "+id+" name: "+name+" phone: "+phone;
    }

    @Override
    public int compareTo(Employee o) {
        return this.phone-o.phone;
    }
}
