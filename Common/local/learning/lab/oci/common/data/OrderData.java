package local.learning.lab.oci.common.data;

import java.math.BigDecimal;

public record OrderData(
        String      code,
        String      productName,
        BigDecimal  price)
{ }
