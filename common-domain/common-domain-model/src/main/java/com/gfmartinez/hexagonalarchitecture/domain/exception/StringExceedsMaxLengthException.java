package com.gfmartinez.hexagonalarchitecture.domain.exception;

public class StringExceedsMaxLengthException extends IllegalArgumentException {
  public StringExceedsMaxLengthException(String message) {
    super(message);
  }
}
