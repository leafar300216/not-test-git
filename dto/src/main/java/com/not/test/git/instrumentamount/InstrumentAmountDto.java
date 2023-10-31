package com.not.test.git.instrumentamount;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Data
@Builder
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class InstrumentAmountDto {

    UUID id;
    String instrumentId;
    Double amount;
}
