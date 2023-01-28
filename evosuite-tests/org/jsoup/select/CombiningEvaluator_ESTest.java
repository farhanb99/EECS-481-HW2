/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 19:25:24 GMT 2023
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.select.CombiningEvaluator;
import org.jsoup.select.Evaluator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CombiningEvaluator_ESTest extends CombiningEvaluator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Evaluator> linkedList0 = new LinkedList<Evaluator>();
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(linkedList0);
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or();
      Document document0 = new Document("cLQdLc/lRrv");
      combiningEvaluator_Or0.add(combiningEvaluator_And0);
      boolean boolean0 = combiningEvaluator_Or0.matches(document0, document0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Evaluator[] evaluatorArray0 = new Evaluator[2];
      Evaluator.Tag evaluator_Tag0 = new Evaluator.Tag("");
      evaluatorArray0[0] = (Evaluator) evaluator_Tag0;
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(evaluatorArray0);
      Document document0 = Document.createShell(", ");
      // Undeclared exception!
      try { 
        combiningEvaluator_Or0.matches(document0, document0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.select.CombiningEvaluator$Or", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<Evaluator> arrayList0 = new ArrayList<Evaluator>();
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(arrayList0);
      Document document0 = new Document("26HIx$h;1<Yvj~%1(W+");
      boolean boolean0 = combiningEvaluator_Or0.matches(document0, document0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Evaluator[] evaluatorArray0 = new Evaluator[5];
      Evaluator.AttributeWithValueNot evaluator_AttributeWithValueNot0 = new Evaluator.AttributeWithValueNot("R/cLOGv%I.o`pDv-]#-", "R/cLOGv%I.o`pDv-]#-");
      evaluatorArray0[0] = (Evaluator) evaluator_AttributeWithValueNot0;
      Evaluator.ContainsText evaluator_ContainsText0 = new Evaluator.ContainsText("R/cLOGv%I.o`pDv-]#-");
      evaluatorArray0[1] = (Evaluator) evaluator_ContainsText0;
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(evaluatorArray0);
      Document document0 = new Document("org.jsoup.select.Evaluator$AttributeWithValueNot@0000000001, :contains(r/clogv%i.o`pdv-]#-), *, :contains(r/clogv%i.o`pdv-]#-), null");
      boolean boolean0 = combiningEvaluator_And0.matches(document0, document0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayList<Evaluator> arrayList0 = new ArrayList<Evaluator>();
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(arrayList0);
      Evaluator evaluator0 = combiningEvaluator_And0.rightMostEvaluator();
      assertNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Evaluator[] evaluatorArray0 = new Evaluator[5];
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(evaluatorArray0);
      Evaluator evaluator0 = combiningEvaluator_Or0.rightMostEvaluator();
      assertNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or();
      String string0 = combiningEvaluator_Or0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LinkedList<Evaluator> linkedList0 = new LinkedList<Evaluator>();
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(linkedList0);
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or();
      // Undeclared exception!
      try { 
        combiningEvaluator_Or0.replaceRightMostEvaluator(combiningEvaluator_And0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ArrayList<Evaluator> arrayList0 = new ArrayList<Evaluator>();
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(arrayList0);
      String string0 = combiningEvaluator_And0.toString();
      assertEquals("", string0);
  }
}
