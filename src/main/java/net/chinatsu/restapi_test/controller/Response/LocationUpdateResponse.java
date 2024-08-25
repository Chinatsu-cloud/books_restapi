package net.chinatsu.restapi_test.controller.Response;

public class LocationUpdateResponse {
    private String message;
    
    public LocationUpdateResponse(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
