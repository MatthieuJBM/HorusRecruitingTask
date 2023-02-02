package testing.wall;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Test;

import recruiting.exam.*;

public class TestWall {

	@Test
	public void count() {
		int count = 5;
		Wall wall = new Wall();
		wall.init();
		assertEquals(count, wall.count());
	}
	
	@Test
	public void findBlockByColor() {
		Wall wall = new Wall();
		wall.init();
		
		assertEquals(Optional.empty(), wall.findBlockByColor("green"));
		
		Optional<Wall> color = Optional.of((Wall) wall.getBlocks().get(0));
		assertEquals(color, wall.findBlockByColor("blue"));
		
		Optional<Wall> color1 = Optional.of((Wall) wall.getBlocks().get(3));
		assertEquals(color1, wall.findBlockByColor("grey"));
		
		Optional<Wall> color2 = Optional.of((Wall) wall.getBlocks().get(1));
		assertEquals(color2, wall.findBlockByColor("brown"));
	}
	
	@Test
	public void findBlockByMaterial() {
		
		
		
	}
	
	
	
	
	
}
