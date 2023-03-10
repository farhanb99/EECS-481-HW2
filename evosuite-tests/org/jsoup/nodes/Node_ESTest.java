/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 19:01:13 GMT 2023
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.PseudoTextElement;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeFilter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Node_ESTest extends Node_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Document document0 = Document.createShell("?k]3[#");
      boolean boolean0 = document0.hasSameValue("?k]3[#");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Document document0 = Document.createShell("?k]3[#");
      boolean boolean0 = document0.hasSameValue((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Document document0 = Document.createShell("s42q");
      boolean boolean0 = document0.hasSameValue(document0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Document document0 = new Document("+ rUI_ (pSwYy");
      Document document1 = document0.normalise();
      assertEquals(1, document1.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Document document0 = Document.createShell("McGMixUR00K<mG90");
      boolean boolean0 = document0.equals("McGMixUR00K<mG90");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Document document0 = Document.createShell("[%s!=%s]");
      Element element0 = document0.appendElement("[%s!=%s]");
      Element element1 = (Element)element0.previousSibling();
      assertTrue(element1.isBlock());
      assertNotNull(element1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Document document0 = Document.createShell("[%s!=%s]");
      Node node0 = document0.previousSibling();
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XmlDeclaration xmlDeclaration0 = new XmlDeclaration("xmlns:", "xmlns:", false);
      DataNode dataNode0 = DataNode.createFromEncoded("xmlns:", "dfn");
      dataNode0.reparentChild(xmlDeclaration0);
      Node node0 = xmlDeclaration0.previousSibling();
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Document document0 = Document.createShell("a\"2,$.LhxT2xj");
      List<Node> list0 = document0.siblingNodes();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Document document0 = Document.createShell("[%s!=%s]");
      Element element0 = document0.appendElement("[%s!=%s]");
      List<Node> list0 = element0.siblingNodes();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Document document0 = new Document("");
      // Undeclared exception!
      try { 
        document0.removeChild(document0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Document document0 = new Document("7Ah)&5Y7Tg");
      document0.appendText("");
      Evaluator.MatchText evaluator_MatchText0 = new Evaluator.MatchText();
      evaluator_MatchText0.matches(document0, document0);
      assertEquals(1, document0.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XmlDeclaration xmlDeclaration0 = new XmlDeclaration("xmlns:", "xmlns:", false);
      DataNode dataNode0 = DataNode.createFromEncoded("xmlns:", "dfn");
      dataNode0.reparentChild(xmlDeclaration0);
      // Undeclared exception!
      try { 
        xmlDeclaration0.wrap("bFZ;N$wA");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Leaf Nodes do not have child nodes.
         //
         verifyException("org.jsoup.nodes.LeafNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Document document0 = Document.createShell("     ");
      // Undeclared exception!
      try { 
        document0.replaceChild(document0, document0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Document document0 = Document.createShell("[%s!=%s]");
      Element element0 = document0.appendElement("[%s!=%s]");
      element0.append("zEpQFj9RaP}<`D1");
      element0.unwrap();
      assertEquals(2, document0.childNodeSize());
      assertEquals(0, element0.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Document document0 = Document.createShell("[%s!=%s]");
      Element element0 = document0.appendElement("[%s!=%s]");
      Node node0 = element0.wrap("ol");
      assertNull(node0);
      assertEquals(1, element0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Document document0 = Document.createShell("[%s!=%s]");
      Element element0 = document0.appendElement("[%s!=%s]");
      element0.before("[%s!=%s]");
      assertEquals(3, document0.childNodeSize());
      assertEquals(2, element0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Document document0 = Document.createShell("a\"2,$.LhxT2xj");
      List<Node> list0 = document0.childNodesCopy();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Document document0 = new Document("US-ASCII");
      String string0 = document0.absUrl("[%s^=%s]");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XmlDeclaration xmlDeclaration0 = new XmlDeclaration("xmlns:", "xmlns:", true);
      Node node0 = xmlDeclaration0.clearAttributes();
      assertEquals(0, node0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DataNode dataNode0 = new DataNode("abs:h,Jv|H[G", "abs:h,Jv|H[G");
      boolean boolean0 = dataNode0.hasAttr("abs:h,Jv|H[G");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Document document0 = new Document("US-ASCII");
      document0.getElementsByAttributeStarting("US-ASCII");
      // Undeclared exception!
      try { 
        document0.attr("abs:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Element element0 = new Element("abs:");
      String string0 = element0.cssSelector();
      assertEquals("abs|", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Document document0 = Document.createShell("[%s!=%s]");
      String string0 = document0.val();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XmlDeclaration xmlDeclaration0 = new XmlDeclaration("xmlns:", "xmlns:", true);
      DataNode dataNode0 = DataNode.createFromEncoded("xmlns:", "dfn");
      dataNode0.reparentChild(xmlDeclaration0);
      // Undeclared exception!
      try { 
        xmlDeclaration0.before("org.jsoup.nodes.Node$1");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Leaf Nodes do not have child nodes.
         //
         verifyException("org.jsoup.nodes.LeafNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Document document0 = Document.createShell("[%s!=%s]");
      Document document1 = document0.clone();
      document1.prepend("[%s!=%s]");
      boolean boolean0 = document1.hasSameValue(document0);
      assertEquals(2, document1.childNodeSize());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Document document0 = Document.createShell("H!P?]pgO^|]-4KD");
      Tag tag0 = document0.tag();
      CDataNode cDataNode0 = new CDataNode("{e[GT");
      Attributes attributes0 = cDataNode0.attributes();
      PseudoTextElement pseudoTextElement0 = new PseudoTextElement(tag0, "H!P?]pgO^|]-4KD", attributes0);
      PseudoTextElement pseudoTextElement1 = (PseudoTextElement)pseudoTextElement0.removeAttr("{e[GT");
      assertFalse(pseudoTextElement1.isBlock());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("PUBLIC", "org.jsoup.helper.W3CDom", "0-s+Xo:Jqq");
      String string0 = documentType0.toString();
      assertEquals("<!DOCTYPE PUBLIC PUBLIC \"org.jsoup.helper.W3CDom\" \"0-s+Xo:Jqq\">", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DataNode dataNode0 = DataNode.createFromEncoded("K22*u!c@_XyY5WImN", "K22*u!c@_XyY5WImN");
      // Undeclared exception!
      try { 
        dataNode0.html((MockFileWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.DataNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      XmlDeclaration xmlDeclaration0 = new XmlDeclaration("xmlns:", "xmlns:", false);
      Node node0 = xmlDeclaration0.shallowClone();
      assertNotSame(node0, xmlDeclaration0);
      assertNotNull(node0);
      assertEquals(0, node0.siblingIndex());
      assertFalse(node0.hasParent());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Document document0 = Document.createShell("[%s!=%s]");
      Element element0 = document0.appendElement("[%s!=%s]");
      assertEquals(2, document0.childNodeSize());
      
      element0.unwrap();
      assertEquals(1, element0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Document document0 = Document.createShell("[%s!=%s]");
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.STOP;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      Node node0 = document0.filter(nodeFilter0);
      assertFalse(node0.hasParent());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Document document0 = new Document("F");
      // Undeclared exception!
      try { 
        document0.after("F");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      XmlDeclaration xmlDeclaration0 = new XmlDeclaration("", "", true);
      Document document0 = Document.createShell("tf[^C");
      // Undeclared exception!
      try { 
        document0.after((Node) xmlDeclaration0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Document document0 = new Document("%P'!gL)Y=");
      document0.setBaseUri("%P'!gL)Y=");
      assertEquals("%P'!gL)Y=", document0.baseUri());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Document document0 = new Document("!'CeI[i;Al.{3");
      // Undeclared exception!
      try { 
        document0.before((Node) document0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }
}
