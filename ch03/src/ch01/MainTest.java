package ch01;

public class MainTest {
	public static void main(String[] args) {
		Button button = new Button("button1");
		
		button.setiButtonListener(new IButtonListener() {
			
			@Override
			public void clickEvent(String event) {
				System.out.println("콜백 함수 들어옴" + event);
			}
		});
		button.click("asdasdasd");
	}
}
