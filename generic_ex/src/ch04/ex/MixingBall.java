package ch04.ex;

public class MixingBall<T extends Ingredients> {

	private T ingredients;

	public T getIngredients() {
		return ingredients;
	}

	public void setIngredients(T ingredients) {
		this.ingredients = ingredients;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
