
public class StringDemo {
		String input;

		public StringDemo() {
			// TODO Auto-generated constructor stub
		}

		public String getInput() {
			return input;
		}

		public void setInput(String input) {
			this.input = input;
		}

		public String getRequiredData(String input) {
		if(!input.equals("")) {
			return input;
		}
		else {
			return "there is no string";
		}
			
			
			
}
}
