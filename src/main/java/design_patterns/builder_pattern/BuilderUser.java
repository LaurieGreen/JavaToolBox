package design_patterns.builder_pattern;

public class BuilderUser {

	private final String firstName; // mandatory inputs due to final keyword
	private final String lastName; // mandatory inputs due to final keyword
	private String email; // optional - not final

	// this static class builder object within our User
	public static class UserBuilder{
		private final String firstName; // mandatory inputs due to final keyword
		private final String lastName; // mandatory inputs due to final keyword
		private String email; // optional - not final

		public UserBuilder(String firstName, String lastName){
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public UserBuilder setEmailAddress(String emailAddress){
			this.email = emailAddress;
			return this;
		}

		public BuilderUser buildUser(){
			return new BuilderUser(this);
		}
	}

	// Back into our BuilderUser class object
	private BuilderUser(UserBuilder userBuilder){
		this.firstName = userBuilder.firstName;
		this.lastName = userBuilder.lastName;
		this.email = userBuilder.email;
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

	public static void main( String[] args ) {
		BuilderUser janeDoe = new BuilderUser.UserBuilder("jane", "doe").buildUser();
		BuilderUser johnDoe = new BuilderUser.UserBuilder("john", "doe").setEmailAddress( "jd@gmail.com" ).buildUser();
		System.out.println(janeDoe.getEmail());
		System.out.println(johnDoe.getEmail());
	}
}
