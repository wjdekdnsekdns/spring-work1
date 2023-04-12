package ch01;

public class Button {

	private String name;
	private IButtonListener iButtonListener;
	public Button(String name) {
		this.name = name;
	}
	public void setiButtonListener(IButtonListener iButtonListener) {
		this.iButtonListener = iButtonListener;
	}
	public void click(String message) {
		if(iButtonListener != null) {
			this.iButtonListener.clickEvent(message);
			System.out.println(name);
		}
	}
}
