/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author wendy
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.mycompany.entities.service.AccountFacadeREST.class);
        resources.add(com.mycompany.entities.service.AdresFacadeREST.class);
        resources.add(com.mycompany.entities.service.ArtikelFacadeREST.class);
        resources.add(com.mycompany.entities.service.BestellingFacadeREST.class);
        resources.add(com.mycompany.entities.service.BestellingartikelFacadeREST.class);
        resources.add(com.mycompany.entities.service.BetalingFacadeREST.class);
        resources.add(com.mycompany.entities.service.FactuurFacadeREST.class);
        resources.add(com.mycompany.entities.service.KlantFacadeREST.class);
        resources.add(com.mycompany.entities.service.KlantadresFacadeREST.class);
        resources.add(com.mycompany.entities.service.MedewerkerFacadeREST.class);
        resources.add(com.mycompany.rest.ArtikelBeheer.class);
        resources.add(com.mycompany.rest.GebruikerBeheer.class);
        resources.add(com.mycompany.rest.RegistratieService.class);
    }
    
}
