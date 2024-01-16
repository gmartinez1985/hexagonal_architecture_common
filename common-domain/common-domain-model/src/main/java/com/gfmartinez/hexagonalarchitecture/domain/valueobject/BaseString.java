package com.gfmartinez.hexagonalarchitecture.domain.valueobject;

import com.gfmartinez.hexagonalarchitecture.domain.exception.InvalidStringException;

/**
 * Represents a value object that encapsulates basic string functionality and validation.
 * This serves as an abstract base for specific string-related value objects.
 *
 * @author gfmartinez
 * @since 28/12/2023
 */
public abstract class BaseString {
  /**
   * The encapsulated string value.
   */
  private final String value;

  /**
   * Constructs a BaseString object with the provided string value after validation.
   *
   * @param value The string value to be encapsulated.
   * @throws InvalidStringException If the provided string is null or empty.
   */
  protected BaseString(String value) {
    this.value = value;
    validate(value);
  }

  /**
   * Validates the provided string value to ensure it is neither null nor empty.
   *
   * @param value the string value to be validated
   * @throws InvalidStringException if the provided value is null or empty
   */
  private void validate(String value) {
    if (value == null || value.trim().isEmpty()) {
      throw new InvalidStringException("String value cannot be null or empty");
    }
  }

  /**
   * Retrieves the encapsulated string value.
   *
   * @return The string value.
   */
  public String getValue() {
    return value;
  }
}
