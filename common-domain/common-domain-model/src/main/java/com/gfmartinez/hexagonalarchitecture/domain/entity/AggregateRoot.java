package com.gfmartinez.hexagonalarchitecture.domain.entity;

/**
 * Abstract class serving as a marker for identifying an Aggregate Root in Domain-Driven Design (DDD).
 * Aggregate Roots are entities that define consistency and transactional boundaries within the domain model.
 * Classes extending this abstract class signify their role as an Aggregate Root.
 *
 * @param <ID> Type of the identifier for the aggregate root.
 * @author gfmartinez
 * @since 28/12/2023
 * @see BaseEntity
 */
public abstract class AggregateRoot<ID> extends BaseEntity<ID> {

}
