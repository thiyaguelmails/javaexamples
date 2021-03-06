package com.example.ws.resource;

import javax.ws.rs.Path;

@Path("features")
public class FeaturesResource {
    
    @Path("cache")
    public CacheFeaturesResource getCacheFeatures(){
        return new CacheFeaturesResource();
    }
    
    @Path("params")
    public ParamsFeaturesResource getParamsFeatures(){
        return new ParamsFeaturesResource();
    }

    @Path("paths")
    public PathFeaturesResource getPathFeatures(){
        return new PathFeaturesResource();
    }
    
    @Path("media-type")
    public MediaTypeResource getMediaTypeFeatures(){
        return new MediaTypeResource();
    }
    
    @Path("exception")
    public ExceptionMapResource getExceptionMapResource(){
    	return new ExceptionMapResource();
    }
    
    @Path("uris")
    public UrisResource getUrisFeatures(){
        return new UrisResource();
    }
    
    @Path("handlers")
    public HandlersResource getHandlersFeatures(){
        return new HandlersResource();
    }
    
    @Path("async")
    public AsyncResponseResource getAsyncResponseResource(){
        return new AsyncResponseResource();
    }
    
    @Path("confidential")
    public ConfidentialResource getConfidential(){
    	return new ConfidentialResource();
    }
    
}
