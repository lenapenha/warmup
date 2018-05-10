package br.com.warmup.auth.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Authority implements Serializable {
	
	private static final long serialVersionUID = 167522347606022899L;

	@Id
    @NotNull
    @Size(min = 0, max = 50)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
