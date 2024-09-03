package EX_10082024;

import EX_04082024.Inheritance.SingleInheritance.Son;

public class Lab_16 {

    public static void main(String[] args) {

        Company company = new Company();

        company.companyDetails();
//        System.out.println(company.getCompanyId());
//        System.out.println(company.getCompanyName());
//
//        company.setCompanyId(4343332);

//        System.out.println(company.companyId);


            company.setEmployee_name("Kishan");
            company.setEmp_id(922332);

//        System.out.println(company.getCompanyName());
//        System.out.println(company.getCompanyId());
        System.out.println("Employee Name is : " + company.getEmployee_name());
        System.out.println("Employee Id : " + company.getEmp_id());
    }
}

class  Company{


    private  String CompanyName;
    private int companyId;
    private  String Employee_name;
    private  int Emp_id;

    public String getCompanyName() {
        return CompanyName;
    }

//    public void setCompanyName(String companyName) {
//        CompanyName = companyName;
//    }

    public int getCompanyId() {
        return companyId;
    }

//    public void setCompanyId(int companyId) {
//        this.companyId = companyId;
//    }


    public String getEmployee_name() {
        return Employee_name;
    }

    public void setEmployee_name(String employee_name) {
        Employee_name = employee_name;
    }

    public int getEmp_id() {
        return Emp_id;
    }

    public void setEmp_id(int emp_id) {
        Emp_id = emp_id;
    }

    Company(){

        CompanyName = "SSL infra LTD";
        companyId = 2432233;
    }

    Company(String companyName, int companyId){

        CompanyName = companyName;
        this.companyId = companyId;
    }

    public Company(String companyName, int companyId, String employee_name, int emp_id) {
        CompanyName = companyName;
        this.companyId = companyId;
        Employee_name = employee_name;
        Emp_id = emp_id;
    }

    void companyDetails(){

        System.out.println("Company Name : " + CompanyName);
        System.out.println("Company Id: "+ companyId);
    }

}
