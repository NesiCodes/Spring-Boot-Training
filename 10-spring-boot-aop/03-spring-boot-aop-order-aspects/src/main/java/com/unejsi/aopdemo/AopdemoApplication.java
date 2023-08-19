package com.unejsi.aopdemo;

import com.unejsi.aopdemo.dao.AccountDAO;
import com.unejsi.aopdemo.dao.MembershipDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopdemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO accountDao, MembershipDAO membershipDao
	) {

		return runner -> {

			demoTheBeforeAdvice(accountDao, membershipDao
			);
		};
	}

	private void demoTheBeforeAdvice(AccountDAO accountDao, MembershipDAO membershipDao
	) {

		// call the business method
		Account myAccount = new Account();
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








