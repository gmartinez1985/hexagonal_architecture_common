package com.gfmartinez.hexagonalarchitecture.domain.valueobject;

import com.gfmartinez.hexagonalarchitecture.domain.exception.InvalidNonNegativeNumberException;

/**
 * Represents a value object that encapsulates basic non-negative number functionality and validation.
 *
 * @param <T> Type of the encapsulated number value (Byte, Double, Float, Integer, Long, Short, etc.).
 * @author gfmartinez
 * @since 28/12/2023
 */
public abstract class BaseNonNegativeNumber<T extends Number> {
  /**
   * The encapsulated numeric value.
   */
  protected T value;

  /**
   * Constructs a BaseNonNegativeNumber object with the provided number value after validation.
   *
   * @param value The number value to be encapsulated.
   * @throws InvalidNonNegativeNumberException If the provided number is null or negative.
   */
  protected BaseNonNegativeNumber(T value) {
    this.value = value;
    validate(value);
  }

  /**
   * Validates the provided number value to ensure it is neither null nor negative.
   *
   * @param value the number value to be validated
   * @throws InvalidNonNegativeNumberException if the provided value is null or negative
   */
  private void validate(T value) {
    if (value == null || value.doubleValue() < 0) {
      throw new InvalidNonNegativeNumberException("Number value must be non-null and non-negative");
    }
  }

  /**
   * Retrieves the encapsulated number value.
   *
   * @return The number value.
   */
  public T getValue() {
    return value;
  }
}
