package check;

import constants.Constants;

public class Check {
	
	private static String firstName = "武口";
    private static String lastName = "雄喜";
	
    public static void main(String args[]) {
		printName(firstName,lastName);
		
		Pet Pet1 = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		
		Pet1.getName();
		
		Pet1.getMasterName();
				
		Pet1.introduce();
		
		RobotPet RobotPet1 = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		RobotPet1.introduce();
	}
	
	private static void printName(String FirstName, String LastName) {
		System.out.println("printNameメソッド → " + FirstName + LastName);
	} 

}
