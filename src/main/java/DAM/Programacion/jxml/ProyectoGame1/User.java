package DAM.Programacion.jxml.ProyectoGame1;

import java.util.ArrayList;

public class User {
	private String username;
	private String password;
	private ArrayList<User> usuarios = new ArrayList<User>();
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
    /**
	 * @return the usuarios
	 */
	public ArrayList<User> getUsuarios() {
		return usuarios;
	}
	/**
	 * @param usuarios the usuarios to set
	 */
	public void setUsuarios(ArrayList<User> usuarios) {
		this.usuarios = usuarios;
	}
	/**
     * Agrega un usuario al ArrayList de usuarios.
     * @param user el usuario a agregar.
     */
    public void addUser(User user) {
        usuarios.add(user);
    }
}
