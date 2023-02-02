package recruiting.exam;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure, CompositeBlock {
	
	private List<Block> blocks = new LinkedList<Block>();
	
	private String color;
	private String material;
	
	public Wall() {
		
	}
	
	public Wall(String color, String material) {
		this.color = color;
		this.material = material;
	}
	
	public void init() {
		blocks.add(new Wall("blue", "cement"));
		blocks.add(new Wall("brown", "cement"));
		blocks.add(new Wall("brown", "wood"));
		blocks.add(new Wall("grey", "metal"));
		blocks.add(new Wall("black", "paint"));
		
	}

	//zwraca liczbę wszystkich elementów tworzących strukturę
	@Override
	public int count() {
		// TODO Auto-generated method stub
		long count = blocks.stream().count();
		return (int) count;
	}

	// zwraca dowolny element o podanym kolorze
	@Override
	public Optional<Block> findBlockByColor(String color) {
		// TODO Auto-generated method stub
		Optional<Block> colorToFind = blocks.stream().filter(e -> e.getColor().contains(color)).findAny();
		if(colorToFind.isPresent()) return colorToFind;
		else return Optional.empty();
		//return Optional.empty();
	}

	// zwraca wszystkie elementy z danego materiału
	@Override
	public List<Block> findBlocksByMaterial(String material) {
		// TODO Auto-generated method stub
		//List<Block> materialToFind = blocks.stream().collect(Collectors.toList());
		List<Block> materialToFind = blocks.stream().filter(e -> e.getMaterial().contains(material)).collect(Collectors.toList());
		
		return materialToFind;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public String getMaterial() {
		// TODO Auto-generated method stub
		return material;
	}

	@Override
	public List<Block> getBlocks() {
		// TODO Auto-generated method stub
		return blocks;
	}
	
	@Override
	public String toString() {
		return "Wall [color=" + color + ", material=" + material + "]";
	}

}
