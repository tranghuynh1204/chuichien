/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package murach.business;
import java.io.Serializable;
/**
 *
 * @author huynhthihuyentrang
 */
public class User implements Serializable {

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    private String firstName;
	private String lastName;
	private String email;
	private String dateOfBirth;
	private String hear;
	private String cbLike;
	private String cbSend;
	private String contact;

	public User() {
		firstName = "";
		lastName = "";
		email = "";
		dateOfBirth = "";
		hear = "";
		cbLike = "";
		cbSend = "";
		contact = "";
	}

	public User(String firstName, String lastName, String email, String dateOfBirth, String hear, String cbLike,
			String cbSend, String contact) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.hear = hear;
		this.cbLike = cbLike;
		this.cbSend = cbSend;
		this.contact = contact;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getHear() {
		return hear;
	}

	public void setHear(String hear) {
		this.hear = hear;
	}

	public String getCbLike() {
		return cbLike;
	}

	public void setCbLike(String cbLike) {
		this.cbLike = cbLike;
	}

	public String getCbSend() {
		return cbSend;
	}

	public void setCbSend(String cbSend) {
		this.cbSend = cbSend;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
}
