package com.service.gateway.apigatewayservice.response;

import com.service.gateway.apigatewayservice.dto.MessageResponse;
import com.service.gateway.apigatewayservice.model.User;
import com.service.gateway.apigatewayservice.repository.UserRepository;

import java.util.HashMap;
import java.util.Map;


/**
 * The Class JSONResponse.
 */
public class JSONCustomResponse {

    private User user;
    /** The data. */

    /** The status. */
    private CustomResponseStatus status;

    /** The message. */
    private String message;




    public User getUser(){
        return user;
    }


    public void setUser(User user){
        this.user=user;
    }

    /**
     * Gets the data.
     *
     * @return the data
     */
//    public Map<String, User> getData() {
//        return data;
//    }

    /**
     * Gets the message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Gets the status.
     *
     * @return the status
     */
    public CustomResponseStatus getStatus() {
        return status;
    }

    /**
     * Sets the data.
     *
     * @param data the data
     */
//    public void setData(Map<String, User> data) {
//        this.data = data;
//    }

    /**
     * Sets the message.
     *
     * @param message the new message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Sets the status.
     *
     * @param status the new status
     */
    public void setStatus(CustomResponseStatus status) {
        this.status = status;
    }

}
