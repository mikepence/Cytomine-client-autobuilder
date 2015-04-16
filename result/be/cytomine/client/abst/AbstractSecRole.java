
package be.cytomine.client.abst;

import be.cytomine.client.*;
import java.util.*;
import org.json.simple.*;

import be.cytomine.client.SecRole;
import be.cytomine.client.Server;
import org.json.simple.JSONObject;


/**
 * A user role on the full app (user, admin, guest,...)
 * 
 * @author ClientBuilder (Loïc Rollus)
 * @version 0.1
 * 
 * DO NOT EDIT THIS FILE. THIS IS CODE IS BUILD AUTOMATICALY. ALL CHANGE WILL BE LOST AFTER NEXT GENERATION.
 * 
 * IF YOU WANT TO EDIT A DOMAIN FILE (change method, add property,...), JUST EDIT THE CHILD FILE “YourDomain.java” instead of this file “AbstractYourDomain.java”. I WON'T BE CLEAR IF IT ALREADY EXIST.
 * 
 */
public abstract class AbstractSecRole
    extends AbstractDomain
{

    /**
     * The role name
     * 
     */
    protected String authority;

    /**
     * 
     * @return
     *     The role name
     */
    public String getAuthority()
        throws Exception
    {
        return authority;
    }

    /**
     * 
     * @param authority
     *     The role name
     */
    public void setAuthority(String authority)
        throws Exception
    {
        this.authority = authority;
    }

    public void build(String authority)
        throws Exception
    {
        
		this.authority=authority;

    
    }

    public void build(JSONObject json)
        throws Exception
    {
        
		this.authority =JSONUtils.extractJSONString(json.get("authority"));

    
    }

    public JSONObject toJSON()
        throws Exception
    {
        
		JSONObject json=new JSONObject();
		json.put("authority",JSONUtils.formatJSON(this.authority));

		return json;
    
    }

    public static SecRole get(Server server, Long id)
        throws Exception
    {
        
		String path = "/api/role/{id}.json?";
		path = path.replace("{id}",id+"");

		JSONObject json = server.doGET(path);
		SecRole domain = new SecRole();
		domain.build(json);
		return domain;

    
    }

    public static SecRole list(Server server, Integer max, Integer offset)
        throws Exception
    {
        
		throw new Exception("Not yet implemented");
    
    }

}