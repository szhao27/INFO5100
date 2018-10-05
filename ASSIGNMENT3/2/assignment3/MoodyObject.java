package assignment3;

public abstract class MoodyObject {
	protected abstract String getMood();
	protected abstract void expressFeelings();
	public void queryMood() {
		System.out.println("I feel "+getMood()+" today! \n");
	    }
	public static void main(String[] args) {
		MoodyObject x=new HappyObject();
		MoodyObject y=new SadObject();
		PsychiatristObject Psychiatrist= new PsychiatristObject();
		Psychiatrist.examine(x);
		Psychiatrist.observe(x);
		Psychiatrist.examine(y);
		Psychiatrist.observe(y);
	}
}



