package com.vin.parallelexecutions;

import org.testng.annotations.Test;

public class TestClass4 
{
	
	@Test
	public void testmethod1()
	{
		System.out.println("testclass4 >> testmethod12 >> " + Thread.currentThread().getId());
	}
	
	@Test
	public void testmethod2()
	{
		System.out.println("testclass4 >> testmethod13 >> " + Thread.currentThread().getId());
	}
	
	@Test
	public void testmethod3()
	{
		System.out.println("testclass4 >> testmethod14 >> " + Thread.currentThread().getId());
	}
	
	@Test
	public void testmethod4()
	{
		System.out.println("testclass4 >> testmethod15 >> " + Thread.currentThread().getId());
	}
}
