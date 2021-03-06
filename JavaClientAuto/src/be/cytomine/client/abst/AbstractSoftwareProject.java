
package be.cytomine.client.abst;

import be.cytomine.client.*;
import java.util.*;
import org.json.simple.*;

import java.util.Date;
import be.cytomine.client.Server;
import be.cytomine.client.SoftwareProject;
import org.json.simple.JSONObject;


/**
 * A link between a ROI and a job template
 * 
 * @author ClientBuilder (Loïc Rollus)
 * @version 0.1
 * 
 * DO NOT EDIT THIS FILE. THIS IS CODE IS BUILD AUTOMATICALY. ALL CHANGE WILL BE LOST AFTER NEXT GENERATION.
 * 
 * IF YOU WANT TO EDIT A DOMAIN FILE (change method, add property,...), JUST EDIT THE CHILD FILE “YourDomain.java” instead of this file “AbstractYourDomain.java”. I WON'T BE CLEAR IF IT ALREADY EXIST.
 * 
 */
public abstract class AbstractSoftwareProject
    extends AbstractDomain
{

    /**
     * The full class name of the domain
     * 
     */
    protected String clazz;
    /**
     * The domain id
     * 
     */
    protected Long id;
    /**
     * The date of the domain creation
     * 
     */
    protected Date created;
    /**
     * The date of the domain modification
     * 
     */
    protected Date updated;
    /**
     * When domain was removed from Cytomine
     * 
     */
    protected Date deleted;
    /**
     * The annotation id
     * 
     */
    protected Long annotationIdent;
    /**
     * The annotation class type (roi,user,algo,...)
     * 
     */
    protected String annotationClassName;
    /**
     * The template
     * 
     */
    protected Long jobTemplate;

    /**
     * 
     * @return
     *     The full class name of the domain
     */
    public String getClazz()
        throws Exception
    {
        return clazz;
    }

    /**
     * 
     * @return
     *     The domain id
     */
    public Long getId()
        throws Exception
    {
        return id;
    }

    /**
     * 
     * @return
     *     The date of the domain creation
     */
    public Date getCreated()
        throws Exception
    {
        return created;
    }

    /**
     * 
     * @return
     *     The date of the domain modification
     */
    public Date getUpdated()
        throws Exception
    {
        return updated;
    }

    /**
     * 
     * @return
     *     When domain was removed from Cytomine
     */
    public Date getDeleted()
        throws Exception
    {
        return deleted;
    }

    /**
     * 
     * @return
     *     The annotation id
     */
    public Long getAnnotationIdent()
        throws Exception
    {
        return annotationIdent;
    }

    /**
     * 
     * @param annotationIdent
     *     The annotation id
     */
    public void setAnnotationIdent(Long annotationIdent)
        throws Exception
    {
        this.annotationIdent = annotationIdent;
    }

    /**
     * 
     * @return
     *     The annotation class type (roi,user,algo,...)
     */
    public String getAnnotationClassName()
        throws Exception
    {
        return annotationClassName;
    }

    /**
     * 
     * @return
     *     The template
     */
    public Long getJobTemplate()
        throws Exception
    {
        return jobTemplate;
    }

    /**
     * 
     * @param jobTemplate
     *     The template
     */
    public void setJobTemplate(Long jobTemplate)
        throws Exception
    {
        this.jobTemplate = jobTemplate;
    }

    public void build(Long annotationIdent, Long jobTemplate)
        throws Exception
    {
        
		this.annotationIdent=annotationIdent;
		this.jobTemplate=jobTemplate;

    
    }

    public void build(JSONObject json)
        throws Exception
    {
        
		this.clazz =JSONUtils.extractJSONString(json.get("class"));
		this.id =JSONUtils.extractJSONLong(json.get("id"));
		this.created =JSONUtils.extractJSONDate(json.get("created"));
		this.updated =JSONUtils.extractJSONDate(json.get("updated"));
		this.deleted =JSONUtils.extractJSONDate(json.get("deleted"));
		this.annotationIdent =JSONUtils.extractJSONLong(json.get("annotationIdent"));
		this.annotationClassName =JSONUtils.extractJSONString(json.get("annotationClassName"));
		this.jobTemplate =JSONUtils.extractJSONLong(json.get("jobTemplate"));

    
    }

    public JSONObject toJSON()
        throws Exception
    {
        
		JSONObject json=new JSONObject();
		json.put("class",JSONUtils.formatJSON(this.clazz));
		json.put("id",JSONUtils.formatJSON(this.id));
		json.put("created",JSONUtils.formatJSON(this.created));
		json.put("updated",JSONUtils.formatJSON(this.updated));
		json.put("deleted",JSONUtils.formatJSON(this.deleted));
		json.put("annotationIdent",JSONUtils.formatJSON(this.annotationIdent));
		json.put("annotationClassName",JSONUtils.formatJSON(this.annotationClassName));
		json.put("jobTemplate",JSONUtils.formatJSON(this.jobTemplate));

		return json;
    
    }

    public static SoftwareProject get(Server server, Long id)
        throws Exception
    {
        
		String path = "/api/softwareproject/{id}.json?";
		path = path.replace("{id}",id+"");

		JSONObject json = server.doGET(path);
		SoftwareProject domain = new SoftwareProject();
		domain.build(json);
		return domain;

    
    }

    public static SoftwareProject listByProject(Server server, Long id, Integer max, Integer offset)
        throws Exception
    {
        
		throw new Exception("Not yet implemented");
    
    }

    public void add(Server server)
        throws Exception
    {
        
		String path = "/api/softwareproject.json?";

		JSONObject json = server.doPOST(path,this.toJSON());

		this.build((JSONObject)json.get("softwareproject"));

    
    }

    public static SoftwareProject list(Server server, Integer max, Integer offset)
        throws Exception
    {
        
		throw new Exception("Not yet implemented");
    
    }

    public void delete(Server server)
        throws Exception
    {
        
		String path = "/api/softwareproject/{id}.json?";
		path = path.replace("{id}",getId()+"");

		server.doDELETE(path);
		build(new JSONObject());

    
    }

}
