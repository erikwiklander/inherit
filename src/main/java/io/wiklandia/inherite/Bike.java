package io.wiklandia.inherite;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.hateoas.core.Relation;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
//@Relation(value = "base", collectionRelation = "bases")
@RestResource(path = "base")
public class Bike extends Base {
    private String bikeValue;
}
