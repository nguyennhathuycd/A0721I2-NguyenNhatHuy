package xay_dung_lop_chi_ghi_trong_java;

public class Student {
    private String name;
    private String classes;

    public Student() {
        name = "John";
        classes = "CO2";
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    void setClasses(String classes) {
        this.classes = classes;
    }
}
