package com.pulumi.automation;

public class CmdResult {

    private final Integer code;
    private final String standardOutput;
    private final String standardError;

    public CmdResult(Integer code, String standardOutput, String standardError) {
        this.code = code;
        this.standardOutput = standardOutput;
        this.standardError = standardError;
    }

    public Integer getCode() {
        return code;
    }

    public String getStandardOutput() {
        return standardOutput;
    }

    public String getStandardError() {
        return standardError;
    }
}
