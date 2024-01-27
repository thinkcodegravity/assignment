package Methods;

public class InsuranceDetails {
public String InsuranceDetailProvider(int age) {
	if (age<18) {
		return " You are too young to get insurance benefits";
	}else if(age>=18 && age<65) {
		return "You can get standard insurance plans";
	}else {
		return "You are eligible for special insurance plan";
	}
	
}
}



