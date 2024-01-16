package com.gfmartinez.hexagonalarchitecture.domain.entity;

import java.util.Objects;

/**
 * Abstract class serving as a base for domain entities according to Domain-Driven Design (DDD).
 * Entities representing the core business objects of the domain should extend this class.
 *
 * @param <ID> Type of the identifier for the entity.
 * @author gfmartinez
 * @since 28/12/2023
 */
public abstract class BaseEntity<ID> {
  protected ID id;

  /**
   * Retrieves the identifier of the entity.
   *
   * @return The identifier of the entity.
   */
  public ID getId() {
    return id;
  }

  /**
   * Sets the identifier of the entity.
   *
   * @param id The identifier to be set for the entity.
   */
  public void setId(ID id) {
    this.id = id;
  }

  /**
   * Compares this entity with another object for equality.
   *
   * @param o The object to compare with this entity.
   * @return True if the objects are equal, false otherwise.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseEntity<?> that = (BaseEntity<?>) o;
    return Objects.equals(id, that.id);
  }

  /**
   * Generates a hash code value for this entity based on its identifier.
   *
   * @return The hash code value for this entity.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
