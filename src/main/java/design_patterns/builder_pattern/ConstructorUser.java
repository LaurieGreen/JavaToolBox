package design_patterns.builder_pattern;

public class ConstructorUser {

	private String firstName;
	private String lastName;
	private String email;

	public ConstructorUser( final String firstName, final String lastName, final String email ) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public static void main( String[] args ) {
		new ConstructorUser( "bob", "thornton", "bt@gmail.com" );
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}
}
