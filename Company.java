class Company {
    private int employeeCount = 10;

    class HeadBranch {
        public int getEmployeeCount() {
            // return Company.this.employeeCount;
            return employeeCount;
        }
    }
}