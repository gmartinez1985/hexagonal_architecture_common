package com.gfmartinez.hexagonalarchitecture.domain.exception;

public class InvalidNonNegativeNumberException extends IllegalArgumentException {
  public InvalidNonNegativeNumberException(String message) {
    super(message);
  }
}
