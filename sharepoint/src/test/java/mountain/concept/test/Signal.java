package mountain.concept.test;

public enum Signal {
	RED("This is red light"), GREEN("This is green light"), YELLOW(
			"This is yellow light");
	private String description;

	private Signal(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}
}
