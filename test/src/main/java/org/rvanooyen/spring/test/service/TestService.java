package org.rvanooyen.spring.test.service;

public interface TestService {
  /**
   * test if the service is initialized well
   *
   * @return true if springcontext initialized fields
   */
  boolean doSomething();

  /**
   * addes one entitiy to db
   */
  void addOne();

  /**
   * gets the amount of entities in the db
   * @return amount of entities in the db
   */
  int getCount();
}
