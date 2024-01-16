package com.gfmartinez.hexagonalarchitecture.domain.event;

/**
 * Marker interface for domain events in the Domain-Driven Design (DDD) context.
 * This interface helps mark an event object with the type of the entity
 * that will trigger or generate this event.
 *
 * @param <T> Type parameter for the domain event representing the entity type.
 * @author gfmartinez
 * @since 28/12/2023
 */
public interface DomainEvent<T> {

}
