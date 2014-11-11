/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.leona.clientwebsservice;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin_2
 */
@Resource
public class IndexController {
    private final Result result;
        
    public IndexController(Result result){
        this.result = result; 
    }  
       
    @Path("/")
    @SuppressWarnings("empty-statement")
    public void index(){    
     
        String antesligar = "Desligado";
       
        if(VerificaPantiltLigado()==1) antesligar = "Ligado";   
        else antesligar = "Desligado";
       
        String ligar = "Nao Ligou";
        if(LigaPantilt()==1) ligar = "Ligou";
        else ligar = "Nao Ligou";        
        
        String depoisligar  = "Desligado";
        if(VerificaPantiltLigado()==1) depoisligar = "Ligado";   
        else depoisligar = "Desligado";
        
        String direcao = "IMOVEL";
        if(MoveDirecaoPantilt("10", "UP")==1) direcao = "10"+"UP";
        else direcao = "IMOVEL";
        
        String desligar = "Nao Desligou";
        if(DesligaPantilt()==1) desligar = "Desligou";
        else desligar = "Nao Desligou";    
       
        String depoisdesligar = "Ligado";
        if(VerificaPantiltLigado()==1) depoisdesligar = "Ligado";   
        else depoisdesligar = "Desligado";
        
        List<br.leona.station.controller.Service> listService = new ArrayList<br.leona.station.controller.Service>();        
        listService.addAll(PegaListaServicos());
        
       br.leona.station.controller.Service service;
        if(listService.isEmpty()){            
            service = new br.leona.station.controller.Service();                
            service.setName("Camera");
            service.setStatus("Desativado"); 
            listService.add(service);        
        }
                
        result  
                .include("antesligar", antesligar)
                .include("ligar", ligar)
                .include("direcao", direcao)
                .include("depoisligar", depoisligar)
                .include("desligar", desligar)
                .include("depoisdesligar", depoisdesligar)   
                .include("listService", listService)                   
                .forwardTo("index.jsp");             
    }    

    public java.util.List<br.leona.station.controller.Service> PegaListaServicos() {    
        try { // Call Web Service Operation
            br.leona.station.controller.ControllerServices_Service service = new br.leona.station.controller.ControllerServices_Service();
            br.leona.station.controller.ControllerServices port = service.getControllerServicesPort();
            // TODO process result here
            java.util.List<br.leona.station.controller.Service> result = port.pegaListaServicos();
            System.out.println("Result = "+result);
            return result;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
            return new ArrayList<br.leona.station.controller.Service>();
        }   
    }

    public int VerificaPantiltLigado() {    
        try { // Call Web Service Operation
            br.leona.station.controller.ControllerServices_Service service = new br.leona.station.controller.ControllerServices_Service();
            br.leona.station.controller.ControllerServices port = service.getControllerServicesPort();
            // TODO process result here
            int result = port.verificaPantiltLigado();
            System.out.println("Result = "+result);
            return result;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
            System.out.println(ex);
            return 0;
        }
    }

    public int LigaPantilt() {    
        try { // Call Web Service Operation
            br.leona.station.controller.ControllerServices_Service service = new br.leona.station.controller.ControllerServices_Service();
            br.leona.station.controller.ControllerServices port = service.getControllerServicesPort();
            // TODO process result here
            int result = port.ligaPantilit();
            System.out.println("Result = "+result);
            return result;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
            System.out.println(ex);
            return 0;
        }
    }
    
    public int DesligaPantilt() {  
        try { // Call Web Service Operation
            br.leona.station.controller.ControllerServices_Service service = new br.leona.station.controller.ControllerServices_Service();
            br.leona.station.controller.ControllerServices port = service.getControllerServicesPort();
            // TODO process result here
            int result = port.desligaPantilit();
            System.out.println("Result = "+result);
            return result;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
            System.out.println(ex);
            return 0;
        }
    }
    
    public int MoveDirecaoPantilt(String graus, String direcao) {  
        try { // Call Web Service Operation
            br.leona.station.controller.ControllerServices_Service service = new br.leona.station.controller.ControllerServices_Service();
            br.leona.station.controller.ControllerServices port = service.getControllerServicesPort();
            int result = port.moveDirecaoPantilt(graus, direcao);
            System.out.println("Result = "+result);       
            return result;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
            System.out.println(ex);
            return 0;
        }
    }
    
    public void AlteraListaServicos(java.util.List<br.leona.station.controller.Service> listaServicos) { 
        try { // Call Web Service Operation
            br.leona.station.controller.ControllerServices_Service service = new br.leona.station.controller.ControllerServices_Service();
            br.leona.station.controller.ControllerServices port = service.getControllerServicesPort();port.alteraListaServicos(listaServicos);
       } catch (Exception ex) {
            // TODO handle custom exceptions here
            System.out.println(ex);
       }
    }

}

