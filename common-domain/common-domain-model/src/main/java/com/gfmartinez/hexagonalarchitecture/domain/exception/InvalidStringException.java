package com.gfmartinez.hexagonalarchitecture.domain.exception;

public class InvalidStringException extends IllegalArgumentException {
  public InvalidStringException(String message) {
    super(message);
  }
}
