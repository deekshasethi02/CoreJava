
public class Document {
		String title;
		String filepath;
		
		
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getFilepath() {
			return filepath;
		}
		public void setFilepath(String filepath) {
			this.filepath = filepath;
		}
		
		public String showDocumentInformation() {
			return "Document [title=" + title + ", filepath=" + filepath + "]";
		}
		
		
}
