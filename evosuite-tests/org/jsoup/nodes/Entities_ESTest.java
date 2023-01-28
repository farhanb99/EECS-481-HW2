/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 19:02:44 GMT 2023
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Entities_ESTest extends Entities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Entities.CoreCharset.byName("{41cfElu=BXglaG':");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, true);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.syntax(document_OutputSettings_Syntax0);
      Entities.escape((Appendable) mockPrintWriter0, "7DO*4H$EsC:9HS=aJk", document_OutputSettings0, true, true, true);
      Entities.CoreCharset entities_CoreCharset0 = Entities.CoreCharset.fallback;
      document_OutputSettings1.coreCharset = entities_CoreCharset0;
      Entities.escape((Appendable) mockPrintWriter0, "UTF-{41cfElu=BXglaG':", document_OutputSettings1, true, false, true);
      assertEquals(Entities.EscapeMode.base, document_OutputSettings1.escapeMode());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(160);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.charset("US-ASCII");
      Entities.escape((Appendable) charArrayWriter0, "US-ASCII", document_OutputSettings1, false, false, true);
      assertEquals(8, charArrayWriter0.size());
      assertEquals("US-ASCII", charArrayWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.escape((Appendable) charArrayWriter0, "'3mC.4\"9G>%9*^e", document_OutputSettings0, true, true, false);
      assertEquals("'3mC.4&quot;9G>%9*^e", charArrayWriter0.toString());
      assertEquals(20, charArrayWriter0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
      document_OutputSettings0.escapeMode(entities_EscapeMode0);
      Entities.escape((Appendable) charArrayWriter0, "f{O.ifv<:w#Oo", document_OutputSettings0, true, true, false);
      assertEquals(16, charArrayWriter0.size());
      assertEquals("f{O.ifv&lt;:w#Oo", charArrayWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(149);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.escapeMode(entities_EscapeMode0);
      Entities.escape((Appendable) charArrayWriter0, "\u00A0", document_OutputSettings1, false, false, true);
      assertEquals("&#xa0;", charArrayWriter0.toString());
      assertEquals(6, charArrayWriter0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = Entities.escape("\u00A0");
      assertEquals("&nbsp;", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = Entities.escape("\"WJ?Iv/k}dcy_@&F0Yz");
      assertEquals("\"WJ?Iv/k}dcy_@&amp;F0Yz", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) " 6^aO", 4, 4);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      // Undeclared exception!
      try { 
        Entities.escape((Appendable) charBuffer0, " 6^aO", document_OutputSettings0, false, true, true);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.StringCharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, true);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.escape((Appendable) mockPrintWriter0, "'dR2 >Z{)gY#D", document_OutputSettings0, true, true, true);
      assertEquals(Document.OutputSettings.Syntax.html, document_OutputSettings0.syntax());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, true);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.escape((Appendable) mockPrintWriter0, "'dR2 >Z{)gY#D", document_OutputSettings0, true, true, false);
      assertFalse(document_OutputSettings0.outline());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.escape((Appendable) charArrayWriter0, "f{O.ifv<:w#Oo", document_OutputSettings0, true, true, false);
      assertEquals("f{O.ifv<:w#Oo", charArrayWriter0.toString());
      assertEquals(13, charArrayWriter0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      String string0 = Entities.escape((String) null, document_OutputSettings0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[5];
      int int0 = Entities.codepointsForName("f{O.ifv<:w#Oo", intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = Entities.getByName("");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = Entities.getByName("quot");
      assertEquals("\"", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = Entities.isBaseNamedEntity("&C3Cf::X}#HI");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = Entities.isNamedEntity("quot");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = Entities.isNamedEntity("b=1Lr?}a13aIgdBJW");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.extended;
      String string0 = entities_EscapeMode0.nameForCodepoint(34);
      assertEquals("quot", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
      String string0 = entities_EscapeMode0.nameForCodepoint(62);
      assertEquals("gt", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
      String string0 = entities_EscapeMode0.nameForCodepoint(34);
      assertEquals("quot", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
      String string0 = entities_EscapeMode0.nameForCodepoint((-1));
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = Entities.unescape("&nbsp;", false);
      assertEquals("\u00A0", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = Entities.escape("j$>k@R\"7$.Xx\"eu<q");
      assertEquals("j$&gt;k@R\"7$.Xx\"eu&lt;q", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = Entities.unescape("Yi.#yu");
      assertEquals("Yi.#yu", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Character character0 = Entities.getCharacterByName("1$$Z");
      assertEquals('\uFFFF', (char)character0);
  }
}