package com.nit.methodo_verriding;

class RBI{
	protected String ifscCode = "RBIHYD0001";
	
	public String loan() {
		return "Provide the loan to customer";
	}
}

class SBI extends RBI{
	protected String ifscCode = "SBIHYD00012";
	
	@Override
	public String loan() {
		super.loan();
		return "Providing loan @ 9.2% ROi";
	}
}

public class VariableHidding {

	public static void main(String[] args) {
		RBI rbi = new SBI();
		System.out.println(rbi.ifscCode +" : "+rbi.loan());

	}

}
