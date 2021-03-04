
public abstract class Coffee {
	
	abstract void boilWater();
	abstract void brew();
	abstract void pourInCup();
	
	public final void create() {
		boilWater();
		brew();
		pourInCup();
	}
}
