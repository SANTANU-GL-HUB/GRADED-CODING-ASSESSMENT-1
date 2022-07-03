package Santanu.com;

public class SuperDepartment {
	public String departmentName() {
		return "Super department";
	}
	public String getTodaysWork() {
		return "No Work as of now";
	}
	public String getWorkDeadline() {
		return "Nil";
	}
	public String isTodayAHoliday() {
		return "Today is not a holiday"
	}
	
}	
public class AdminDepartment extends SuperDepartment {
	public String departmentName() {
		return "Welcome to Admin department";
	}
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
}
public class HrDepartment extends SuperDepartment {
	public String departmentName() {
		return "Welcome to Hr department";
	}
	public String getTodaysWork() {
		return "Fill todays worksheet and mark your attendence";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String doActivity() {
		return "team lunch";
	}	
	
}
public class TechDepartment extends SuperDepartment {
	public String departmentName() {
		return "Welcome to Tech Department";
	}
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String getTechStackInformation() {
		return "core Java';
	}
}
public class Main {
	public static void main(String args[]) {
		HrDepartment k = new HrDepartment();
		TechDepartment k1 = new TechDepartment();
		AdminDepartment k2 = new AdminDepartment();
		
		
		System.out.println(k2.departmentName());
		System.out.println(k2.getTodaysWork());
		System.out.println(k2.getWorkDeadline());
		System.out.println(k2.isTodayAHoliday());
		
		System.out.println("");
		System.out.println("");
		
		System.out.println(k.departmentName());
		System.out.println(k.getTodaysWork());
		System.out.println(k.getWorkDeadline());
		System.out.println(k.isTodayAHoliday());
		
		System.out.println("");
		System.out.println("");
		
		System.out.println(k.departmentName());
		System.out.println(k.getTodaysWork());
		System.out.println(k.getWorkDeadline());
		
		System.out.println(k.isTodayAHoliday());
		
		
		
		
		
	}
}

