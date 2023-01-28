/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 19:24:00 GMT 2023
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Collector;
import org.jsoup.select.Evaluator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Collector_ESTest extends Collector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Evaluator.IndexLessThan evaluator_IndexLessThan0 = new Evaluator.IndexLessThan(2597);
      Document document0 = new Document("rL%hi,?5w-]6f#$IG]");
      Document document1 = document0.normalise();
      Element element0 = Collector.findFirst(evaluator_IndexLessThan0, document1);
      assertEquals(0, element0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("]eb}@.");
      Evaluator.Matches evaluator_Matches0 = new Evaluator.Matches(pattern0);
      Document document0 = Document.createShell("]eb}@.");
      document0.append("ZC3U)Fls@0WNe0!3");
      Element element0 = Collector.findFirst(evaluator_Matches0, document0);
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("]eb}@.");
      Evaluator.Matches evaluator_Matches0 = new Evaluator.Matches(pattern0);
      Document document0 = Document.createShell("]eb}@.");
      document0.append("ZC3U)Fls@0WNe0!3");
      Collector.collect(evaluator_Matches0, document0);
  }
}