// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * How this data should be plotted on the chart.
     * 
     */
    @EnumType
    public enum DataSetPlotType {
        /**
         * Plot type is unspecified. The view will default to LINE.
         * 
         */
        PlotTypeUnspecified("PLOT_TYPE_UNSPECIFIED"),
        /**
         * The data is plotted as a set of lines (one line per series).
         * 
         */
        Line("LINE"),
        /**
         * The data is plotted as a set of filled areas (one area per series), with the areas stacked vertically (the base of each area is the top of its predecessor, and the base of the first area is the X axis). Since the areas do not overlap, each is filled with a different opaque color.
         * 
         */
        StackedArea("STACKED_AREA"),
        /**
         * The data is plotted as a set of rectangular boxes (one box per series), with the boxes stacked vertically (the base of each box is the top of its predecessor, and the base of the first box is the X axis). Since the boxes do not overlap, each is filled with a different opaque color.
         * 
         */
        StackedBar("STACKED_BAR"),
        /**
         * The data is plotted as a heatmap. The series being plotted must have a DISTRIBUTION value type. The value of each bucket in the distribution is displayed as a color. This type is not currently available in the Stackdriver Monitoring application.
         * 
         */
        Heatmap("HEATMAP");

        private final String value;

        DataSetPlotType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DataSetPlotType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
