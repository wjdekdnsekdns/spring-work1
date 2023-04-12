package ch01;

public class Button {

	private String name;
	private IButtonListener iButtonListener;
	
	public Button(String name) {
		this.name = name;
	}
	
	public void setIButtonListener(IButtonListener buttonListener) {
		this.iButtonListener = buttonListener;
	}
	public void click(String massage) {
		if(iButtonListener != null) {
			this.iButtonListener.clickEvent(massage);
		}
	}
}
