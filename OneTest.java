package com.accenture.lkm.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS) //#1
public class OneTest {
	@BeforeAll
	void beforeAll() { //PUT STATIC BEFORE VOID IF U DONT LIKE #1
		System.out.println("Before all my test methods");
	}

	public OneTest(){
		System.out.println("I am here");
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("Before each my test method");
	}

	@AfterEach
	void afterEach() {
		System.out.println("After each my test method");
	}

	@AfterAll
 void afterAll() {
		System.out.println("After all my test methods");}
	
	//TODO1: Add Annotation
	@Test
	public void test1() {
		Assertions.assertEquals(2, 2, "1 + 1 = 2");
		System.out.println("I am in method1");
       
	}
	//TODO2: Add Annotation 
	@Test
	public void test2() {
		Assertions.assertEquals(2, 2, "1 + 1 = 2");
		System.out.println("I am in method2");
       
	}


}
