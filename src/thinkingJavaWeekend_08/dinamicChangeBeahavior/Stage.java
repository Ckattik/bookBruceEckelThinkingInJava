package thinkingJavaWeekend_08.dinamicChangeBeahavior;

public class Stage {

	private Actor actor = new HappyActor();
	
	
	
	public Stage() {
		// TODO Auto-generated constructor stub
	}
	
	public void change() {
		actor = new SadActor();
	}
	
	public void perfomPlay() {
		actor.act();
	}

}
