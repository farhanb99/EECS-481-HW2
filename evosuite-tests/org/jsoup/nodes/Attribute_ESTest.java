/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 19:04:13 GMT 2023
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Attribute_ESTest extends Attribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("org.jsoup.parser.Token$Character", (String) null, attributes0);
      attribute0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("checked", "checked", attributes0);
      attribute0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Attribute attribute0 = new Attribute("we5e1({`*Ov jm G", (String) null);
      Attribute attribute1 = new Attribute("we5e1({`*Ov jm G", "strong");
      boolean boolean0 = attribute0.equals(attribute1);
      //  // Unstable assertion: assertTrue(attribute1.equals((Object)attribute0));
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Attribute attribute0 = new Attribute("we5e1({`*Ov jm G", (String) null);
      Attribute attribute1 = attribute0.clone();
      boolean boolean0 = attribute0.equals(attribute1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Attribute attribute0 = new Attribute("yQgB}UAX^.M^pBss", "hO[5ZA$.hPyE*mtn&?l");
      Attribute attribute1 = Attribute.createFromEncoded("nowrap", "nowrap");
      boolean boolean0 = attribute0.equals(attribute1);
      assertEquals("hO[5ZA$.hPyE*mtn&?l", attribute0.getValue());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("checked", "checked", attributes0);
      Attribute attribute1 = attribute0.clone();
      boolean boolean0 = attribute1.equals(attribute0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("org.jsoup.parser.Token$Character", (String) null, attributes0);
      boolean boolean0 = attribute0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("declare", "multiple", attributes0);
      boolean boolean0 = attribute0.equals("");
      assertEquals("multiple", attribute0.getValue());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Attribute attribute0 = new Attribute(".,=)ql(>N.F", (String) null);
      boolean boolean0 = attribute0.isBooleanAttribute();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Attribute attribute0 = new Attribute("typemustmatch", "org.jsoup.SerializationException");
      boolean boolean0 = attribute0.isBooleanAttribute();
      assertTrue(boolean0);
      assertEquals("org.jsoup.SerializationException", attribute0.getValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("novalidate", "novalidate");
      attribute0.setKey("fL7loc_-&K");
      String string0 = attribute0.toString();
      assertEquals("fL7loc_-&K=\"novalidate\"", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      boolean boolean0 = Attribute.shouldCollapseAttribute("gK", (String) null, document_OutputSettings0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.syntax(document_OutputSettings_Syntax0);
      boolean boolean0 = Attribute.shouldCollapseAttribute("Pattern syntax error: ", "Pattern syntax error: ", document_OutputSettings1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = Attribute.isDataAttribute("data-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = Attribute.isDataAttribute("data-org.jsoup.nodes.Attribute");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("checked", "checked", attributes0);
      String string0 = attribute0.toString();
      assertEquals("checked", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("}3sXUUqo8[Xui;r", "}3sXUUqo8[Xui;r");
      Attribute attribute0 = new Attribute("}3sXUUqo8[Xui;r", "}3sXUUqo8[Xui;r", attributes1);
      String string0 = attribute0.setValue("}3sXUUqo8[Xui;r");
      assertEquals("}3sXUUqo8[Xui;r", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("declare", "multiple", attributes0);
      attribute0.setValue("{CK9<k]eu&");
      assertEquals("{CK9<k]eu&", attribute0.getValue());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("declare", "multiple", attributes0);
      assertEquals("declare", attribute0.getKey());
      
      attribute0.setKey("declare");
      assertEquals("multiple", attribute0.getValue());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Attribute attribute0 = new Attribute("id", "id");
      // Undeclared exception!
      try { 
        attribute0.shouldCollapseAttribute((Document.OutputSettings) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("gK", "");
      String string0 = attribute0.toString();
      assertEquals("gK=\"\"", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("novalidate", "novalidate");
      Attributes attributes0 = new Attributes();
      attributes0.put(attribute0);
      attribute0.setKey("fL7loc_-&K");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Attribute attribute0 = new Attribute("YDjMu[M!S@lbN", "YDjMu[M!S@lbN");
      boolean boolean0 = attribute0.isBooleanAttribute();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("checked", "checked", attributes0);
      boolean boolean0 = attribute0.isDataAttribute();
      assertFalse(boolean0);
  }
}