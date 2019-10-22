/*
 * SysML v2 API and Services
 * REST/HTTP binding (PSM) for the SysML v2 standard API.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.omg.sysml.api;

import org.omg.sysml.ApiException;
import org.omg.sysml.model.Error;
import org.omg.sysml.model.Relationship;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RelationshipApi
 */
@Ignore
public class RelationshipApiTest {

    private final RelationshipApi api = new RelationshipApi();

    
    /**
     * Add a new relationship
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRelationshipTest() throws ApiException {
        Relationship body = null;
        Relationship response = api.createRelationship(body);

        // TODO: test validations
    }
    
    /**
     * Get relationship by its ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRelationshipTest() throws ApiException {
        String identifier = null;
        Relationship response = api.getRelationship(identifier);

        // TODO: test validations
    }
    
    /**
     * Get all relationships
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRelationshipsTest() throws ApiException {
        List<Relationship> response = api.getRelationships();

        // TODO: test validations
    }
    
    /**
     * Get all relationships in the project
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRelationshipsByProjectTest() throws ApiException {
        String projectIdentifier = null;
        List<Relationship> response = api.getRelationshipsByProject(projectIdentifier);

        // TODO: test validations
    }
    
}
