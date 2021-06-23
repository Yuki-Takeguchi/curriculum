package check;

import constants.Constants;

public class Check {
	
	private static String firstName = "武口";
    private static String lastName = "雄喜";
	
    public static void main(String args[]) {
		printName(firstName,lastName);
		
		Constants Constans1 = new Constants();
		Pet Pet1 = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		
		String name = Pet1.getName();
		System.out.println("□僕の名前は" + name + "です");
		
		String masterName = Pet1.getMasterName();
		System.out.println("□ご主人様は" + masterName + "です");
		
		RobotPet RobotPet1 = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		RobotPet1.introduce();
	}
	
	private static void printName(String FirstName, String LastName) {
		System.out.println("printNameメソッド → " + FirstName + LastName);
	} 

}
