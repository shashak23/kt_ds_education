package vacancehomework;

public class Employees {

	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private int phoneNumber;
	private int hireDate;
	private String jobId;
	private int salary;
	private int commissionPCT;
	private String managerId;
	private String department;
	
	public Employees(int employeeId, String firstName, String lastName, String email, int phoneNumber, int hireDate,
			String jobId, int salary, int commissionPCT, String managerId, String department) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.jobId = jobId;
		this.salary = salary;
		this.commissionPCT = commissionPCT;
		this.managerId = managerId;
		this.department = department;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getHireDate() {
		return hireDate;
	}
	public void setHireDate(int hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getCommissionPCT() {
		return commissionPCT;
	}
	public void setCommissionPCT(int commissionPCT) {
		this.commissionPCT = commissionPCT;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
