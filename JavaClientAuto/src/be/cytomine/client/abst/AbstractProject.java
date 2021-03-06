
package be.cytomine.client.abst;

import be.cytomine.client.*;
import java.util.*;
import org.json.simple.*;

import java.util.Date;
import java.util.List;
import be.cytomine.client.Project;
import be.cytomine.client.Server;
import org.json.simple.JSONObject;


/**
 * A project is the main cytomine domain, its a workspace to store images, annotations,...
 * 
 * @author ClientBuilder (Loïc Rollus)
 * @version 0.1
 * 
 * DO NOT EDIT THIS FILE. THIS IS CODE IS BUILD AUTOMATICALY. ALL CHANGE WILL BE LOST AFTER NEXT GENERATION.
 * 
 * IF YOU WANT TO EDIT A DOMAIN FILE (change method, add property,...), JUST EDIT THE CHILD FILE “YourDomain.java” instead of this file “AbstractYourDomain.java”. I WON'T BE CLEAR IF IT ALREADY EXIST.
 * 
 */
public abstract class AbstractProject
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
     * The name of the project
     * 
     */
    protected String name;
    /**
     * The ontology identifier of the project
     * 
     */
    protected Long ontology;
    /**
     * The ontology name for the project
     * 
     */
    protected String ontologyName;
    /**
     * The discipline identifier of the project
     * 
     */
    protected Long discipline;
    /**
     * Blind mode (if true, image filename are hidden)
     * 
     */
    protected Boolean blindMode;
    /**
     * The discipline name for the project
     * 
     */
    protected String disciplineName;
    /**
     * The number of samples in the project
     * 
     */
    protected Long numberOfSlides;
    /**
     * Number of image in the project
     * 
     */
    protected Long numberOfImages;
    /**
     * Number of annotations created by human user in the project
     * 
     */
    protected Long numberOfAnnotations;
    /**
     * Number of annotations created by software in the project
     * 
     */
    protected Long numberOfJobAnnotations;
    /**
     * List all projects id that are used for retrieval search (if retrievalDisable = false and retrievalAllOntology = false)
     * 
     */
    protected List retrievalProjects;
    /**
     * Number of annotations validated in the project
     * 
     */
    protected Long numberOfReviewedAnnotations;
    /**
     * If true, don't suggest similar annotations
     * 
     */
    protected Boolean retrievalDisable;
    /**
     * If true, search similar annotations on all project that share the same ontology
     * 
     */
    protected Boolean retrievalAllOntology;
    /**
     * If true, project is closed
     * 
     */
    protected Boolean isClosed;
    /**
     * If true, project is in read only mode
     * 
     */
    protected Boolean isReadOnly;
    /**
     * If true, an user (which is not an administrator of the project) cannot see others users layers
     * 
     */
    protected Boolean hideUsersLayers;
    /**
     * If true, an user (which is not an administrator of the project) cannot see admins layers
     * 
     */
    protected Boolean hideAdminsLayers;
    /**
     * Admins id that will be in the project
     * 
     */
    protected List admins;
    /**
     * Users id that will be in the project
     * 
     */
    protected List users;

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
     *     The name of the project
     */
    public String getName()
        throws Exception
    {
        return name;
    }

    /**
     * 
     * @param name
     *     The name of the project
     */
    public void setName(String name)
        throws Exception
    {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The ontology identifier of the project
     */
    public Long getOntology()
        throws Exception
    {
        return ontology;
    }

    /**
     * 
     * @param ontology
     *     The ontology identifier of the project
     */
    public void setOntology(Long ontology)
        throws Exception
    {
        this.ontology = ontology;
    }

    /**
     * 
     * @return
     *     The ontology name for the project
     */
    public String getOntologyName()
        throws Exception
    {
        return ontologyName;
    }

    /**
     * 
     * @return
     *     The discipline identifier of the project
     */
    public Long getDiscipline()
        throws Exception
    {
        return discipline;
    }

    /**
     * 
     * @param discipline
     *     The discipline identifier of the project
     */
    public void setDiscipline(Long discipline)
        throws Exception
    {
        this.discipline = discipline;
    }

    /**
     * 
     * @return
     *     Blind mode (if true, image filename are hidden)
     */
    public Boolean getBlindMode()
        throws Exception
    {
        return blindMode;
    }

    /**
     * 
     * @param blindMode
     *     Blind mode (if true, image filename are hidden)
     */
    public void setBlindMode(Boolean blindMode)
        throws Exception
    {
        this.blindMode = blindMode;
    }

    /**
     * 
     * @return
     *     The discipline name for the project
     */
    public String getDisciplineName()
        throws Exception
    {
        return disciplineName;
    }

    /**
     * 
     * @return
     *     The number of samples in the project
     */
    public Long getNumberOfSlides()
        throws Exception
    {
        return numberOfSlides;
    }

    /**
     * 
     * @return
     *     Number of image in the project
     */
    public Long getNumberOfImages()
        throws Exception
    {
        return numberOfImages;
    }

    /**
     * 
     * @return
     *     Number of annotations created by human user in the project
     */
    public Long getNumberOfAnnotations()
        throws Exception
    {
        return numberOfAnnotations;
    }

    /**
     * 
     * @return
     *     Number of annotations created by software in the project
     */
    public Long getNumberOfJobAnnotations()
        throws Exception
    {
        return numberOfJobAnnotations;
    }

    /**
     * 
     * @return
     *     List all projects id that are used for retrieval search (if retrievalDisable = false and retrievalAllOntology = false)
     */
    public List getRetrievalProjects()
        throws Exception
    {
        return retrievalProjects;
    }

    /**
     * 
     * @param retrievalProjects
     *     List all projects id that are used for retrieval search (if retrievalDisable = false and retrievalAllOntology = false)
     */
    public void setRetrievalProjects(List retrievalProjects)
        throws Exception
    {
        this.retrievalProjects = retrievalProjects;
    }

    /**
     * 
     * @return
     *     Number of annotations validated in the project
     */
    public Long getNumberOfReviewedAnnotations()
        throws Exception
    {
        return numberOfReviewedAnnotations;
    }

    /**
     * 
     * @return
     *     If true, don't suggest similar annotations
     */
    public Boolean getRetrievalDisable()
        throws Exception
    {
        return retrievalDisable;
    }

    /**
     * 
     * @param retrievalDisable
     *     If true, don't suggest similar annotations
     */
    public void setRetrievalDisable(Boolean retrievalDisable)
        throws Exception
    {
        this.retrievalDisable = retrievalDisable;
    }

    /**
     * 
     * @return
     *     If true, search similar annotations on all project that share the same ontology
     */
    public Boolean getRetrievalAllOntology()
        throws Exception
    {
        return retrievalAllOntology;
    }

    /**
     * 
     * @param retrievalAllOntology
     *     If true, search similar annotations on all project that share the same ontology
     */
    public void setRetrievalAllOntology(Boolean retrievalAllOntology)
        throws Exception
    {
        this.retrievalAllOntology = retrievalAllOntology;
    }

    /**
     * 
     * @return
     *     If true, project is closed
     */
    public Boolean getIsClosed()
        throws Exception
    {
        return isClosed;
    }

    /**
     * 
     * @param isClosed
     *     If true, project is closed
     */
    public void setIsClosed(Boolean isClosed)
        throws Exception
    {
        this.isClosed = isClosed;
    }

    /**
     * 
     * @return
     *     If true, project is in read only mode
     */
    public Boolean getIsReadOnly()
        throws Exception
    {
        return isReadOnly;
    }

    /**
     * 
     * @param isReadOnly
     *     If true, project is in read only mode
     */
    public void setIsReadOnly(Boolean isReadOnly)
        throws Exception
    {
        this.isReadOnly = isReadOnly;
    }

    /**
     * 
     * @return
     *     If true, an user (which is not an administrator of the project) cannot see others users layers
     */
    public Boolean getHideUsersLayers()
        throws Exception
    {
        return hideUsersLayers;
    }

    /**
     * 
     * @param hideUsersLayers
     *     If true, an user (which is not an administrator of the project) cannot see others users layers
     */
    public void setHideUsersLayers(Boolean hideUsersLayers)
        throws Exception
    {
        this.hideUsersLayers = hideUsersLayers;
    }

    /**
     * 
     * @return
     *     If true, an user (which is not an administrator of the project) cannot see admins layers
     */
    public Boolean getHideAdminsLayers()
        throws Exception
    {
        return hideAdminsLayers;
    }

    /**
     * 
     * @param hideAdminsLayers
     *     If true, an user (which is not an administrator of the project) cannot see admins layers
     */
    public void setHideAdminsLayers(Boolean hideAdminsLayers)
        throws Exception
    {
        this.hideAdminsLayers = hideAdminsLayers;
    }

    /**
     * 
     * @param admins
     *     Admins id that will be in the project
     */
    public void setAdmins(List admins)
        throws Exception
    {
        this.admins = admins;
    }

    /**
     * 
     * @param users
     *     Users id that will be in the project
     */
    public void setUsers(List users)
        throws Exception
    {
        this.users = users;
    }

    public void build(String name, Long ontology, Boolean retrievalDisable, Boolean retrievalAllOntology, List admins, List users)
        throws Exception
    {
        
		this.name=name;
		this.ontology=ontology;
		this.retrievalDisable=retrievalDisable;
		this.retrievalAllOntology=retrievalAllOntology;
		this.admins=admins;
		this.users=users;

    
    }

    public void build(JSONObject json)
        throws Exception
    {
        
		this.clazz =JSONUtils.extractJSONString(json.get("class"));
		this.id =JSONUtils.extractJSONLong(json.get("id"));
		this.created =JSONUtils.extractJSONDate(json.get("created"));
		this.updated =JSONUtils.extractJSONDate(json.get("updated"));
		this.deleted =JSONUtils.extractJSONDate(json.get("deleted"));
		this.name =JSONUtils.extractJSONString(json.get("name"));
		this.ontology =JSONUtils.extractJSONLong(json.get("ontology"));
		this.ontologyName =JSONUtils.extractJSONString(json.get("ontologyName"));
		this.discipline =JSONUtils.extractJSONLong(json.get("discipline"));
		this.blindMode =JSONUtils.extractJSONBoolean(json.get("blindMode"));
		this.disciplineName =JSONUtils.extractJSONString(json.get("disciplineName"));
		this.numberOfSlides =JSONUtils.extractJSONLong(json.get("numberOfSlides"));
		this.numberOfImages =JSONUtils.extractJSONLong(json.get("numberOfImages"));
		this.numberOfAnnotations =JSONUtils.extractJSONLong(json.get("numberOfAnnotations"));
		this.numberOfJobAnnotations =JSONUtils.extractJSONLong(json.get("numberOfJobAnnotations"));
		this.retrievalProjects =JSONUtils.extractJSONList(json.get("retrievalProjects"));
		this.numberOfReviewedAnnotations =JSONUtils.extractJSONLong(json.get("numberOfReviewedAnnotations"));
		this.retrievalDisable =JSONUtils.extractJSONBoolean(json.get("retrievalDisable"));
		this.retrievalAllOntology =JSONUtils.extractJSONBoolean(json.get("retrievalAllOntology"));
		this.isClosed =JSONUtils.extractJSONBoolean(json.get("isClosed"));
		this.isReadOnly =JSONUtils.extractJSONBoolean(json.get("isReadOnly"));
		this.hideUsersLayers =JSONUtils.extractJSONBoolean(json.get("hideUsersLayers"));
		this.hideAdminsLayers =JSONUtils.extractJSONBoolean(json.get("hideAdminsLayers"));
		this.admins =JSONUtils.extractJSONList(json.get("admins"));
		this.users =JSONUtils.extractJSONList(json.get("users"));

    
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
		json.put("name",JSONUtils.formatJSON(this.name));
		json.put("ontology",JSONUtils.formatJSON(this.ontology));
		json.put("ontologyName",JSONUtils.formatJSON(this.ontologyName));
		json.put("discipline",JSONUtils.formatJSON(this.discipline));
		json.put("blindMode",JSONUtils.formatJSON(this.blindMode));
		json.put("disciplineName",JSONUtils.formatJSON(this.disciplineName));
		json.put("numberOfSlides",JSONUtils.formatJSON(this.numberOfSlides));
		json.put("numberOfImages",JSONUtils.formatJSON(this.numberOfImages));
		json.put("numberOfAnnotations",JSONUtils.formatJSON(this.numberOfAnnotations));
		json.put("numberOfJobAnnotations",JSONUtils.formatJSON(this.numberOfJobAnnotations));
		json.put("retrievalProjects",JSONUtils.formatJSON(this.retrievalProjects));
		json.put("numberOfReviewedAnnotations",JSONUtils.formatJSON(this.numberOfReviewedAnnotations));
		json.put("retrievalDisable",JSONUtils.formatJSON(this.retrievalDisable));
		json.put("retrievalAllOntology",JSONUtils.formatJSON(this.retrievalAllOntology));
		json.put("isClosed",JSONUtils.formatJSON(this.isClosed));
		json.put("isReadOnly",JSONUtils.formatJSON(this.isReadOnly));
		json.put("hideUsersLayers",JSONUtils.formatJSON(this.hideUsersLayers));
		json.put("hideAdminsLayers",JSONUtils.formatJSON(this.hideAdminsLayers));

		return json;
    
    }

    public static Project get(Server server, Long id)
        throws Exception
    {
        
		String path = "/api/project/{id}.json?";
		path = path.replace("{id}",id+"");

		JSONObject json = server.doGET(path);
		Project domain = new Project();
		domain.build(json);
		return domain;

    
    }

    public static Object lastAction(Server server, Long id, Integer max, Integer offset)
        throws Exception
    {
        
		throw new Exception("Not yet implemented");
    
    }

    public static List listLastOpened(Server server)
        throws Exception
    {
        
		String path = "/api/project/method/lastopened.json?";

		JSONArray json = server.doGETList(path);
		List<Project> domains = new ArrayList<Project>();
		for(int i=0;i<json.size();i++) {
			Project domain = new Project();
			domain.build((JSONObject)json.get(i));
			 domains.add(domain);
		 }
		return domains;

    
    }

    public static List listLastOpened(Server server, Integer max, Integer offset)
        throws Exception
    {
        
		String path = "/api/project/method/lastopened.json?";
		path = path + "&max=" + max;
		path = path + "&offset=" + offset;

		JSONArray json = server.doGETList(path);
		List<Project> domains = new ArrayList<Project>();
		for(int i=0;i<json.size();i++) {
			Project domain = new Project();
			domain.build((JSONObject)json.get(i));
			 domains.add(domain);
		 }
		return domains;

    
    }

    public static List listBySoftware(Server server, Long id)
        throws Exception
    {
        
		String path = "/api/software/{id}/project.json?";
		path = path.replace("{id}",id+"");

		JSONArray json = server.doGETList(path);
		List<Project> domains = new ArrayList<Project>();
		for(int i=0;i<json.size();i++) {
			Project domain = new Project();
			domain.build((JSONObject)json.get(i));
			 domains.add(domain);
		 }
		return domains;

    
    }

    public static List listBySoftware(Server server, Long id, Integer max, Integer offset)
        throws Exception
    {
        
		String path = "/api/software/{id}/project.json?";
		path = path.replace("{id}",id+"");
		path = path + "&max=" + max;
		path = path + "&offset=" + offset;

		JSONArray json = server.doGETList(path);
		List<Project> domains = new ArrayList<Project>();
		for(int i=0;i<json.size();i++) {
			Project domain = new Project();
			domain.build((JSONObject)json.get(i));
			 domains.add(domain);
		 }
		return domains;

    
    }

    public static List listByOntology(Server server, Long id)
        throws Exception
    {
        
		String path = "/api/ontology/{id}/project.json?";
		path = path.replace("{id}",id+"");

		JSONArray json = server.doGETList(path);
		List<Project> domains = new ArrayList<Project>();
		for(int i=0;i<json.size();i++) {
			Project domain = new Project();
			domain.build((JSONObject)json.get(i));
			 domains.add(domain);
		 }
		return domains;

    
    }

    public static List listByOntology(Server server, Long id, Integer max, Integer offset)
        throws Exception
    {
        
		String path = "/api/ontology/{id}/project.json?";
		path = path.replace("{id}",id+"");
		path = path + "&max=" + max;
		path = path + "&offset=" + offset;

		JSONArray json = server.doGETList(path);
		List<Project> domains = new ArrayList<Project>();
		for(int i=0;i<json.size();i++) {
			Project domain = new Project();
			domain.build((JSONObject)json.get(i));
			 domains.add(domain);
		 }
		return domains;

    
    }

    public static List listByUser(Server server, Long id)
        throws Exception
    {
        
		String path = "/api/user/{id}/project.json?";
		path = path.replace("{id}",id+"");

		JSONArray json = server.doGETList(path);
		List<Project> domains = new ArrayList<Project>();
		for(int i=0;i<json.size();i++) {
			Project domain = new Project();
			domain.build((JSONObject)json.get(i));
			 domains.add(domain);
		 }
		return domains;

    
    }

    public static List listByUser(Server server, Long id, Integer max, Integer offset)
        throws Exception
    {
        
		String path = "/api/user/{id}/project.json?";
		path = path.replace("{id}",id+"");
		path = path + "&max=" + max;
		path = path + "&offset=" + offset;

		JSONArray json = server.doGETList(path);
		List<Project> domains = new ArrayList<Project>();
		for(int i=0;i<json.size();i++) {
			Project domain = new Project();
			domain.build((JSONObject)json.get(i));
			 domains.add(domain);
		 }
		return domains;

    
    }

    public static Object listLightByUser(Server server, Long id, Boolean creator, Boolean admin, Boolean user, Integer max, Integer offset)
        throws Exception
    {
        
		throw new Exception("Not yet implemented");
    
    }

    public static List listRetrieval(Server server, Long id)
        throws Exception
    {
        
		String path = "/api/retrieval/{id}/project.json?";
		path = path.replace("{id}",id+"");

		JSONArray json = server.doGETList(path);
		List<Project> domains = new ArrayList<Project>();
		for(int i=0;i<json.size();i++) {
			Project domain = new Project();
			domain.build((JSONObject)json.get(i));
			 domains.add(domain);
		 }
		return domains;

    
    }

    public static List listRetrieval(Server server, Long id, Integer max, Integer offset)
        throws Exception
    {
        
		String path = "/api/retrieval/{id}/project.json?";
		path = path.replace("{id}",id+"");
		path = path + "&max=" + max;
		path = path + "&offset=" + offset;

		JSONArray json = server.doGETList(path);
		List<Project> domains = new ArrayList<Project>();
		for(int i=0;i<json.size();i++) {
			Project domain = new Project();
			domain.build((JSONObject)json.get(i));
			 domains.add(domain);
		 }
		return domains;

    
    }

    public static Object listCommandHistory(Server server, Long id, Long user, Boolean fullData, Integer max, Integer offset)
        throws Exception
    {
        
		throw new Exception("Not yet implemented");
    
    }

    public void add(Server server)
        throws Exception
    {
        
		String path = "/api/project.json?";

		JSONObject json = server.doPOST(path,this.toJSON());

		this.build((JSONObject)json.get("project"));

    
    }

    public static List list(Server server)
        throws Exception
    {
        
		String path = "/api/project.json?";

		JSONArray json = server.doGETList(path);
		List<Project> domains = new ArrayList<Project>();
		for(int i=0;i<json.size();i++) {
			Project domain = new Project();
			domain.build((JSONObject)json.get(i));
			 domains.add(domain);
		 }
		return domains;

    
    }

    public static List list(Server server, Integer max, Integer offset)
        throws Exception
    {
        
		String path = "/api/project.json?";
		path = path + "&max=" + max;
		path = path + "&offset=" + offset;

		JSONArray json = server.doGETList(path);
		List<Project> domains = new ArrayList<Project>();
		for(int i=0;i<json.size();i++) {
			Project domain = new Project();
			domain.build((JSONObject)json.get(i));
			 domains.add(domain);
		 }
		return domains;

    
    }

    public void delete(Server server)
        throws Exception
    {
        
		String path = "/api/project/{id}.json?";
		path = path.replace("{id}",getId()+"");

		server.doDELETE(path);
		build(new JSONObject());

    
    }

    public void edit(Server server)
        throws Exception
    {
        
		String path = "/api/project/{id}.json?";
		path = path.replace("{id}",getId()+"");

		JSONObject json = server.doPUT(path,this.toJSON());

		this.build((JSONObject)json.get("project"));

    
    }

}
