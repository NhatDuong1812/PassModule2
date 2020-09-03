public class NhanVien {
    public int id;
    public String name;
    public int age;
    public String phoneNumber;
    public String email;

    public NhanVien() {
    }

    public NhanVien(int id, String name, int age, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return " ID: " + getId() + "\n" + " Name: " + getName() + "\n" + " Class: " + getAge() + "\n" + " Phone: " + getPhoneNumber() + "\n" + " Email: " + getEmail() + "\n";
    }
}

