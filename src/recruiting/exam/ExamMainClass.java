package recruiting.exam;

import java.util.ArrayList;

public class ExamMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Wall wall = new Wall();
		wall.init();
		wall.getBlocks();
		System.out.println(wall.getBlocks());
		
		//checking count() method.
		System.out.println(wall.count());
		//checking findBlockByColor() method.
		System.out.println(wall.findBlockByColor("green"));
		System.out.println(wall.findBlockByColor("brown"));
		System.out.println(wall.findBlockByColor("grey"));
		//checking findBlockByMaterial() method.
		System.out.println(wall.findBlocksByMaterial("cement"));
		System.out.println(wall.findBlocksByMaterial("wood"));
		System.out.println(wall.findBlocksByMaterial("metal"));
		System.out.println(wall.findBlocksByMaterial("paint"));
		
	}

}
