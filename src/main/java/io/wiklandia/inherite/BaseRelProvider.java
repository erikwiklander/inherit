package io.wiklandia.inherite;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.hateoas.RelProvider;
import org.springframework.hateoas.core.EvoInflectorRelProvider;
import org.springframework.stereotype.Component;

@Slf4j
//@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class BaseRelProvider extends EvoInflectorRelProvider {
    @Override
    public String getCollectionResourceRelFor(final Class<?> type) {
        return super.getCollectionResourceRelFor(Base.class);
    }

    @Override
    public String getItemResourceRelFor(final Class<?> type) {
        return super.getItemResourceRelFor(Base.class);
    }

    @Override
    public boolean supports(final Class<?> delimiter) {
        return Base.class.isAssignableFrom(delimiter);
    }
}
