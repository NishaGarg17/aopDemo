package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyDemoLoggingAspect {
	// this is where we add all our related advises for logging

	// let's start with an @Before Advice

	// ** Below line of code will get executed before the execution of Account DAO's
	// ** addAccount method (that's why full qualified name of class is given), has
	// a
	// void return type and has Public modifier
	// @Before("execution(public void
	// com.luv2code.aopdemo.dao.AccountDAO.addAccount())")
	// ** Below line of code will get executed before the execution of any
	// ** addAccount method present in application, has a void return type and has
	// ** Public modifier
	// @Before("execution(public void addAccount())")
	// ** Below line of code will get executed before the execution of any method
	// ** which starts with add, has a void return type and has Public modifier
	// @Before("execution(public void add*())")
	// ** Below line of code will get executed before the execution of any method
	// ** which starts with add, has a void return type and has any modifier
	// @Before("execution(* void add*())")
	// ** Below line of code will get executed before the execution of any method
	// ** which starts with add, has a any return type and modifier skipped as it is
	// an
	// ** optional pattern
	// @Before("execution(* add*())")

	// ** Below line of code will get executed before the execution of any method
	// ** which starts with add, has a any return type, any modifier and has a
	// ** parameter of type Account
	// @Before("execution(* add*(com.luv2code.aopdemo.Account))")
	// @Before("execution(* add*(Account))") // ** This will give
	// ** invalidAbsoluteTypeName error as we didn't provide the
	// **fully qualified name of the class Account in the parameter
	// ** Below line of code will get executed before the execution of any method
	// ** which starts with add, has a any return type, any modifier and has a
	// ** first parameter of type Account and followed by 0 or more parameters
	// @Before("execution(* add*(com.luv2code.aopdemo.Account, ..))")
	// ** Below line of code will get executed before the execution of any method
	// ** which starts with add, has a any return type, any modifier and has 0 or more parameters of any type
	// @Before("execution(* add*(..))")
	// ** Below line of code will get executed before the execution of all the methods
	// ** which belongs to specific package name.any class name.any method name, has a any return type, any modifier and has 0 or more parameters of any type
	@Before("execution(* com.luv2code.aopdemo.*.*.*(..))")
	public void beforeAddAccountAdvice() {
		System.out.println("\n==========>>> Executing @Before Advice on addAccount()");
	}
}