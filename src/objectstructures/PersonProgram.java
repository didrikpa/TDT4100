package objectstructures;


public class PersonProgram {
	public static void main(String[] args) {
		Person didrik = new Person("Didrik", 'M');
		Person sindre = new Person("Sindre", 'M');
		Person pappa = new Person("Magne", 'M');
		Person mamma = new Person("Annette", 'F');
		Person morfar = new Person("Jan", 'M');
		Person mormor = new Person("Anne Marie", 'F');
		Person farfar = new Person("Harald", 'M');
		Person farmor = new Person("Eva", 'F');
		mormor.addChild(mamma);
		morfar.addChild(mamma);
		farfar.addChild(pappa);
		farmor.addChild(pappa);
		didrik.setMother(mamma);
		pappa.addChild(didrik);
		mamma.addChild(sindre);
		pappa.addChild(sindre);
		mamma.removeChild(sindre);
		System.out.println(sindre.getFather());
		System.out.println(sindre.getMother());
		System.out.println(didrik.getFather());
		System.out.println(mamma.getFather().getName());
		System.out.println(mamma.getChildCount());
		System.out.println(pappa.getChildCount());
		System.out.println(mormor.getChildCount());
		System.out.println(farmor.getChildCount());
		
		
	
}

}
