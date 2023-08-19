package com.unejsi.aopdemo;

import com.unejsi.aopdemo.dao.AccountDAO;
import com.unejsi.aopdemo.dao.MembershipDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class AopdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopdemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO accountDao, MembershipDAO membershipDao) {

		return runner -> {

			// demoTheBeforeAdvice(accountDao, membershipDao);
			// demoTheAfterReturningAdvice(accountDao);
			// demoTheAfterThrowingAdvice(accountDao);

			demoTheAfterAdvice(accountDao);

		};
	}

	private void demoTheAfterAdvice(AccountDAO accountDao) {

		// call method to find the accounts
		List<Account> theAccounts = null;

		try {
			// add a boolean flag to simulate exceptions
			boolean tripWire = false;
			theAccounts = accountDao.findAccounts(tripWire);
		}
		catch (Exception exc) {
			System.out.println("\n\nMain Program: ... caught exception: " + exc);
		}

		// display the accounts
		System.out.println("\n\nMain Program: demoTheAfterAdvice");
		System.out.println("----");

		System.out.println(theAccounts);

		System.out.println("\n");
	}

	private void demoTheAfterThrowingAdvice(AccountDAO accountDao) {

		// call method to find the accounts
		List<Account> theAccounts = null;

		try {
			// add a boolean flag to simulate exceptions
			boolean tripWire = true;
			theAccounts = accountDao.findAccounts(tripWire);
		}
		catch (Exception exc) {
			System.out.println("\n\nMain Program: ... caught exception: " + exc);
		}

		// display the accounts
		System.out.println("\n\nMain Program: demoTheAfterThrowingAdvice");
		System.out.println("----");

		System.out.println(theAccounts);

		System.out.println("\n");

	}

	private void demoTheAfterReturningAdvice(AccountDAO accountDao) {

		// call method to find the accounts
		List<Account> theAccounts = accountDao.findAccounts();

		// display the accounts
		System.out.println("\n\nMain Program: demoTheAfterReturningAdvice");
		System.out.println("----");

		System.out.println(theAccounts);

		System.out.println("\n");
	}

	private void demoTheBeforeAdvice(AccountDAO accountDao, MembershipDAO membershipDao) {

		// call the business method
		Account myAccount = new Account();
		myAccount.setName("Madhu");
		myAccount.setLevel("Platinum");

		accountDao.addAccount(myAccount, true);
		accountDao.doWork();

		// call the accountdao getter/setter methods
		accountDao.setName("foobar");
		accountDao.setServiceCode("silver");

		String name = accountDao.getName();
		String code = accountDao.getServiceCode();

		// call the membership business method
		membershipDao.addSillyMember();
		membershipDao.goToSleep();

	}

}








