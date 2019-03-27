package io.wiklandia.inherite;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.hateoas.core.Relation;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
//@Relation(value = "car", collectionRelation = "cars")
@RestResource(path = "base")
public class Car extends Base {

    private String carValue;

}
