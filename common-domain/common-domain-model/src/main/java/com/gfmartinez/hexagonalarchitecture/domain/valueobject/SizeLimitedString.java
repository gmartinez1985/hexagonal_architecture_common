package com.gfmartinez.hexagonalarchitecture.domain.valueobject;

import com.gfmartinez.hexagonalarchitecture.domain.exception.StringExceedsMaxLengthException;

/**
 * Represents a value object for a string with a maximum length constraint.
 * Extends BaseString to ensure basic string validation.
 *
 * @author gfmartinez
 * @since 28/12/2023
 * @see BaseString
 */
public abstract class SizeLimitedString extends BaseString {
  /**
   * Creates a SizeLimitedString object with a maximum length constraint.
   *
   * @param value     the string value to be validated
   * @param maxLength the maximum allowed length for the string value
   * @throws StringExceedsMaxLengthException if the string value exceeds the maximum length
   */
  protected SizeLimitedString(String value, int maxLength) {
    super(value);
    validate(value.length(), maxLength);
  }

  /**
   * Validates the length of the string against the provided maximum length.
   *
   * @param stringLength the length of the string value
   * @param maxLength    the maximum allowed length for the string value
   * @throws StringExceedsMaxLengthException if the string value exceeds the maximum length
   */
  private void validate(int stringLength, int maxLength) {
    if (stringLength > maxLength) {
      throw new StringExceedsMaxLengthException("String value exceeds the maximum length of " + maxLength);
    }
  }
}
