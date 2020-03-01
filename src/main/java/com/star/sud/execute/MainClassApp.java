/**
 * 
 */
package com.star.sud.execute;

import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.star.sud.model.User;

/**
 * @author Sudarshan
 *
 */
public class MainClassApp {

	public static void main(String[] args) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

		Validator validator = factory.getValidator();

		User user = new User(null, "123", "test123", 12456, "1234567", "1", "", null, "y", 2, 1, new Date(),
				addDays(-2), addDays(2), 5, "test123.com", "123");

		Set<ConstraintViolation<User>> constraintViolations = validator.validate(user);
		if (constraintViolations.size() > 0) {
			for (ConstraintViolation<User> constraintViolation : constraintViolations) {
				System.out.println(constraintViolation.getMessage());
			}
		} else
			System.out.println("Valid Object");

	}

	public static Date addDays(int days) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, days);
		return cal.getTime();
	}

}
