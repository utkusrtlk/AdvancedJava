package accessmodifiers;

public class ErisimTest {

	public static void main(String[] args) {
		
		Test testObjesi = new Test();
		
		System.out.println("Erisebildigim degiskenler : \n" +
		testObjesi.duz + "\n" + testObjesi.herkese + "\n" + testObjesi.korumali);

		System.out.println("Gizli :" + testObjesi.getGizli());
	}

}
