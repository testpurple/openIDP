//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.10 at 06:13:21 PM IST 
//


package com.infosys.utilities.tosca;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.infosys.utilities.tosca package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TestsuitesTestsuiteTestcaseFailure_QNAME = new QName("", "failure");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.infosys.utilities.tosca
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Testsuites }
     * 
     */
    public Testsuites createTestsuites() {
        return new Testsuites();
    }

    /**
     * Create an instance of {@link Testsuites.Testsuite }
     * 
     */
    public Testsuites.Testsuite createTestsuitesTestsuite() {
        return new Testsuites.Testsuite();
    }

    /**
     * Create an instance of {@link Testsuites.Testsuite.Testcase }
     * 
     */
    public Testsuites.Testsuite.Testcase createTestsuitesTestsuiteTestcase() {
        return new Testsuites.Testsuite.Testcase();
    }

    /**
     * Create an instance of {@link Testsuites.Testsuite.Testcase.Failure }
     * 
     */
    public Testsuites.Testsuite.Testcase.Failure createTestsuitesTestsuiteTestcaseFailure() {
        return new Testsuites.Testsuite.Testcase.Failure();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Testsuites.Testsuite.Testcase.Failure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "failure", scope = Testsuites.Testsuite.Testcase.class)
    public JAXBElement<Testsuites.Testsuite.Testcase.Failure> createTestsuitesTestsuiteTestcaseFailure(Testsuites.Testsuite.Testcase.Failure value) {
        return new JAXBElement<Testsuites.Testsuite.Testcase.Failure>(_TestsuitesTestsuiteTestcaseFailure_QNAME, Testsuites.Testsuite.Testcase.Failure.class, Testsuites.Testsuite.Testcase.class, value);
    }

}
