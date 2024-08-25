package net.chinatsu.restapi_test.controller.Response;

public class BooksDeleteResponse {
    private String message;

    public BooksDeleteResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
