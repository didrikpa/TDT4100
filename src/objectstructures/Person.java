package objectstructures;

import java.util.ArrayList;

public class Person {

	private String name;
	private char gender;
	private Person mother = null;
	private Person father = null;
	private ArrayList<Person> children = new ArrayList<Person>();

	public Person(String name, char gender) {
		if (!(gender == 'F' || gender == 'M')) {
			throw new IllegalArgumentException();
		}
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Person getMother() {
		return mother;
	}

	public Person getFather() {
		return father;
	}

	public int getChildCount() {
		return children.size();
	}

	public Person getChild(int n) {
		if (n < 0 || n > getChildCount()) {
			throw new IndexOutOfBoundsException();
		}
		return children.get(n);
	}

	public void addChild(Person child) {
		if (!children.contains(child)) {
			this.children.add(child);
			if (this.gender == 'M') {
				child.setFather(this);
			} else {
				child.setMother(this);
			}
		}
		return;
	}

	public void removeChild(Person child) {
		if(!this.children.contains(child)){
			return;
		}
		this.children.remove(child);
		if (((child.getMother() == null) || (child.getFather() == null))) {
            return;
		}
		if (getGender() == 'M') {
			child.setFather(null);
		} else if(getGender() == 'F') {
			child.setMother(null);
		}
	}

	public void setMother(Person child) {
		if (child==null) {
            if(this.mother != null) {
                    Person temp = this.mother;
                    this.mother = null;
                    temp.removeChild(this);
                    return;
            }
    }
   
    if (!(child.getGender() == 'F') || this == child) {
            throw new IllegalArgumentException();
    }
   
   
    if (!child.children.contains(this)) {
            child.addChild(this);
    }
    this.mother = child;
}

	public void setFather(Person child) {
	      if (child==null) {
              if(this.father != null) {
                      Person temp = this.father;
                      this.father = null;
                      temp.removeChild(this);
                      throw new IllegalArgumentException();
              }
      }
     
      if (!(child.getGender() == 'M') || this == child) {
              throw new IllegalArgumentException();
      }
      if (!child.children.contains(this)) {
              child.addChild(this);
      }
      this.father = child;
}

}
