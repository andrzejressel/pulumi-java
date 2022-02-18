// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2FileSetResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2CloudStorageOptionsResponse {
    /**
     * Max number of bytes to scan from a file. If a scanned file's size is bigger than this value then the rest of the bytes are omitted. Only one of bytes_limit_per_file and bytes_limit_per_file_percent can be specified. Cannot be set if de-identification is requested.
     * 
     */
    private final String bytesLimitPerFile;
    /**
     * Max percentage of bytes to scan from a file. The rest are omitted. The number of bytes scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0. Only one of bytes_limit_per_file and bytes_limit_per_file_percent can be specified. Cannot be set if de-identification is requested.
     * 
     */
    private final Integer bytesLimitPerFilePercent;
    /**
     * The set of one or more files to scan.
     * 
     */
    private final GooglePrivacyDlpV2FileSetResponse fileSet;
    /**
     * List of file type groups to include in the scan. If empty, all files are scanned and available data format processors are applied. In addition, the binary content of the selected files is always scanned as well. Images are scanned only as binary if the specified region does not support image inspection and no file_types were specified. Image inspection is restricted to 'global', 'us', 'asia', and 'europe'.
     * 
     */
    private final List<String> fileTypes;
    /**
     * Limits the number of files to scan to this percentage of the input FileSet. Number of files scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0.
     * 
     */
    private final Integer filesLimitPercent;
    private final String sampleMethod;

    @OutputCustomType.Constructor({"bytesLimitPerFile","bytesLimitPerFilePercent","fileSet","fileTypes","filesLimitPercent","sampleMethod"})
    private GooglePrivacyDlpV2CloudStorageOptionsResponse(
        String bytesLimitPerFile,
        Integer bytesLimitPerFilePercent,
        GooglePrivacyDlpV2FileSetResponse fileSet,
        List<String> fileTypes,
        Integer filesLimitPercent,
        String sampleMethod) {
        this.bytesLimitPerFile = Objects.requireNonNull(bytesLimitPerFile);
        this.bytesLimitPerFilePercent = Objects.requireNonNull(bytesLimitPerFilePercent);
        this.fileSet = Objects.requireNonNull(fileSet);
        this.fileTypes = Objects.requireNonNull(fileTypes);
        this.filesLimitPercent = Objects.requireNonNull(filesLimitPercent);
        this.sampleMethod = Objects.requireNonNull(sampleMethod);
    }

    /**
     * Max number of bytes to scan from a file. If a scanned file's size is bigger than this value then the rest of the bytes are omitted. Only one of bytes_limit_per_file and bytes_limit_per_file_percent can be specified. Cannot be set if de-identification is requested.
     * 
     */
    public String getBytesLimitPerFile() {
        return this.bytesLimitPerFile;
    }
    /**
     * Max percentage of bytes to scan from a file. The rest are omitted. The number of bytes scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0. Only one of bytes_limit_per_file and bytes_limit_per_file_percent can be specified. Cannot be set if de-identification is requested.
     * 
     */
    public Integer getBytesLimitPerFilePercent() {
        return this.bytesLimitPerFilePercent;
    }
    /**
     * The set of one or more files to scan.
     * 
     */
    public GooglePrivacyDlpV2FileSetResponse getFileSet() {
        return this.fileSet;
    }
    /**
     * List of file type groups to include in the scan. If empty, all files are scanned and available data format processors are applied. In addition, the binary content of the selected files is always scanned as well. Images are scanned only as binary if the specified region does not support image inspection and no file_types were specified. Image inspection is restricted to 'global', 'us', 'asia', and 'europe'.
     * 
     */
    public List<String> getFileTypes() {
        return this.fileTypes;
    }
    /**
     * Limits the number of files to scan to this percentage of the input FileSet. Number of files scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0.
     * 
     */
    public Integer getFilesLimitPercent() {
        return this.filesLimitPercent;
    }
    public String getSampleMethod() {
        return this.sampleMethod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CloudStorageOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bytesLimitPerFile;
        private Integer bytesLimitPerFilePercent;
        private GooglePrivacyDlpV2FileSetResponse fileSet;
        private List<String> fileTypes;
        private Integer filesLimitPercent;
        private String sampleMethod;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CloudStorageOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bytesLimitPerFile = defaults.bytesLimitPerFile;
    	      this.bytesLimitPerFilePercent = defaults.bytesLimitPerFilePercent;
    	      this.fileSet = defaults.fileSet;
    	      this.fileTypes = defaults.fileTypes;
    	      this.filesLimitPercent = defaults.filesLimitPercent;
    	      this.sampleMethod = defaults.sampleMethod;
        }

        public Builder setBytesLimitPerFile(String bytesLimitPerFile) {
            this.bytesLimitPerFile = Objects.requireNonNull(bytesLimitPerFile);
            return this;
        }

        public Builder setBytesLimitPerFilePercent(Integer bytesLimitPerFilePercent) {
            this.bytesLimitPerFilePercent = Objects.requireNonNull(bytesLimitPerFilePercent);
            return this;
        }

        public Builder setFileSet(GooglePrivacyDlpV2FileSetResponse fileSet) {
            this.fileSet = Objects.requireNonNull(fileSet);
            return this;
        }

        public Builder setFileTypes(List<String> fileTypes) {
            this.fileTypes = Objects.requireNonNull(fileTypes);
            return this;
        }

        public Builder setFilesLimitPercent(Integer filesLimitPercent) {
            this.filesLimitPercent = Objects.requireNonNull(filesLimitPercent);
            return this;
        }

        public Builder setSampleMethod(String sampleMethod) {
            this.sampleMethod = Objects.requireNonNull(sampleMethod);
            return this;
        }

        public GooglePrivacyDlpV2CloudStorageOptionsResponse build() {
            return new GooglePrivacyDlpV2CloudStorageOptionsResponse(bytesLimitPerFile, bytesLimitPerFilePercent, fileSet, fileTypes, filesLimitPercent, sampleMethod);
        }
    }
}
