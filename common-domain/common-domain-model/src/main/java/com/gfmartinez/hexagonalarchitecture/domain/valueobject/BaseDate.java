package com.gfmartinez.hexagonalarchitecture.domain.valueobject;

import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * A value object representing a date and time using ZonedDateTime.
 * <p>
 * This abstract class provides encapsulation and basic operations for working with date and time values.
 * Instances of this class represent specific moments in time and facilitate comparison and manipulation of date and time values.
 *
 * @author gfmartinez
 * @since 28/12/2023
 */
public abstract class BaseDate {
  /**
   * The encapsulated ZonedDateTime value.
   */
  protected final ZonedDateTime value;

  /**
   * Constructs a BaseDate object representing the current date and time.
   */
  protected BaseDate() {
    this.value = ZonedDateTime.now();
  }

  /**
   * Retrieves the encapsulated ZonedDateTime value.
   *
   * @return The ZonedDateTime value.
   */
  public ZonedDateTime getValue() {
    return value;
  }

  /**
   * Checks if this BaseDate is before another BaseDate.
   *
   * @param otherValue The other BaseDate to compare against.
   * @return true if this BaseDate is before the other BaseDate, false otherwise.
   */
  public boolean isBefore(BaseDate otherValue) {
    return this.value.isBefore(otherValue.value);
  }

  /**
   * Checks if this BaseDate is after another BaseDate.
   *
   * @param otherValue The other BaseDate to compare against.
   * @return true if this BaseDate is after the other BaseDate, false otherwise.
   */
  public boolean isAfter(BaseDate otherValue) {
    return this.value.isAfter(otherValue.value);
  }

  /**
   * Returns a string representation of the encapsulated ZonedDateTime value.
   *
   * @return The string representation of the ZonedDateTime value.
   */
  @Override
  public String toString() {
    return value.toString();
  }

  /**
   * Indicates whether some other object is "equal to" this BaseDate.
   *
   * @param obj The reference object with which to compare.
   * @return true if this BaseDate is equal to the obj argument; false otherwise.
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    BaseDate baseDate = (BaseDate) obj;
    return value.equals(baseDate.value);
  }

  /**
   * Returns a hash code value for the BaseDate.
   *
   * @return A hash code value for this object.
   */
  @Override
  public int hashCode() {
    return Objects.hash(value);
  }
}
