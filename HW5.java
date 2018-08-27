/* Java.Level1.Lesson5.HomeWork
@autor Ilya Anufriev
@version Aug 27, 2018
*/


class HW5{
	public static void main (String[] args){
		Person[] persArray=new Person [5];
		persArray[0]=new Person ("Ivan A.S.","Enginer","ivan@company.ru","89006669901",25000,25);
		persArray[1]=new Person ("Grigoriy P.C.","Director","grisha@company.ru","89006669902",50000,39);
		persArray[2]=new Person ("Dmitriy F.S.","Secretary","andrey@company.ru","89006669903",40000,50);
		persArray[3]=new Person ("Boris R.N.","Designer","boris@company.ru","89006669904",20000,30);
		persArray[4]=new Person ("Genadiy E.V.","Enginer","gena@company.ru","89006669905",25000,45);
		for (int i=0;i<persArray.length;i++){
			if (persArray[i].getAge()<=40){
			 persArray[i].printPerson();
			}
		}	
			
			
			
			
	}
}
/*class Cat {
	String name;
	String color;
	int age;
	
	Cat(String name, String color, int age){
		this.name=name;
		this.color=color;
		this.age=age;
	}
	
	
	String voice(){
		return "meow";
	}
		
}
*/

class Person {
	private String name;
	private String post;
	private String email;
	private String mobile;
	int price;
	int age;
	
	Person(String name, String post, String email, String mobile, int price, int age){
		this.name=name;
		this.post=post;
		this.email=email;
		this.mobile=mobile;
		this.price=price;
		this.age=age;
	}
	//Get's class Person
	String getName(){
		return name;
	}
	String getPost(){
		return post;
	}
	String getEmail(){
		return email;
	}
	String getMobile(){
		return mobile;
	}
	int getPrice(){
		return price;
	}
	int getAge(){
		return age;
	}
	
	void printPerson(){
		System.out.println("Name: "+name+" Post.: "+post+" Email: "+email+" Tel.: "+mobile+" Price: "+price+" Age: "+age);
		
	}
	
}