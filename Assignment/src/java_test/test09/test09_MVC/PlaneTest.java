package src.java_test.test09.test09_MVC;

import java.util.ArrayList;
import java.util.List;


public class PlaneTest {

	public static void main(String[] args) {
		PlaneController pc = new PlaneController();
		List<PlaneModel> pList = new ArrayList<>();
		PlaneModel cargo = new Cargoplane2("L747",1000);
		PlaneModel air = new Airplane2("C40",1000);
		pList.add(air);
		pList.add(cargo);
		
		//기본정보 출력
		pc.show(pList);
		//view를 호출하는 controller호출할때 메인에서 값을 넘기게하고싶지 않았는데 ... 그렇게 됐다.
		//출력 템플릿을 뷰에 넣는 과정에서 출력템플릿을 두번 출력할수는 없으니까 값들을 한꺼번에 받아야하는데 그걸 컬렉션으로 했다.
		//그랬더니 메인에서 값을 넘기지않고는 출력할 수가 없다. 컨트롤러 단에서 해보려고 했는데 그게 뭔가 더 모양새가 이상한 거 같아서 그냥 이렇게 함.
		System.out.println();
				
		//100운항
		pc.flight(cargo,100);
		pc.flight(air,100);
		pc.show(pList);
		
		System.out.println();
		
		//200주유
		pc.refuel(cargo,200);
		pc.refuel(air,200);
		pc.show(pList);
		
		
	}

}
