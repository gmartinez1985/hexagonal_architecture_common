package com.gfmartinez.hexagonalarchitecture.domain.event.publisher;

import com.gfmartinez.hexagonalarchitecture.domain.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {
  void publish(T domainEvent);
}
