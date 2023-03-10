/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 19:11:54 GMT 2023
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TextNode_ESTest extends TextNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      StringBuilder stringBuilder1 = stringBuilder0.append(' ');
      boolean boolean0 = TextNode.lastCharIsWhitespace(stringBuilder1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("o{l(A*9/_)}!b.'^M");
      boolean boolean0 = TextNode.lastCharIsWhitespace(stringBuilder0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      boolean boolean0 = TextNode.lastCharIsWhitespace(stringBuilder0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TextNode textNode0 = new TextNode("");
      Document document0 = new Document("org.jsoup.nodes.TextNode");
      Document document1 = document0.normalise();
      textNode0.setParentNode(document1);
      Document.OutputSettings document_OutputSettings0 = textNode0.getOutputSettings();
      document_OutputSettings0.outline(true);
      textNode0.outerHtmlHead((Appendable) null, (-195), document_OutputSettings0);
      assertEquals("#text", textNode0.nodeName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TextNode textNode0 = new TextNode("");
      Document.OutputSettings document_OutputSettings0 = textNode0.getOutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.outline(true);
      textNode0.outerHtmlHead((Appendable) null, (-195), document_OutputSettings1);
      assertEquals("#text", textNode0.nodeName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded(";jCuPGk(3b%X{[", ";jCuPGk(3b%X{[");
      Document document0 = new Document("4,Z:*Vz}_6w");
      textNode0.setParentNode(document0);
      String string0 = textNode0.toString();
      assertEquals("#text", textNode0.nodeName());
      assertEquals("\n;jCuPGk(3b%X{[", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("");
      TextNode textNode1 = textNode0.text("org.jsoup.select.StructuralEvaluator$Parent");
      textNode1.siblingIndex = 65;
      String string0 = textNode1.toString();
      assertEquals("#text", textNode1.nodeName());
      assertEquals("org.jsoup.select.StructuralEvaluator$Parent", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("");
      StringBuilder stringBuilder0 = new StringBuilder();
      Document.OutputSettings document_OutputSettings0 = textNode0.getOutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.prettyPrint(false);
      textNode0.outerHtmlHead(stringBuilder0, 2122, document_OutputSettings1);
      assertEquals("#text", textNode0.nodeName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded(";jCuPGk(3b%X{[", ";jCuPGk(3b%X{[");
      Document document0 = new Document("4,Z:*Vz}_6w");
      textNode0.setParentNode(document0);
      // Undeclared exception!
      try { 
        textNode0.splitText(3);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("");
      // Undeclared exception!
      try { 
        textNode0.splitText((-195));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Split offset must be not be negative
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("WUsn0K'4<=");
      TextNode textNode1 = textNode0.splitText(0);
      assertNotSame(textNode1, textNode0);
      assertEquals("#text", textNode1.nodeName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TextNode textNode0 = new TextNode("Split offset must be not be negative", "-(Nd6S");
      assertFalse(textNode0.hasParent());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("", "");
      // Undeclared exception!
      try { 
        textNode0.splitText(3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Split offset must not be greater than current text length
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("WUsn0K'4<=");
      MockFileWriter mockFileWriter0 = new MockFileWriter("WUsn0K'4<=", true);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      textNode0.outerHtmlTail(mockFileWriter0, 0, document_OutputSettings0);
      assertEquals("#text", textNode0.nodeName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = TextNode.stripLeadingWhitespace("9&UV6C5?r#8x=[k~=");
      assertEquals("9&UV6C5?r#8x=[k~=", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = TextNode.normaliseWhitespace("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("WUsn0K'4<=");
      textNode0.text();
  }
}
