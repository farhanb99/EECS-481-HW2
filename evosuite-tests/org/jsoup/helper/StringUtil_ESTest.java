/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 18:34:39 GMT 2023
 */

package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLStreamHandler;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.jsoup.helper.StringUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringUtil_ESTest extends StringUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL(".*gFG#+", "?.*gFG#", 1592, ".*gFG#+", uRLStreamHandler0);
      try { 
        StringUtil.resolve(uRL0, ".*gFG#+");
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // unknown protocol: .*gfg#+
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      URL uRL1 = StringUtil.resolve(uRL0, ".*gFG#+");
      assertEquals("ftp://ftp.someFakeButWellFormedURL.org/.*gFG#+", uRL1.toExternalForm());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      URL uRL1 = StringUtil.resolve(uRL0, "?l2v@r@<%#K5bHw");
      assertEquals("http://www.someFakeButWellFormedURL.org/fooExample?l2v@r@<%#K5bHw", uRL1.toExternalForm());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = StringUtil.padding(1761);
      URL uRL0 = MockURL.getFtpExample();
      URL uRL1 = StringUtil.resolve(uRL0, string0);
      assertTrue(uRL1.equals((Object)uRL0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[1] = "";
      stringArray0[3] = "~;A<k_i10";
      boolean boolean0 = StringUtil.inSorted("", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[0];
      boolean boolean0 = StringUtil.inSorted("?ys2X&ro", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "6#Dnpf3k#:VF]UxsU";
      boolean boolean0 = StringUtil.in("6#Dnpf3k#:VF]UxsU", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "(ST";
      boolean boolean0 = StringUtil.in("Y8HUBtw9=YMM,{9", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringBuilder stringBuilder0 = StringUtil.stringBuilder();
      StringUtil.appendNormalisedWhitespace(stringBuilder0, "d[>6%R):_/@ }JA_p", true);
      assertEquals("d[>6%R):_/@ }JA_p", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(0);
      StringUtil.appendNormalisedWhitespace(stringBuilder0, "                    ", true);
      assertEquals("", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = StringUtil.isInvisibleChar(1807);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = StringUtil.isInvisibleChar(8205);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = StringUtil.isInvisibleChar(8204);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = StringUtil.isInvisibleChar(8203);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = StringUtil.isInvisibleChar(173);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = StringUtil.isActuallyWhitespace(160);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = StringUtil.isActuallyWhitespace(13);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = StringUtil.isActuallyWhitespace(12);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = StringUtil.isActuallyWhitespace(10);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = StringUtil.isActuallyWhitespace(9);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = StringUtil.isWhitespace(13);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = StringUtil.isWhitespace(12);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = StringUtil.isWhitespace(10);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      boolean boolean0 = StringUtil.isWhitespace(9);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      boolean boolean0 = StringUtil.isNumeric("1");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = StringUtil.isNumeric("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = StringUtil.isNumeric("Fs/B^qIBA'u#");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean boolean0 = StringUtil.isNumeric((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = StringUtil.isBlank("p#8mojx_|s|k?HF ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = StringUtil.padding(1761);
      boolean boolean0 = StringUtil.isBlank(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = StringUtil.isBlank("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = StringUtil.isBlank((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = StringUtil.padding(0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringUtil.padding((-2584));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // width must be > 0
         //
         verifyException("org.jsoup.helper.StringUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("");
      Iterator<String> iterator0 = linkedList0.descendingIterator();
      String string0 = StringUtil.join(iterator0, "Ae}DgS` 9tW\")>r!");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      String string0 = StringUtil.join(stringArray0, "Q0K^AWv|Z+Od)HPTg");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      String string0 = StringUtil.join((Collection) linkedList0, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = StringUtil.resolve(".o", "#");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringUtil stringUtil0 = new StringUtil();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = StringUtil.normaliseWhitespace("                 ");
      assertEquals(" ", string0);
  }
}
