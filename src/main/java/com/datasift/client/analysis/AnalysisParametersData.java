package com.datasift.client.analysis;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AnalysisParametersData {
    @JsonProperty
    protected String interval;
    @JsonProperty
    protected Float span;
    @JsonProperty
    protected Integer threshold;
    @JsonProperty
    protected String target;

    public AnalysisParametersData(String interval, Float span, Integer threshold, String target) {
        this.interval = interval;
        this.span = span;
        this.threshold = threshold;
        this.target = target;
    }

    public String getInterval() { return this.interval; }

    public float getSpan() { return this.span; }

    public int getThreshold() { return this.threshold; }

    public String getTarget() { return this.target; }
}
