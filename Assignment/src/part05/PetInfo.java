package src.part05;

//인터페이스명 Print
//+toPrint():String
//
//클래스명 : Pet
//-name: String
//-gender:boolean
//+age:int
//+Pat()
//+Pet(name:String,age:int,gender:boolean)
//+toString():String
//
//클래스명: Cat (Pet,Print상속받음)
//+Cat(name:String,gender:boolean,age:int)
//
//클래스명: Dog (Pet,Print상속받음)
//+Dog(name:String,gender:boolean,age:int)
//
//[출력결과]
//종류       이름     나이     성별     기타
//고양이     꼬냥이    1살      남     사냥을 좋아함
//강아지     찌야     3살      여     사람을 좋아함



public class PetInfo {

	public static void main(String[] args) {
		
		System.out.println("종류   이름   나이  성별   기타");
		System.out.println("------------------------------");
		
		
		Cat cat = new Cat("꼬냥이",false,1);
		Dog dog = new Dog("찌야",true,3);
		
		cat.toPrint();
		dog.toPrint();
	}

}
