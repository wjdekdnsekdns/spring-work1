package ch01;

public class MainTest1 {

	public static void main(String[] args) {
		Button button = new Button("button1");
		button.setIButtonListener(new IButtonListener() {
			
			@Override
			public void clickEvent(String event) {
				System.out.println("콜백 들옴" + event);
			}
		});
		button.click("fasdasdasdasd");
	}

}
