package elementary.test;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import elementary.Problems;

public class ProblemsTest {

  /** The instance variable to test the not static methods. */
  private static Problems problems;

  /**
   * Setup before the tests start.
   *
   * @throws Exception the exception if something go wrong
   */
  @BeforeClass
  public static void setUp() throws Exception {
    problems = new Problems();
  }

  /**
   * Tear down after the tests finish.
   *
   * @throws Exception the exception if something go wrong
   */
  @AfterClass
  public static void tearDown() throws Exception {
    problems = null;
  }

  /**
   * Test method for {@link elementary.Problems#Problem01()}.
   */
  @Test
  public final void testProblem01() {
    Assert.assertEquals("Hello World!", problems.problem01());
  }

}
