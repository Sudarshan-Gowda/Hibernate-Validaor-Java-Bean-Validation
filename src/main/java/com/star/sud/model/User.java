/**
 * 
 */
package com.star.sud.model;

import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Negative;
import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Pattern.Flag;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;

/**
 * @author Sudarshan
 *
 */
public class User {

	@NotNull(message = "Please enter Id")
	private Long userId;

	@Size(max = 20, min = 3, message = "Invalid Name, Size should be between 3 to 20")
	@NotEmpty(message = "Please enter name")
	private String userName;

	@Email(message = "Invalid Email")
	@NotEmpty(message = "Please enter email")
	private String userEmail;

	@Digits(integer = 3, fraction = 3, message = "Invalid age, Maximum valid number is 3")
	private int age;

	@Max(value = 5, message = "Invalid Reference 1, Maximum allowed is 5")
	private String userRef1;

	@Min(value = 3, message = "Invalid Reference 2, Minimum value should is 3")
	private String userRef2;

	@NotBlank(message = "Invalid Reference 3, Reference 3 Should not be blank")
	private String userRef3;

	@Null(message = "Invalid Reference 4, Reference 4 is null")
	private String userRef4;

	@Pattern(regexp = "YN", flags = {
			Flag.CASE_INSENSITIVE }, message = "Invalid Reference 5, Enter String not matches with the standards")
	private String userRef5;

	@Negative(message = "Invalid Reference 6, Value sould be negative")
	private int userRef6;

	@NegativeOrZero(message = "Invalid Reference 7, Input Number should be negative or Zero")
	private int userRef7;

	@Future(message = "Invalid Date1, It should be in future")
	private Date date1;

	@FutureOrPresent(message = "Invalid Date2, It should be in future or present")
	private Date date2;

	@PastOrPresent(message = "Invalid Date3, It should be in Past or present")
	private Date date3;

	@Range(min = 1, max = 3, message = "Invalid Reference 8, Range should be within 1 to 3")
	private int userRef8;

	@URL(message = "Invalid Reference 9, Invalid Url")
	private String userRef9;

	@CreditCardNumber(message = "Invalid Reference 10, It should not contain invalid character")
	private String userRef10;

	/**
	 * @param userId
	 * @param userName
	 * @param userEmail
	 * @param age
	 * @param userRef1
	 * @param userRef2
	 * @param userRef3
	 * @param userRef4
	 * @param userRef5
	 * @param userRef6
	 * @param userRef7
	 * @param date1
	 * @param date2
	 */
	public User(Long userId, String userName, String userEmail, int age, String userRef1, String userRef2,
			String userRef3, String userRef4, String userRef5, int userRef6, int userRef7, Date date1, Date date2,
			Date date3, int userRef8, String userRef9, String userRef10) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.age = age;
		this.userRef1 = userRef1;
		this.userRef2 = userRef2;
		this.userRef3 = userRef3;
		this.userRef4 = userRef4;
		this.userRef5 = userRef5;
		this.userRef6 = userRef6;
		this.userRef7 = userRef7;
		this.date1 = date1;
		this.date2 = date2;
		this.date3 = date3;
		this.userRef8 = userRef8;
		this.userRef9 = userRef9;
		this.userRef10 = userRef10;
	}

	// Setter And Getter

}
