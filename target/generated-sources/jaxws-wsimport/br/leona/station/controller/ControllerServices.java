
package br.leona.station.controller;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ControllerServices", targetNamespace = "http://controller.station.leona.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ControllerServices {


    /**
     * 
     * @return
     *     returns java.util.List<br.leona.station.controller.Service>
     */
    @WebMethod(operationName = "PegaListaServicos")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "PegaListaServicos", targetNamespace = "http://controller.station.leona.br/", className = "br.leona.station.controller.PegaListaServicos")
    @ResponseWrapper(localName = "PegaListaServicosResponse", targetNamespace = "http://controller.station.leona.br/", className = "br.leona.station.controller.PegaListaServicosResponse")
    @Action(input = "http://controller.station.leona.br/ControllerServices/PegaListaServicosRequest", output = "http://controller.station.leona.br/ControllerServices/PegaListaServicosResponse")
    public List<Service> pegaListaServicos();

    /**
     * 
     */
    @WebMethod(operationName = "LimpaListaServicos")
    @RequestWrapper(localName = "LimpaListaServicos", targetNamespace = "http://controller.station.leona.br/", className = "br.leona.station.controller.LimpaListaServicos")
    @ResponseWrapper(localName = "LimpaListaServicosResponse", targetNamespace = "http://controller.station.leona.br/", className = "br.leona.station.controller.LimpaListaServicosResponse")
    @Action(input = "http://controller.station.leona.br/ControllerServices/LimpaListaServicosRequest", output = "http://controller.station.leona.br/ControllerServices/LimpaListaServicosResponse")
    public void limpaListaServicos();

    /**
     * 
     * @param listaServicos
     */
    @WebMethod(operationName = "AlteraListaServicos")
    @RequestWrapper(localName = "AlteraListaServicos", targetNamespace = "http://controller.station.leona.br/", className = "br.leona.station.controller.AlteraListaServicos")
    @ResponseWrapper(localName = "AlteraListaServicosResponse", targetNamespace = "http://controller.station.leona.br/", className = "br.leona.station.controller.AlteraListaServicosResponse")
    @Action(input = "http://controller.station.leona.br/ControllerServices/AlteraListaServicosRequest", output = "http://controller.station.leona.br/ControllerServices/AlteraListaServicosResponse")
    public void alteraListaServicos(
        @WebParam(name = "listaServicos", targetNamespace = "")
        List<Service> listaServicos);

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod(operationName = "DesligaPantilit")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DesligaPantilit", targetNamespace = "http://controller.station.leona.br/", className = "br.leona.station.controller.DesligaPantilit")
    @ResponseWrapper(localName = "DesligaPantilitResponse", targetNamespace = "http://controller.station.leona.br/", className = "br.leona.station.controller.DesligaPantilitResponse")
    @Action(input = "http://controller.station.leona.br/ControllerServices/DesligaPantilitRequest", output = "http://controller.station.leona.br/ControllerServices/DesligaPantilitResponse")
    public int desligaPantilit();

    /**
     * 
     * @return
     *     returns int
     * @throws IOException_Exception
     */
    @WebMethod(operationName = "VerificaPantiltLigado")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "VerificaPantiltLigado", targetNamespace = "http://controller.station.leona.br/", className = "br.leona.station.controller.VerificaPantiltLigado")
    @ResponseWrapper(localName = "VerificaPantiltLigadoResponse", targetNamespace = "http://controller.station.leona.br/", className = "br.leona.station.controller.VerificaPantiltLigadoResponse")
    @Action(input = "http://controller.station.leona.br/ControllerServices/VerificaPantiltLigadoRequest", output = "http://controller.station.leona.br/ControllerServices/VerificaPantiltLigadoResponse", fault = {
        @FaultAction(className = IOException_Exception.class, value = "http://controller.station.leona.br/ControllerServices/VerificaPantiltLigado/Fault/IOException")
    })
    public int verificaPantiltLigado()
        throws IOException_Exception
    ;

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod(operationName = "LigaPantilit")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "LigaPantilit", targetNamespace = "http://controller.station.leona.br/", className = "br.leona.station.controller.LigaPantilit")
    @ResponseWrapper(localName = "LigaPantilitResponse", targetNamespace = "http://controller.station.leona.br/", className = "br.leona.station.controller.LigaPantilitResponse")
    @Action(input = "http://controller.station.leona.br/ControllerServices/LigaPantilitRequest", output = "http://controller.station.leona.br/ControllerServices/LigaPantilitResponse")
    public int ligaPantilit();

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod(operationName = "ReiniciaPantilt")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ReiniciaPantilt", targetNamespace = "http://controller.station.leona.br/", className = "br.leona.station.controller.ReiniciaPantilt")
    @ResponseWrapper(localName = "ReiniciaPantiltResponse", targetNamespace = "http://controller.station.leona.br/", className = "br.leona.station.controller.ReiniciaPantiltResponse")
    @Action(input = "http://controller.station.leona.br/ControllerServices/ReiniciaPantiltRequest", output = "http://controller.station.leona.br/ControllerServices/ReiniciaPantiltResponse")
    public int reiniciaPantilt();

    /**
     * 
     * @param graus
     * @param direcao
     * @return
     *     returns int
     */
    @WebMethod(operationName = "MoveDirecaoPantilt")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "MoveDirecaoPantilt", targetNamespace = "http://controller.station.leona.br/", className = "br.leona.station.controller.MoveDirecaoPantilt")
    @ResponseWrapper(localName = "MoveDirecaoPantiltResponse", targetNamespace = "http://controller.station.leona.br/", className = "br.leona.station.controller.MoveDirecaoPantiltResponse")
    @Action(input = "http://controller.station.leona.br/ControllerServices/MoveDirecaoPantiltRequest", output = "http://controller.station.leona.br/ControllerServices/MoveDirecaoPantiltResponse")
    public int moveDirecaoPantilt(
        @WebParam(name = "graus", targetNamespace = "")
        String graus,
        @WebParam(name = "direcao", targetNamespace = "")
        String direcao);

}