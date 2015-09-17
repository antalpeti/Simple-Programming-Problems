package elementary.test;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import elementary.Problems;

public class ProblemsTest {

  /** The instance variable to test the not static methods. */
  private static Problems problems;
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
    System.setErr(new PrintStream(errContent));
  }

  @After
  public void cleanUpStreams() {
    System.setOut(null);
    System.setErr(null);
  }

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
    problems.problem01();
    Assert.assertEquals("Hello World!\r\n", outContent.toString());
  }

  /**
   * Test method for {@link elementary.Problems#problem02(java.io.InputStream, PrintStream)}.
   */
  @Test
  public final void testProblem02() {
    ByteArrayInputStream inContent = new ByteArrayInputStream("Peter".getBytes());
    problems.problem02(inContent, System.out);
    Assert.assertEquals("What is your name?\r\nWelcome Peter\r\n", outContent.toString());
    outContent.reset();
    inContent = new ByteArrayInputStream("John".getBytes());
    problems.problem02(inContent, System.out);
    Assert.assertEquals("What is your name?\r\nWelcome John\r\n", outContent.toString());
    System.setIn(null);
  }

  /**
   * Test method for {@link elementary.Problems#problem03(java.io.InputStream, PrintStream)}.
   */
  @Test
  public final void testProblem03() {
    ByteArrayInputStream inContent = new ByteArrayInputStream("Peter".getBytes());
    problems.problem03(inContent, System.out);
    Assert.assertEquals("What is your name?\r\nI don't know you.\r\n", outContent.toString());
    outContent.reset();
    inContent = new ByteArrayInputStream("Alice".getBytes());
    problems.problem02(inContent, System.out);
    Assert.assertEquals("What is your name?\r\nWelcome Alice\r\n", outContent.toString());
    outContent.reset();
    inContent = new ByteArrayInputStream("Bob".getBytes());
    problems.problem02(inContent, System.out);
    Assert.assertEquals("What is your name?\r\nWelcome Bob\r\n", outContent.toString());
    System.setIn(null);
  }

  /**
   * Test method for {@link elementary.Problems#problem04(java.io.InputStream, PrintStream)}.
   */
  @Test
  public final void testProblem04() {
    ByteArrayInputStream inContent = new ByteArrayInputStream("-1".getBytes());
    problems.problem04(inContent, System.out);
    Assert.assertEquals("Give a number?\r\nThe sum of from 1 to -1 is: 0\r\n",
        outContent.toString());
    outContent.reset();
    inContent = new ByteArrayInputStream("0".getBytes());
    problems.problem04(inContent, System.out);
    Assert
    .assertEquals("Give a number?\r\nThe sum of from 1 to 0 is: 0\r\n", outContent.toString());
    outContent.reset();
    inContent = new ByteArrayInputStream("1".getBytes());
    problems.problem04(inContent, System.out);
    Assert
        .assertEquals("Give a number?\r\nThe sum of from 1 to 1 is: 1\r\n", outContent.toString());
    outContent.reset();
    outContent.reset();
    inContent = new ByteArrayInputStream("10".getBytes());
    problems.problem04(inContent, System.out);
    Assert.assertEquals("Give a number?\r\nThe sum of from 1 to 10 is: 55\r\n",
        outContent.toString());
    outContent.reset();
    System.setIn(null);
  }
}
