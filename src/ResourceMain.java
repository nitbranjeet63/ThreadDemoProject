
public class ResourceMain {
	public static void main(String[] args) {
		Resource resource = new Resource();
		ResourceThread John = new ResourceThread(resource, "John is using the account");
		ResourceThread Smith = new ResourceThread(resource, "Smith is using the account");
	}
}
