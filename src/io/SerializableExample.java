package io;

import java.io.Serializable;

/*
* for send object as binary of streams to save or send from network . integer,String ,ArrayList and ... are Serializable
* */
public class SerializableExample implements Serializable {
    private String username;
   // not save transient fields in serialization
    private transient String password;

    public SerializableExample(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
