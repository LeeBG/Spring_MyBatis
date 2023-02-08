package obj;

public class Toy {
	private Battery bat;
	
	public void run() {
		if(bat == null) {
			System.out.println("배터리가 없습니다.");
			return;
		}
		System.out.println("장난감이 움직입니다.");
	}

	public Battery getBat() {
		return bat;
	}

	public void setBat(Battery bat) {
		this.bat = bat;
	}


}
