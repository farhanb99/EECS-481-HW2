/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 19:18:01 GMT 2023
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Selector;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Selector_ESTest extends Selector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Tag tag0 = Tag.valueOf("'k@J=N]7#");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "'k@J=N]7#", attributes0);
      Elements elements0 = formElement0.getElementsByTag("'k@J=N]7#");
      Elements elements1 = formElement0.getElementsContainingText(":last-child");
      Elements elements2 = Selector.filterOut(elements0, elements1);
      assertEquals(1, elements2.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Document document0 = Document.createShell("");
      Pattern pattern0 = Pattern.compile("");
      Elements elements0 = document0.getElementsMatchingText(pattern0);
      Elements elements1 = Selector.filterOut(elements0, elements0);
      assertTrue(elements1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Document document0 = Document.createShell("6/F2#vpRr|1\"l4iO");
      // Undeclared exception!
      try { 
        Selector.selectFirst("ON/Q'", document0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse query 'ON/Q'': unexpected token at '/Q''
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Document document0 = new Document("");
      Pattern pattern0 = Pattern.compile("");
      Elements elements0 = document0.getElementsMatchingText(pattern0);
      Elements elements1 = Selector.select(",0", (Iterable<Element>) elements0);
      assertFalse(elements1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Document document0 = Document.createShell("WY>_@_7'EB<CQ_ ");
      // Undeclared exception!
      try { 
        Selector.select("", (Element) document0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }
}