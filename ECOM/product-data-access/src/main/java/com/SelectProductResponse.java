
package com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SelectProductReturn" type="{http://services.product.com}ArrayOf_xsd_anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "selectProductReturn"
})
@XmlRootElement(name = "SelectProductResponse")
public class SelectProductResponse {

    @XmlElement(name = "SelectProductReturn", required = true)
    protected ArrayOfXsdAnyType selectProductReturn;

    /**
     * Gets the value of the selectProductReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdAnyType }
     *     
     */
    public ArrayOfXsdAnyType getSelectProductReturn() {
        return selectProductReturn;
    }

    /**
     * Sets the value of the selectProductReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdAnyType }
     *     
     */
    public void setSelectProductReturn(ArrayOfXsdAnyType value) {
        this.selectProductReturn = value;
    }

}
