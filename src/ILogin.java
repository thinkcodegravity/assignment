/**
 * 
 */
package InheritanceAssignmentPPT;

/**
 * 
 */
public interface ILogin {
	public Boolean register(String userid ,String password ,String email);
	public Boolean login(String userid ,String password);
	public Boolean ChangePassword(String userid ,String password);

}
