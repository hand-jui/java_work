package ch04;

//T에 무작위 클래스가 들어갈 수 없게 Material 클래스를 상속받은 클래스로 제한
public class GenericPrinter<T extends Material> {

	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}

}
