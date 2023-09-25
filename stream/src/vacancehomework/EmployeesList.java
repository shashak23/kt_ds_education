package vacancehomework;

import java.util.List;

public class EmployeesList {
	
	private List<Employees> employeesList;
	
	// 추가 
	public void addEmployees(Employees employee) {
        employeesList.add(employee);
    }

	// 사원번호로 반환
    public Employees findByEmployeeId(int employeeId) {
        for (Employees employee : employeesList) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null;
    }

    // 사원번호 삭제 
    public void removeByEmployeeId(int employeeId) {
        for (Employees employee : employeesList) {
            if (employee.getEmployeeId() == employeeId) {
                employeesList.remove(employee);
                return;
            }
        }
    }

    // 모든 내용 출력
    public void printAllEmployees() {
        System.out.println("사원 목록:");
        for (Employees employee : employeesList) {
            System.out.println("사번: " + employee.getEmployeeId() + ", 이름: " + employee.getFirstName() + " " + employee.getLastName());
        }
    }

}
