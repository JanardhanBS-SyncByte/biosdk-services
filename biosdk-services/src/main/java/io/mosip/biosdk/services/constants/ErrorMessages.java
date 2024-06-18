package io.mosip.biosdk.services.constants;

/**
 * Enum representing various error messages for the MOSIP Biometric SDK service.
 * Each enum constant has an associated error message.
 * <p>
 * This enum is used to standardize the error messages returned by the service.
 * </p>
 *
 * <pre>
 * {@code
 * public enum ErrorMessages {
 *     NO_BIOSDK_PROVIDER_FOUND("No BioSDK provider found with the given version"),
 *     BIOSDK_LIB_EXCEPTION("Exception thrown by BioSDK library"),
 *     INVALID_REQUEST_BODY("Unable to parse request body"),
 *     UNCHECKED_EXCEPTION("UNCHECKED_EXCEPTION");
 * }
 * </pre>
 *
 * @since 1.0
 */
public enum ErrorMessages {
    /**
     * Indicates that no BioSDK provider was found with the given version.
     */
    NO_BIOSDK_PROVIDER_FOUND("No BioSDK provider found with the given version"),
    
    /**
     * Indicates that an exception was thrown by the BioSDK library.
     */
    BIOSDK_LIB_EXCEPTION("Exception thrown by BioSDK library"),
    
    /**
     * Indicates that the request body could not be parsed.
     */
    INVALID_REQUEST_BODY("Unable to parse request body"),
    
    /**
     * Indicates that an unchecked exception occurred.
     */
    UNCHECKED_EXCEPTION("UNCHECKED_EXCEPTION");

    private final String message;

    /**
     * Constructs a new {@code ErrorMessages} with the specified error message.
     *
     * @param message the error message associated with the error type.
     */
    private ErrorMessages(String message) {
        this.message = message;
    }

    /**
     * Returns the error message associated with the error type.
     *
     * @return the error message.
     */
    public String getMessage() {
        return message;
    }
}