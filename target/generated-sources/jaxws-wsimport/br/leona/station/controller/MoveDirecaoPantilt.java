
package br.leona.station.controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MoveDirecaoPantilt complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MoveDirecaoPantilt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="graus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direcao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveDirecaoPantilt", propOrder = {
    "graus",
    "direcao"
})
public class MoveDirecaoPantilt {

    protected String graus;
    protected String direcao;

    /**
     * Obtém o valor da propriedade graus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraus() {
        return graus;
    }

    /**
     * Define o valor da propriedade graus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraus(String value) {
        this.graus = value;
    }

    /**
     * Obtém o valor da propriedade direcao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirecao() {
        return direcao;
    }

    /**
     * Define o valor da propriedade direcao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirecao(String value) {
        this.direcao = value;
    }

}
