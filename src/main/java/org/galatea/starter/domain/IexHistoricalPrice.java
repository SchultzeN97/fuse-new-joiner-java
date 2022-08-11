package org.galatea.starter.domain;

import java.util.Date;
import java.math.BigDecimal;
import lombok.Data;
import lombok.Builder;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@RequiredArgsConstructor

public class IexHistoricalPrice {
    private String symbol;
    private BigDecimal close;
    private BigDecimal high;
    private BigDecimal low;
    private BigDecimal open;
    private Long volume;
    private Date date;


}

