package com.not.test.git;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
@MappedSuperclass
public class PersistenceObjectModel<T extends PersistenceObjectModelId> {

  @EmbeddedId
  @AttributeOverride(name = "value", column = @Column(name = "id"))
  private T id;
  @Column(nullable = false)
  @CreationTimestamp
  private LocalDateTime createDate;
  @Column(nullable = false)
  @UpdateTimestamp
  private LocalDateTime updateDate;
  @Column
  private LocalDateTime disableDate;
}
