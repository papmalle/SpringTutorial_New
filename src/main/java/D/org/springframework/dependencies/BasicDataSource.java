package D.org.springframework.dependencies;

import org.springframework.beans.factory.annotation.Required;

public class BasicDataSource {

	private String driverClassName;
	private String url;
	private String username;
	private String password;
	
	private LoolClass lool;
	
	public BasicDataSource(){
		
	}
	
	public BasicDataSource(String driverClassName, String url, String username,
			String password) {
		super();
		this.driverClassName = driverClassName;
		this.url = url;
		this.username = username;
		this.password = password;
	}

	

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	@Required
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "BasicDataSource [driverClassName=" + driverClassName + ", url="
				+ url + ", username=" + username + ", password=" + password
				+ "]";
	}

	public LoolClass getLool() {
		return lool;
	}

	public void setLool(LoolClass lool) {
		this.lool = lool;
	}	
	
	
	
}
