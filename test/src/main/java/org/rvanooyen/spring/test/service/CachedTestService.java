package org.rvanooyen.spring.test.service;

public class CachedTestService implements TestService {

  private Integer count;

  private TestService testService;

  @Override
  public boolean doSomething() {
    return testService != null && testService.doSomething();
  }

  @Override
  public void addOne() {
    testService.addOne();
    count = null;
  }

  public int getCount() {
    if (count == null) {
      count = testService.getCount();
    }
    return count;
  }

  public void setTestService(TestService testService) {
    this.testService = testService;
  }
}
