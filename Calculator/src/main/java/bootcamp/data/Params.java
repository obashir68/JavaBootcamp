package bootcamp.data;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Params {
    private final BigDecimal x;
    private final BigDecimal y;
    private final String operator;

    public Params(BigDecimal x, BigDecimal y, String operator) {
        this.x = x;
        this.y = y;
        this.operator = operator;
    }

    public BigDecimal getX() {
        return this.x;
    }

    public BigDecimal getY() {
        return this.y;
    }

    public String getOperator() {
        return this.operator;
    }
}
