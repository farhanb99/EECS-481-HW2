/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 19:09:36 GMT 2023
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayWriter;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Attributes_ESTest extends Attributes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = Attribute.createFromEncoded("org.jsoup.parser.Parser", "org.jsoup.parser.Parser");
      Attributes attributes1 = attributes0.put(attribute0);
      Attributes attributes2 = attributes1.clone();
      boolean boolean0 = attributes2.equals(attributes1);
      assertEquals(1, attributes0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      boolean boolean0 = attributes0.equals("SW");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      boolean boolean0 = attributes0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      boolean boolean0 = attributes0.equals(attributes0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("t>", "t>", attributes0);
      Attributes attributes1 = attributes0.put(attribute0);
      Attributes attributes2 = new Attributes();
      boolean boolean0 = attributes1.equals(attributes2);
      assertEquals(1, attributes0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.put("%T8>jdM", true);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.syntax(document_OutputSettings_Syntax0);
      attributes0.html((Appendable) charArrayWriter0, document_OutputSettings1);
      assertEquals(11, charArrayWriter0.size());
      assertEquals(" %T8>jdM=\"\"", charArrayWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = Attribute.createFromEncoded("%T8>jdM", "%T8>jdM");
      attributes0.put(attribute0);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      attributes0.html((Appendable) charArrayWriter0, document_OutputSettings0);
      assertEquals(1, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.put("%T8>jdM", true);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      attributes0.html((Appendable) charArrayWriter0, document_OutputSettings0);
      assertEquals(1, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.put("org.jsoup.nodes.Attributes$Dataset$DatasetIterator", true);
      attributes0.asList();
      assertEquals(1, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("", "");
      Attributes attributes1 = attributes0.put(attribute0);
      boolean boolean0 = attributes1.hasKeyIgnoreCase("");
      assertEquals(1, attributes0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      boolean boolean0 = attributes0.hasKeyIgnoreCase("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("", "");
      attributes0.put(attribute0);
      boolean boolean0 = attributes0.hasKey("");
      assertEquals(1, attributes0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      boolean boolean0 = attributes0.hasKey("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.removeIgnoreCase("SW");
      assertEquals(0, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = Attribute.createFromEncoded("1v!gC@p}~E", "?h/E");
      Attributes attributes1 = attributes0.put(attribute0);
      Attributes attributes2 = attributes1.put("?h/E", "");
      attributes2.removeIgnoreCase("1v!gC@p}~E");
      assertEquals(1, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.putIgnoreCase("%T8>jdM=\"%T8>jdM\"", "%T8>jdM=\"%T8>jdM\"");
      assertEquals(1, attributes0.size());
      
      attributes0.remove("%T8>jdM=\"%T8>jdM\"");
      assertEquals(0, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("", false);
      assertEquals(0, attributes1.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = Attribute.createFromEncoded("r+BcFO>L_", "r+BcFO>L_");
      Attributes attributes1 = attributes0.put(attribute0);
      attributes0.normalize();
      attributes1.put("r+BcFO>L_", true);
      assertEquals(1, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = Attribute.createFromEncoded("r+BcFO>L_", "r+BcFO>L_");
      Attributes attributes1 = attributes0.put(attribute0);
      attributes1.put("r+BcFO>L_", true);
      assertEquals(1, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      String string0 = attributes0.getIgnoreCase("head");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      String string0 = attributes0.get("default");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("Q*t3G", true);
      String string0 = attributes1.get("Q*t3G");
      assertEquals(1, attributes0.size());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Attribute attribute0 = new Attribute("=_PnVX6e@4xcb", "phD6,");
      String string0 = attribute0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("org.jsoup.nodes.Attributes$Dataset$DatasetIterator", true);
      String string0 = attributes1.getIgnoreCase("org.jsoup.nodes.Attributes$Dataset$DatasetIterator");
      assertEquals(1, attributes0.size());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("[E'K", true);
      Attributes attributes2 = attributes1.put("", true);
      Attributes attributes3 = attributes2.put("}'gX~a)/EVE+kedO", "[E'K");
      attributes3.clone();
      // Undeclared exception!
      try { 
        attributes3.addAll(attributes1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("Q*t3G", true);
      Attribute attribute0 = new Attribute("org.jsoup.nodes.Attributes", "Q*t3G", attributes1);
      attributes1.put(attribute0);
      Attributes attributes2 = attributes0.put("FQ!3+_Q~Wc;,*", "body");
      attributes2.addAll(attributes1);
      assertEquals(3, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.clone();
      boolean boolean0 = attributes1.equals(attributes0);
      assertTrue(boolean0);
      assertNotSame(attributes1, attributes0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.hashCode();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.addAll(attributes0);
      assertEquals(0, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("=_PnVX6e@4xcb", "phD6,");
      attributes0.put(attribute0);
      attributes0.asList();
      assertEquals(1, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Map<String, String> map0 = attributes0.dataset();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      String string0 = attributes0.toString();
      assertEquals("", string0);
  }
}
