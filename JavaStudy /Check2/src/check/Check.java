package check;

import constants.Constants;
//constantsパッケージのConstants.javaの定数を利用するためインポートする
public class Check {
	
	//課題１【Check.java】にてフィールド変数firstNameとlastNameを宣言し、
	//firstName →　自分の名字　lastName →　自分の名前で初期化しなさい。
	//なお、変数のアクセス修飾子は「private」とする。
	//main関数で値を利用するのでstaticを付ける
	private static String firstName = "武口";
    private static String lastName = "雄喜";
	
    
    public static void main(String args[]) {
    	//課題２のメソッドの呼び出し
		printName(firstName,lastName);
		
		//課題３【Check.java】にてPetクラスとRobotPetクラスをインスタンス化して、下記の完成イメージを出力させなさい。
		
		//petクラスをインスタンス化
		Pet Pet1 = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		
		//Petクラスのメソッドを使って出力
		Pet1.introduce();
		
		//RobotPetクラスをインスタンス化
		RobotPet RobotPet1 = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		
		//RoboPetクラスのメソッドを使って出力
		RobotPet1.introduce();
	}
	
    //課題２【Check.java】にてfirstNameとlastNameを引数で受け取って、
    //連結して表示させるメソッド「printName」を作成しなさい。
    //作成した関数のアクセス修飾子は「private」とする。
    //privateなのでクラス内部からのみ、アクセスが可能です。
	private static void printName(String FirstName, String LastName) {
		System.out.println("printNameメソッド → " + FirstName + LastName);
	} 

}
