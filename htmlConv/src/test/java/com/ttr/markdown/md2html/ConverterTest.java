package com.ttr.markdown.md2html;

import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple Converter.
 */
public class ConverterTest extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ConverterTest(final String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(ConverterTest.class);
    }

    /**
     * Test html conversion
     */
    public void testConversion() {

        final Parser parser = Parser.builder().build();
        final Node document = parser.parse("This is *Sparta*");
        final HtmlRenderer renderer = HtmlRenderer.builder().build();

        assertEquals("<p>This is <em>Sparta</em></p>\n", renderer.render(document));
    }

}
