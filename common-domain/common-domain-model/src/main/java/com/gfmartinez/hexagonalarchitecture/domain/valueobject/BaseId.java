package com.gfmartinez.hexagonalarchitecture.domain.valueobject;

import java.util.Objects;

/**
 * Abstract class serving as a base for creating value objects representing identifiers.
 *
 * @param <T> Type of the value for the identifier.
 * @author gfmartinez
 * @since 28/12/2023
 */
public abstract class BaseId<T> {
  private final T value;

  /**
   * Constructs a BaseId object with the provided value.
   *
   * @param value The value used to create the identifier.
   */
  protected BaseId(T value) {
    this.value = value;
  }

  /**
   * Retrieves the value of the identifier.
   *
   * @return The value of the identifier.
   */
  public T getValue() {
    return value;
  }

  /**
   * Checks if this identifier is equal to another object.
   *
   * @param o The object to compare with this identifier.
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
    BaseId<?> baseId = (BaseId<?>) o;
    return Objects.equals(value, baseId.value);
  }

  /**
   * Generates a hash code value for this identifier based on its value.
   *
   * @return The hash code value for this identifier.
   */
  @Override
  public int hashCode() {
    return Objects.hash(value);
  }
}
