/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 18:55:30 GMT 2023
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Comment_ESTest extends Comment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Comment comment0 = new Comment("UJY,5y_CglBejXt");
      StringBuilder stringBuilder0 = new StringBuilder();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      document_OutputSettings0.prettyPrint(false);
      comment0.outerHtmlHead(stringBuilder0, (-1309), document_OutputSettings0);
      assertEquals("<!--UJY,5y_CglBejXt-->", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Comment comment0 = new Comment(":last-of-type", ":last-of-type");
      assertFalse(comment0.hasParent());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Comment comment0 = new Comment("&quot;");
      comment0.toString();
  }
}
