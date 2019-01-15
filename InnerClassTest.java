public class InnerClassTest {

    public static void main(String[] args) {
        Company.HeadBranch company = new Company().new HeadBranch();
        System.out.println(company.getEmployeeCount());
    }
}