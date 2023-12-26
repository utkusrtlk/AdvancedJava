package abstractclass.and.interfaces;

import accessmodifiers.Test;

public class OutsideErisim extends Test{

	public static void main(String[] args) {

		OutsideErisim outsideErisimObjesi = new OutsideErisim();
		
		System.out.println("Eristigim degiskenler : \n" + 
				outsideErisimObjesi.korumali +"\n"+ outsideErisimObjesi.herkese);

	}

}
