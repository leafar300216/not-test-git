package com.not.test.git.factory;


import com.not.test.git.instrumentamount.InstrumentAmountDto;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

import static com.not.test.git.constant.FactoryConstants.AMOUNT;
import static com.not.test.git.constant.FactoryConstants.INSTRUMENT_ID;

@Data
@Builder
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class InstrumentAmountDtoFactory {

    public static InstrumentAmountDto.InstrumentAmountDtoBuilder create(final UUID seed) {
        return InstrumentAmountDto.builder()
                .id(seed)
                .instrumentId(ValueGeneratorUtil.genField(INSTRUMENT_ID, seed))
                .amount(AMOUNT);
    }
}
