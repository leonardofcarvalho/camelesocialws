
package br.gov.esocial.servicos.empregador.lote.eventos.envio.v1_1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
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
 *         &lt;element name="EnviarLoteEventosResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "enviarLoteEventosResult"
})
@XmlRootElement(name = "EnviarLoteEventosResponse")
public class EnviarLoteEventosResponse {

    @XmlElement(name = "EnviarLoteEventosResult")
    protected EnviarLoteEventosResponse.EnviarLoteEventosResult enviarLoteEventosResult;

    /**
     * Gets the value of the enviarLoteEventosResult property.
     * 
     * @return
     *     possible object is
     *     {@link EnviarLoteEventosResponse.EnviarLoteEventosResult }
     *     
     */
    public EnviarLoteEventosResponse.EnviarLoteEventosResult getEnviarLoteEventosResult() {
        return enviarLoteEventosResult;
    }

    /**
     * Sets the value of the enviarLoteEventosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnviarLoteEventosResponse.EnviarLoteEventosResult }
     *     
     */
    public void setEnviarLoteEventosResult(EnviarLoteEventosResponse.EnviarLoteEventosResult value) {
        this.enviarLoteEventosResult = value;
    }


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
     *         &lt;any/>
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
        "any"
    })
    public static class EnviarLoteEventosResult {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
