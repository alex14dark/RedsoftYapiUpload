package com.redsoft.idea.plugin.yapiv2.schema;

import com.redsoft.idea.plugin.yapiv2.range.DecimalRange;
import com.redsoft.idea.plugin.yapiv2.schema.base.EnumableSchema;
import com.redsoft.idea.plugin.yapiv2.schema.base.SchemaType;
import java.math.BigDecimal;

@SuppressWarnings("unused")
public final class NumberSchema extends EnumableSchema {

    public NumberSchema() {
        super(SchemaType.number);
    }

    private BigDecimal minimum;

    private BigDecimal maximum;

    private Boolean exclusiveMinimum;

    private Boolean exclusiveMaximum;

    public boolean isExclusiveMinimum() {
        return exclusiveMinimum;
    }

    public void setExclusiveMinimum(boolean exclusiveMinimum) {
        this.exclusiveMinimum = exclusiveMinimum;
    }

    public boolean isExclusiveMaximum() {
        return exclusiveMaximum;
    }

    public void setExclusiveMaximum(boolean exclusiveMaximum) {
        this.exclusiveMaximum = exclusiveMaximum;
    }

    public BigDecimal getMinimum() {
        return minimum;
    }

    public void setMinimum(BigDecimal minimum) {
        this.minimum = minimum;
    }

    public BigDecimal getMaximum() {
        return maximum;
    }

    public void setMaximum(BigDecimal maximum) {
        this.maximum = maximum;
    }

    public void setRange(DecimalRange decimalRange) {
        this.minimum = decimalRange.getMin();
        this.maximum = decimalRange.getMax();
    }
}
