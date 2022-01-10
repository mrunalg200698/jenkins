package org_examples.Java_jenkins_in_docker;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestMain {
@Test
public void testInputIsEven(){
assertTrue(Main.checkIfInputIsAnEvenNumber(22)); //Assertion
}
}